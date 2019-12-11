package com.example.employeepayrollapplication.fragments;

import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.employeepayrollapplication.Interface.EmployeeDetailsInterface;
import com.example.employeepayrollapplication.R;
import com.example.employeepayrollapplication.models.Car;
import com.example.employeepayrollapplication.models.CommissionBasedPartTime;
import com.example.employeepayrollapplication.models.Employee;
import com.example.employeepayrollapplication.models.FixedBasedPartTime;
import com.example.employeepayrollapplication.models.FullTime;
import com.example.employeepayrollapplication.models.Intern;
import com.example.employeepayrollapplication.models.PartTime;
import com.example.employeepayrollapplication.models.Vehicle;

public class EmployeeDetailsFragment extends Fragment implements EmployeeDetailsInterface {
    Employee employee;
    Vehicle vehicle;
    TextView empId;
    TextView name, age, emptype, txtVehicle;
    TextView internSchool;
    CardView vehicle_card;
    TextView txtMileage, txtPlate, txtMake;

    CardView parttime_card;
    CardView fulltime_card;
    CardView intern_card;
    TextView employment_type;
    TextView total_earning;
    Intern intern; FullTime fullTime; CommissionBasedPartTime commissionbasedPartTime; FixedBasedPartTime fixedBasedPartTime;

    private OnFragmentInteractionListener mListener;

    public EmployeeDetailsFragment() {
        // Required empty public constructor
    }

    public static EmployeeDetailsFragment newInstance(String param1, String param2) {
        EmployeeDetailsFragment fragment = new EmployeeDetailsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_employee_details, container, false);
    }

