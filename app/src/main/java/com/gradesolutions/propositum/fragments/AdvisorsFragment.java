package com.gradesolutions.propositum.fragments;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdvisorsFragment extends Fragment {


    public AdvisorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_advisors, container, false);
        showToolbar(getResources().getString(R.string.tab_advisors), false, view);
        RecyclerView advisorsRecycler = (RecyclerView) view.findViewById(R.id.advisorsRecyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        advisorsRecycler.setLayoutManager(linearLayoutManager);

        AdvisorsAdapter advisorsAdapter =
                new AdvisorsAdapter(buidAdvisors(), R.layout.cardview_advisors, getActivity());
        advisorsRecycler.setAdapter(advisorsAdapter);


        return view;
    }

    public ArrayList<Advisor> buidAdvisors(){
        ArrayList<Advisor> pictures = new ArrayList<>();
        pictures.add(new Advisor("http://www.novalandtours.com/images/guide/guilin.jpg", "Elvis Raza", "Tecnico titulado"));
        pictures.add(new Advisor("http://www.enjoyart.com/library/landscapes/tuscanlandscapes/large/Tuscan-Bridge--by-Art-Fronckowiak-.jpg", "Kevin Sancho", "Tecnico titulado"));
        pictures.add(new Advisor("http://www.educationquizzes.com/library/KS3-Geography/river-1-1.jpg", "William ", "Tecnico titulado"));
        pictures.add(new Advisor("http://www.novalandtours.com/images/guide/guilin.jpg", "Ana Huaman", "Tecnico titulado"));
        return pictures;
    }

    public void showToolbar(String tittle, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);


    }

}
