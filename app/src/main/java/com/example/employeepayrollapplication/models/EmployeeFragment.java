package com.example.employeepayrollapplication.models;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EmployeeFragment extends Fragment
{

    ArrayList<Employee> employees_list;
    Context con;
    RecyclerView recyclerView;
    CustomAdapterForRecyclerView adapter;

    FragmentTransaction fragmentTransaction;
    EmployeeDatailsFragment employeeDatailsFragment;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.con = inflater.getContext();
        Log.e("***************","inside onCreateView");

        View v =  inflater.inflate(R.layout.employee_fragment_layout, container, false);


        employees_list = Singleton.getObj().getList();

        this.recyclerView = v.findViewById(R.id.recycler_view);
        adapter = new CustomAdapterForRecyclerView(employees_list, this.con, new CustomAdapterForRecyclerView.SetCustomClickListener() {
            @Override
            public void customOnClick(Employee employee) {
                Toast.makeText(EmployeeFragment.this.con, employee.getName(), Toast.LENGTH_LONG).show();
                if(employeeDatailsFragment == null) {
                    employeeDatailsFragment = new EmployeeDatailsFragment();
                }
                employeeDatailsFragment.employeeObject(employee);
                fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout , employeeDatailsFragment , "");
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);

            }
        });
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
