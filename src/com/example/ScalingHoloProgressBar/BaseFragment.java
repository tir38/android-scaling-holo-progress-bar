package com.example.ScalingHoloProgressBar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class BaseFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_base, parent, false);

        // handle narrow progess bar
        ProgressBar narrowBar = (ProgressBar)v.findViewById(R.id.progress_bar_narrow);
        narrowBar.setMax(200);
        narrowBar.setProgress(100);

        // handle wide progess bar
        ProgressBar wideBar = (ProgressBar)v.findViewById(R.id.progress_bar_wide);
        wideBar.setMax(150);
        wideBar.setProgress(100);
        return v;
    }
}
