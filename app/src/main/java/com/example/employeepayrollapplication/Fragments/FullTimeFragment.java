package com.example.employeepayrollapplication.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.employeepayrollapplication.R;
import com.example.employeepayrollapplication.models.FullTime;
import com.example.employeepayrollapplication.models.Singleton;
import com.example.employeepayrollapplication.models.Vehicle;

public class FullTimeFragment extends Fragment implements AddEmployeeInterface {


    TextView name;
    TextView age;
    RadioGroup gender;
    TextView dateOfBirth;
    RadioGroup vehicle;

    TextView salary;
    TextView bonus;
    Button addIntern;


    @Override
    public View onCreateView( LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.full_time_fragment_layout, container, false);

    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        this.salary = view.findViewById(R.id.text_salary);

        this.bonus = view.findViewById(R.id.text_bonus);


        this.addIntern = view.findViewById(R.id.btn_fulltime_employee);
        this.addIntern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if( !bonus.getText().toString().isEmpty()   && !salary.getText().toString().isEmpty() && !name.getText().toString().isEmpty() &&  !age.getText().toString().isEmpty() && !(gender.getCheckedRadioButtonId() == -1)) {


                    String name_string = name.getText().toString();
                    int age_int = Integer.parseInt(age.getText().toString());

                   double salary_int = Double.parseDouble(salary.getText().toString());
                    double bonus_int = Double.parseDouble(bonus.getText().toString());

                    Vehicle vehicle_Vehicle = null;
                    switch (vehicle.getCheckedRadioButtonId()) {
                        case R.id.rbCar:
                            vehicle_Vehicle = new Car("", "", "", 0);
                            break;
                        case R.id.rbMotorCycle:
                            vehicle_Vehicle = new MotorCycle("", "", "", 0);
                            break;

                    }
                    Singleton.getObj().addIntoList(new FullTime(salary_int, bonus_int, name_string, age_int, gender_enum, vehicle_Vehicle));
                    Toast.makeText(getActivity(), "Employee Added", Toast.LENGTH_LONG).show();
                    salary.setText(null);
                    bonus.setText(null);
                    name.setText(null);
                    age.setText(null);
                    dateOfBirth.setText(("DateOfBirth : YYYY/MM/DD"));
                    gender.clearCheck();
                    vehicle.clearCheck();
                }
                else
                {
                    Toast.makeText(getActivity(), "Please enter data in every field " , Toast.LENGTH_SHORT).show();
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
