package com.ethan627hsu.wake.wake.editor.routine;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ethan627hsu.wake.wake.R;

public class RoutineConfigFragment extends Fragment {


    public RoutineConfigFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_routine_config, container, false);
    }

}
