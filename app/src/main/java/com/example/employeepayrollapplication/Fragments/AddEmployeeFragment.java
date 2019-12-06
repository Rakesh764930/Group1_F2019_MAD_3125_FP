package com.example.employeepayrollapplication.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.employeepayrollapplication.R;

public class AddEmployeeFragment extends Fragment implements View.OnClickListener {

    TextView text_age;
    TextView text_name;
    TextView text_date_of_birth;


    RadioGroup vehicle;
    RadioGroup employementtype;
    FullTimeFragment fullTimeFragment;
    PartTimeFragment partTimeFragment;
    InternFragment internFragment;

    FragmentManager fragmentManager;



    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.add_employee_fragment_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.vehicle = view.findViewById(R.id.rgVehicle);
        this.text_age = view.findViewById(R.id.text_age);
        this.text_name = view.findViewById(R.id.txtVehicle);
        this.fragmentManager = this.getActivity().getSupportFragmentManager();




        this.text_date_of_birth = view.findViewById(R.id.txtDOB);
        this.text_date_of_birth.setText(((String)this.text_date_of_birth.getText()));
        this.text_date_of_birth.setOnClickListener(this) ;



        this.employementtype = view.findViewById(R.id.rgEmpType);
        this.employementtype.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                FragmentTransaction fragmentTransaction;

                switch (checkedId)
                {
                    case R.id.rbParttime :
                        if(AddEmployeeFragment.this.partTimeFragment  == null)
                        {
                            AddEmployeeFragment.this.partTimeFragment = new PartTimeFragment();
                            AddEmployeeFragment.this.partTimeFragment.viewsFromAddEmployeeFragment(text_name, text_age , text_date_of_birth , vehicle);
                        }
                        fragmentTransaction = AddEmployeeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout_employment, AddEmployeeFragment.this.partTimeFragment);
                        fragmentTransaction.commit();
                        Toast.makeText(AddEmployeeFragment.this.getContext(), "parttime" , Toast.LENGTH_LONG).show();
                        break;
                    case R.id.rbFulltime :
                        if(AddEmployeeFragment.this.fullTimeFragment  == null)
                        {
                            AddEmployeeFragment.this.fullTimeFragment = new FullTimeFragment();
                            AddEmployeeFragment.this.fullTimeFragment.viewsFromAddEmployeeFragment(text_name, text_age , text_date_of_birth , vehicle);
                        }
                        fragmentTransaction = AddEmployeeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout_employment, AddEmployeeFragment.this.fullTimeFragment);
                        fragmentTransaction.commit();
                        Toast.makeText(AddEmployeeFragment.this.getContext(), "fulltime" , Toast.LENGTH_LONG).show();
                        break;
                    case R.id.rbIntern :
                        if(AddEmployeeFragment.this.internFragment  == null)
                        {
                            AddEmployeeFragment.this.internFragment = new InternFragment();
                            AddEmployeeFragment.this.internFragment.viewsFromAddEmployeeFragment(text_name, text_age , text_date_of_birth , vehicle);
                        }
                        fragmentTransaction = AddEmployeeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout_employment, AddEmployeeFragment.this.internFragment);
                        fragmentTransaction.commit();
                        Toast.makeText(AddEmployeeFragment.this.getContext(), "intern" , Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });






    }

    @Override
    public void onClick(View v) {
        DatePickerDialogFragment datePickerDialogFragment = new DatePickerDialogFragment();
        datePickerDialogFragment.show(getActivity().getSupportFragmentManager(), "DatePicker");
    }



}
