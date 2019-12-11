package com.example.employeepayrollapplication.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.employeepayrollapplication.Interface.AddEmployeeInterface;
import com.example.employeepayrollapplication.R;
import com.example.employeepayrollapplication.models.Car;
import com.example.employeepayrollapplication.models.FullTime;
import com.example.employeepayrollapplication.models.MotorCycle;
import com.example.employeepayrollapplication.models.Singleton;
import com.example.employeepayrollapplication.models.Vehicle;


public class FullTimeFragment extends Fragment implements AddEmployeeInterface {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_full_time, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }