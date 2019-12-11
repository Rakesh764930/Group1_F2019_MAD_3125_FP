package com.example.employeepayrollapplication.fragments;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.employeepayrollapplication.Custom_Adapter.RecyclerViewCustomAdapter;
import com.example.employeepayrollapplication.R;
import com.example.employeepayrollapplication.models.Employee;
import com.example.employeepayrollapplication.models.Singleton;

import java.util.ArrayList;

public class EmployeeFragment extends Fragment {
    ArrayList<Employee> employees_list;
    Context con;
    RecyclerView recyclerView;
    FragmentTransaction fragmentTransaction;
    RecyclerViewCustomAdapter adapter;
    EmployeeDetailsFragment employeeDetailsFragment;





  