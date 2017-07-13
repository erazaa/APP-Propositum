package com.gradesolutions.propositum.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


import com.gradesolutions.propositum.R;
import com.gradesolutions.propositum.fragments.AdvisorsFragment;
import com.gradesolutions.propositum.fragments.ProfileFragment;
import com.gradesolutions.propositum.fragments.RequestFragment;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        ((BottomNavigationView) findViewById(R.id.navigation))
                .setOnNavigationItemSelectedListener(
                        new BottomNavigationView.OnNavigationItemSelectedListener() {
                            @Override
                            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                                return navigateAccordingTo(item.getItemId());
                            }
                        });
        navigateAccordingTo(R.id.navigation_advisors);

    }



    private Fragment getFragmentFor(int id) {
        switch (id) {
            case R.id.navigation_advisors: return new AdvisorsFragment();
            case R.id.navigation_profile: return new ProfileFragment();
            case R.id.navigation_request: return new RequestFragment();
        }
        return null;
    }

    private boolean navigateAccordingTo(int id) {
        try {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content, getFragmentFor(id))
                    .commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
