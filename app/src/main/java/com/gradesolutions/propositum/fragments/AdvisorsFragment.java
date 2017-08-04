package com.gradesolutions.propositum.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gradesolutions.propositum.R;
import com.gradesolutions.propositum.adapters.AdvisorsAdapter;
import com.gradesolutions.propositum.models.Advisor;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdvisorsFragment extends Fragment {
    private RecyclerView advisorsRecyclerView;
    private AdvisorsAdapter advisorsAdapter;
    private RecyclerView.LayoutManager advisorsLayoutManager;
    private List<Advisor> advisors;

    public AdvisorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_advisors, container, false);
        advisorsRecyclerView = (RecyclerView) view.findViewById(R.id.advisorsRecyclerView);
        advisors = PropoApp.getInstance().getAdvisors();
        advisorsAdapter = (new AdvisorsAdapter()).setAdvisors(advisors);
        advisorsLayoutManager = new LinearLayoutManager(view.getContext());

        advisorsRecyclerView.setAdapter(advisorsAdapter);
        advisorsRecyclerView.setLayoutManager(advisorsLayoutManager);
        showToolbar("Asesores", false, view);

        return view;
    }
    public void showToolbar(String title, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
