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
import com.example.employeepayrollapplication.models.CommissionBasedPartTime;
import com.example.employeepayrollapplication.models.MotorCycle;
import com.example.employeepayrollapplication.models.Singleton;
import com.example.employeepayrollapplication.models.Vehicle;


import org.w3c.dom.Text;

public class CommissionBasedFragment extends Fragment implements PartTimeDataInterface {

    TextView txtId, txtName;
    TextView txtAge;
    TextView txtRatePerHour;
    TextView txtNumberOfHours;
    TextView txtDateOfBirth;
    RadioGroup rgVehicle;

    TextView txtCommission;
    Button btnAddEmployee;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_commission_based, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.txtCommission = view.findViewById(R.id.text_commissionPerc);
        this.btnAddEmployee = view.findViewById(R.id.btn_add_commission_based);
        btnAddEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Singleton.getObj().addIntoList(new CommissionBasedPartTime
                            (id_int, name_string, age_int, commission_int, rate_int, hours_float, vehicle_Vehicle));
                    Toast.makeText(getActivity(), "Employee Added", Toast.LENGTH_LONG).show();
                    txtCommission.setText(null);
                    txtRatePerHour.setText(null);
                    txtNumberOfHours.setText(null);
                    txtName.setText(null);
                    txtAge.setText(null);
                    txtDateOfBirth.setText("DateOfBirth : YYYY/MM/DD");
                    rgVehicle.clearCheck();

                }
                else
                {
                    //show alert dailog
                    Toast.makeText(getActivity(), "No field can be empty and unselected" , Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    @Override
    public void defaultViewsPartTimeFragment(TextView id, TextView name, TextView age, TextView ratePerHour,
                                             TextView numberOfHours, TextView dateOfBirth, RadioGroup vehicle)
    {
        this.txtId = id;
        this.txtName = name;
        this.txtAge = age;
        this.txtRatePerHour = ratePerHour;
        this.txtNumberOfHours = numberOfHours;
        this.txtDateOfBirth = dateOfBirth;
        this.rgVehicle = vehicle;

    }
}