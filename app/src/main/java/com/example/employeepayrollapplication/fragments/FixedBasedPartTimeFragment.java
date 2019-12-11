package com.example.employeepayrollapplication.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import com.example.employeepayrollapplication.Interface.PartTimeDataInterface;
import com.example.employeepayrollapplication.R;
import com.example.employeepayrollapplication.models.Car;
import com.example.employeepayrollapplication.models.FixedBasedPartTime;
import com.example.employeepayrollapplication.models.MotorCycle;
import com.example.employeepayrollapplication.models.Singleton;
import com.example.employeepayrollapplication.models.Vehicle;


public class FixedBasedPartTimeFragment extends Fragment implements PartTimeDataInterface {

    TextView name, txtId;
    TextView age, txtDateOfBirth;
    RadioGroup gender;
    TextView ratePerHour;
    TextView numberOfHours;
    TextView dateOfBirth;
    RadioGroup vehicle;

    TextView fixedamount;
    Button btnAddEmployee;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

}

