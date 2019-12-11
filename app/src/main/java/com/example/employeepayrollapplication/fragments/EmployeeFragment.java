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





    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        this.con = inflater.getContext();
        Log.e("TAG","inside onCreateView");
        View root = inflater.inflate(R.layout.fragment_employees, container, false);
        employees_list= Singleton.getObj().getList();
        this.recyclerView = root.findViewById(R.id.rvEmpList);
        adapter = new RecyclerViewCustomAdapter(employees_list, this.con, new RecyclerViewCustomAdapter.SetCustomClickListener() {
            @Override
            public void customOnClick(Employee e) {
                Toast.makeText(EmployeeFragment.this.con, e.getName(), Toast.LENGTH_LONG).show();
                if(employeeDetailsFragment == null){
                    employeeDetailsFragment = new EmployeeDetailsFragment();
                }
                employeeDetailsFragment.employeeObject(e);
                fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
            fragmentTransaction.
                fragmentTransaction.replace(R.id.nav_host_fragment, employeeDetailsFragment, "");
                fragmentTransaction.commit();
                //fragmentTransaction.addToBackStack(null);
            }
        });
        this.recyclerView.setAdapter(adapter);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this.con));
        //final TextView textView = root.findViewById(R.id.text_employees);

        return root;
    }
}