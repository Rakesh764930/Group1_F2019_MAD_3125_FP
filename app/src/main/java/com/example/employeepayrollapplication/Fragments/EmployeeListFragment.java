package com.example.employeepayrollapplication.Fragments;

import android.content.Context;
import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.employeepayrollapplication.Custom_Adapter.RecyclerViewCustomAdapter;
import com.example.employeepayrollapplication.Interface.EmployeeDetailsInterface;
import com.example.employeepayrollapplication.R;
import com.example.employeepayrollapplication.models.Employee;
import com.example.employeepayrollapplication.models.Singleton;


import java.util.ArrayList;



public class EmployeeListFragment extends Fragment  {

    ArrayList<Employee> employees_list;
    Context con;
    RecyclerView recyclerView;
    RecyclerViewCustomAdapter adapter;
    FragmentTransaction fragmentTransaction;
    EmployeeDetailsFragment employeeDetailsFragment;
    Employee employee;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.con = inflater.getContext();
        View v =  inflater.inflate(R.layout.employee_list, container, false);
        employees_list = Singleton.getObj().getList();

        this.recyclerView = v.findViewById(R.id.recycler_view);
        adapter = new RecyclerViewCustomAdapter(employees_list, this.con, new RecyclerViewCustomAdapter.SetCustomClickListener() {
            @Override
            public void customOnClick(Employee e) {

                Toast.makeText(EmployeeListFragment.this.con, e.getName(), Toast.LENGTH_LONG).show();
                if(employeeDetailsFragment == null) {
                    employeeDetailsFragment = new EmployeeDetailsFragment();
                }
                employeeDetailsFragment.employeeObject(e);
                fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);

            }
        }
        );

        this.recyclerView.setAdapter(adapter);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this.con));

        return v;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {

        super.onSaveInstanceState(outState);



    }



}
