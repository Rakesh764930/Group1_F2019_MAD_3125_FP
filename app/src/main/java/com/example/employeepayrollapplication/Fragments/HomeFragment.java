package com.example.employeepayrollapplication.Fragments;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.employeepayrollapplication.R;


public class HomeFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.txtDateTime);

        //https://stackoverflow.com/questions/23054875/how-to-display-current-date-and-time-in-textview-inside-of-fragment
        textView.setText("" + DateFormat.format("MMM-dd-yyyy    kk:mm", System.currentTimeMillis()));

        return root;
    }
}