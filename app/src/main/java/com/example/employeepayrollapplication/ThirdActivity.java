package com.example.employeepayrollapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.employeepayrollapplication.Custom_Adapter.RecyclerViewCustomAdapter;
import com.example.employeepayrollapplication.models.Employee;

import java.util.ArrayList;

import static com.example.employeepayrollapplication.R.id.recycler_view;

public class ThirdActivity extends AppCompatActivity {

    private ArrayList<Employee> employees_list;
    private RecyclerView rvEmployeesList;
    private RecyclerViewCustomAdapter customView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initViews();
    }

    private void initViews() {

        populateData();
        rvEmployeesList = new RecyclerView(employees_list, new RecyclerViewCustomAdapter.SetCustomClickListener() {

            @Override
            public void customOnClick(Employee e) {

            }

        });

        recyclerView = findViewById(R.id.recycler_view);
        adapter = new RecyclerViewCustomAdapter(employees_list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        //RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mLayoutManager.
        recyclerView.se


    }

    private void populateData() {

    }


}
