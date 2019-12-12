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

                    int id_int = Integer.parseInt(id.getText().toString());
                    String schoolname_string = schoolName.getText().toString();
                    String birthyear_int = txtDateOfBirth.getText().toString();
                    double internSalary_double = Double.parseDouble(internSalary.getText().toString());
                    String name_string = name.getText().toString();
                    int age_int = Integer.parseInt(age.getText().toString().substring(6));
                    Vehicle vehicle_Vehicle = null;
                    switch (vehicle.getCheckedRadioButtonId()) {
                        case R.id.radio_car:
                            vehicle_Vehicle = new Car("",""," ");
                            break;
                        case R.id.radio_motorCycle:
                            vehicle_Vehicle = new MotorCycle("",""," ");
                            break;

                    }
                    Singleton.getObj().addIntoList(new
                            Intern(id_int, name_string, age_int,schoolname_string, vehicle_Vehicle ));
                    Toast.makeText(getActivity(), "Employee Added", Toast.LENGTH_LONG).show();
                    schoolName.setText(null);
                   name.setText(null);
                   age.setText(null);
                    txtDateOfBirth.setText("DateOfBirth : YYYY/MM/DD");
                    vehicle.clearCheck();



                }
