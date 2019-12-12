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