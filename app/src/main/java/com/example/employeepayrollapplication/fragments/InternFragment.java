package com.example.employeepayrollapplication.fragments;

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

import com.example.employeepayrollapplication.Interface.AddEmployeeInterface;
import com.example.employeepayrollapplication.R;
import com.example.employeepayrollapplication.models.Car;
import com.example.employeepayrollapplication.models.Intern;
import com.example.employeepayrollapplication.models.MotorCycle;
import com.example.employeepayrollapplication.models.Singleton;
import com.example.employeepayrollapplication.models.Vehicle;

public class InternFragment extends Fragment  implements AddEmployeeInterface {
    TextView id;
    TextView name;
    TextView age;
    TextView txtDateOfBirth;
    RadioGroup vehicle;
    TextView schoolName, internSalary;
    Button addIntern;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_intern, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        this.schoolName = view.findViewById(R.id.text_schoolName);
        this.internSalary = view.findViewById(R.id.text_internSalary);

        this.addIntern = view.findViewById(R.id.btn_addIntern);
        this.addIntern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(!schoolName.getText().toString().isEmpty() && !name.getText().toString().isEmpty()
                        &&  !age.getText().toString().isEmpty())
                {
                    
                }
