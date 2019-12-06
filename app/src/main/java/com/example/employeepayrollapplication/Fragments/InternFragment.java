package com.example.employeepayrollapplication.Fragments;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.employeepayrollapplication.R;
import com.example.employeepayrollapplication.models.Intern;
import com.example.employeepayrollapplication.models.Singleton;
import com.example.employeepayrollapplication.models.Vehicle;


public class InternFragment extends Fragment implements AddEmployeeInterface {

    TextView name;
    TextView age;
    TextView dateOfBirth;
    RadioGroup vehicle;
    TextView schoolName;
    Button addIntern;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.intern_fragment_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        name = view.findViewById(R.id.txtName);


        addIntern = view.findViewById(R.id.btn_add_intern);
        addIntern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(!schoolName.getText().toString().isEmpty() && !name.getText().toString().isEmpty() &&  !age.getText().toString().isEmpty() )
                {


                    String school = schoolName.getText().toString();
                    String name1 = name.getText().toString();
                    int age1 = Integer.parseInt(age.getText().toString().substring(6));
                    //int id=Integer.parseInt()
                    Vehicle vehicle_Vehicle = null;
//                    switch (vehicle.getCheckedRadioButtonId()) {
//                        case R.id.rbCar:
//                            vehicle_Vehicle = new Car("", "", "", 0);
//                            break;
//                        case R.id.rbMotorCycle:
//                            vehicle_Vehicle = new MotorCycle("", "", "", 0);
//                            break;
//
//                    }
                    Singleton.getObj().addIntoList(new Intern(1,name1,age1,school));
                    Toast.makeText(getActivity(), "Employee Added", Toast.LENGTH_LONG).show();
                    schoolName.setText(null);
                    name.setText(null);
                    age.setText(null);
                    dateOfBirth.setText(("DateOfBirth : YYYY/MM/DD"));
                   // vehicle.clearCheck();



                }
                else
                {

                    Toast.makeText(getActivity(), "No field can be empty and unselected" , Toast.LENGTH_LONG).show();


                }

            }
        });


    }

    @Override
    public void viewsFromAddEmployeeFragment(TextView name, TextView age,  TextView dateOfBirth , RadioGroup vehicle) {
        this.name = name;
        this.age = age;

        this.dateOfBirth = dateOfBirth;
        this.vehicle = vehicle;
    }
}
