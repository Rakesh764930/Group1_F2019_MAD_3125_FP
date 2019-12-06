package com.example.employeepayrollapplication.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.employeepayrollapplication.R;

public class PartTimeFragment extends Fragment implements AddEmployeeInterface {



    TextView name;
    TextView age;
    RadioGroup gender;
    TextView dateOfBirth;
    RadioGroup vehicle;

    TextView ratePerHour;
    TextView numberOfHours;


    RadioGroup parttimeType;
    FragmentManager fragmentManager;
    CommissionBasedPartTimeFragment commissionBasedPartTimeFragment;
    FixedBasedPartTimeFragment fixedBasedPartTimeFragment;




    public void viewsFromAddEmployeeFragment(TextView name, TextView age, RadioGroup gender , TextView dateOfBirth , RadioGroup vehicle)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.vehicle = vehicle;
    }




    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.part_time_fragment_layout, container, false);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        this.ratePerHour = view.findViewById(R.id.text_rateper_hour);
        this.numberOfHours = view.findViewById(R.id.text_number_of_hours);

        this.fragmentManager = getActivity().getSupportFragmentManager();

        this.parttimeType = getActivity().findViewById(R.id.radio_group_parttime_type);
        this.parttimeType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                FragmentTransaction fragmentTransaction;
                switch (checkedId) {
                    case R.id.radio_commission_parttime:
                        if (PartTimeFragment.this.commissionBasedPartTimeFragment == null) {
                            PartTimeFragment.this.commissionBasedPartTimeFragment = new CommissionBasedPartTimeFragment();
                            PartTimeFragment.this.commissionBasedPartTimeFragment.viewsFromPartTimeFragment(name, age, gender, ratePerHour, numberOfHours, dateOfBirth, vehicle);
                        }
                        PartTimeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction = PartTimeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout_parttime_type, PartTimeFragment.this.commissionBasedPartTimeFragment);
                        fragmentTransaction.commit();
                        break;

                    case R.id.radio_fix_parttime:
                        if (PartTimeFragment.this.fixedBasedPartTimeFragment == null) {
                            PartTimeFragment.this.fixedBasedPartTimeFragment = new FixedBasedPartTimeFragment();
                            PartTimeFragment.this.fixedBasedPartTimeFragment.viewsFromPartTimeFragment(name, age, ratePerHour, numberOfHours, dateOfBirth, vehicle);
                        }
                        PartTimeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction = PartTimeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout_parttime_type, PartTimeFragment.this);
                        fragmentTransaction.commit();
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
