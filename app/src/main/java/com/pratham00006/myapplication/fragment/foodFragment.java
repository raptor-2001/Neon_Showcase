package com.pratham00006.myapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;

import com.pratham00006.myapplication.MainActivity;
import com.pratham00006.myapplication.R;

public class foodFragment extends Fragment {

    ImageButton food,sweets;
    FrameLayout topFrame,container;

    public foodFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_food, container, false);


        return view;
    }
}