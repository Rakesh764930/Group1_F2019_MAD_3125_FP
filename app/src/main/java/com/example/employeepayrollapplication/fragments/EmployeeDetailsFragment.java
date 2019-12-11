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
    Intern intern;
    FullTime fullTime;
    CommissionBasedPartTime commissionbasedPartTime;
    FixedBasedPartTime fixedBasedPartTime;

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

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.empId = view.findViewById(R.id.emp_Id);
        this.name = view.findViewById(R.id.text_name_value);
        this.age = view.findViewById(R.id.text_age_value);
        this.emptype = view.findViewById(R.id.text_employment_type_value);
        this.txtVehicle = view.findViewById(R.id.text_vehicle_value);
        this.parttime_card = view.findViewById(R.id.parttime_card);
        this.fulltime_card = view.findViewById(R.id.fulltime_card);
        this.intern_card = view.findViewById(R.id.intern_card);
        this.employment_type = view.findViewById(R.id.text_emptype_value);
        this.total_earning = view.findViewById(R.id.text_total_earning_val);
        this.txtMake = view.findViewById(R.id.text_make_value);
        this.txtMileage = view.findViewById(R.id.text_model_value);
        this.txtPlate = view.findViewById(R.id.text_plate_value);

        this.name.setText(employee.getName().toUpperCase());
        this.age.setText(employee.getAge() + "");

        this.txtVehicle.setText(employee.getVehicle() == null ? "null" : employee.getVehicle() instanceof Car ? "CAR" : "MOTER CYCLE");
        String make = employee.getVehicle().getMake();
        this.txtMake.setText(make);
        String plate = employee.getVehicle().getPlate();

        this.txtPlate.setText(plate);
        String mileage = (employee.getVehicle().getMileage());
        this.txtMileage.setText(mileage);

    }
}