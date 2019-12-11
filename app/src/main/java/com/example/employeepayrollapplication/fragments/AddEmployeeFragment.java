package com.example.employeepayrollapplication.fragments;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import com.example.employeepayrollapplication.R;

import java.util.Calendar;

public class AddEmployeeFragment extends Fragment implements View.OnClickListener{
    final Calendar calendar = Calendar.getInstance();
    DatePickerDialog datePickerDialog;
    TextView id;
    TextView text_age;
    TextView text_name;
    TextView text_date_of_birth;
    RadioGroup rgVehicle;
    RadioGroup employementtype;
    PartTimeFragment partTimeFragment;
    FullTimeFragment fullTimeFragment ;
    InternFragment internFragment;
    CheckBox checkVehicle;
    LinearLayout layoutVehicle;


    FragmentManager fragmentManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_add_employees, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    

    @Override
    public void onClick(View v) {
        DatePickerFragment dtfragment = new DatePickerFragment();
        dtfragment.show(getActivity().getSupportFragmentManager(), "DatePicker");

    }

}