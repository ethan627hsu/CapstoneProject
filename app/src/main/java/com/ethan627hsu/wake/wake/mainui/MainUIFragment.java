package com.ethan627hsu.wake.wake.mainui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ethan627hsu.wake.wake.R;


public class MainUIFragment extends Fragment {

    public MainUIFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_ui, container, false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
