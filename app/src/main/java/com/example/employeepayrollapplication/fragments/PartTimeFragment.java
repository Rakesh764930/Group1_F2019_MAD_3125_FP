package com.example.employeepayrollapplication.fragments;

import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.employeepayrollapplication.Interface.AddEmployeeInterface;
import com.example.employeepayrollapplication.R;
import com.example.employeepayrollapplication.fragments.CommissionBasedFragment;
import com.example.employeepayrollapplication.fragments.FixedBasedPartTimeFragment;


public class PartTimeFragment extends Fragment implements AddEmployeeInterface {
    TextView id;
    TextView name;
    TextView age;
    TextView dateOfBirth;
    RadioGroup vehicle;
    TextView ratePerHour;
    TextView numberOfHours;
    RadioGroup radioPartTime;
    FragmentManager fragmentManager;
    CommissionBasedFragment commissionBasedFragment;
    FixedBasedPartTimeFragment fixedBasedFragment;

    private OnFragmentInteractionListener mListener;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.ratePerHour = view.findViewById(R.id.text_rateper_hour);
        this.numberOfHours = view.findViewById(R.id.text_number_of_hours);
        this.fragmentManager = getActivity().getSupportFragmentManager();
        this.radioPartTime = getActivity().findViewById(R.id.radio_group_parttime_type);
        this.radioPartTime.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction fragmentTransaction;
                switch (checkedId)
                {
                    case R.id.radio_commission_parttime :
                        if(PartTimeFragment.this.commissionBasedFragment == null)
                        {
                            PartTimeFragment.this.commissionBasedFragment = new CommissionBasedFragment();
                            PartTimeFragment.this.commissionBasedFragment.defaultViewsPartTimeFragment(id,name,age, ratePerHour,numberOfHours, dateOfBirth, vehicle);
                        }
                        PartTimeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction = PartTimeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout_parttime_type, PartTimeFragment.this.commissionBasedFragment);
                        fragmentTransaction.commit();
                        break;

                    case R.id.radio_fix_parttime :
                        if(PartTimeFragment.this.fixedBasedFragment == null)
                        {
                            PartTimeFragment.this.fixedBasedFragment = new FixedBasedPartTimeFragment();
                            PartTimeFragment.this.fixedBasedFragment.defaultViewsPartTimeFragment(id, name,age,ratePerHour, numberOfHours, dateOfBirth, vehicle);
                        }
                        PartTimeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction = PartTimeFragment.this.fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout_parttime_type, PartTimeFragment.this.fixedBasedFragment);
                        fragmentTransaction.commit();
                }
            }
        });
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_part_time, container, false);
    }
    @Override
    public void defaultViewsAddEmployeeFragment(TextView id, TextView name, TextView age, TextView date, RadioGroup vehicle) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfBirth = date;
        this.vehicle = vehicle;
    }


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}