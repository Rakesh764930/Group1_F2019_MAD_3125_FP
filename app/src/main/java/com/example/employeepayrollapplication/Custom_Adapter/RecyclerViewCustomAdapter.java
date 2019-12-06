package com.example.employeepayrollapplication.Custom_Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.employeepayrollapplication.R;
import com.example.employeepayrollapplication.models.Employee;

import java.util.ArrayList;

public class RecyclerViewCustomAdapter extends RecyclerView.Adapter {

    ArrayList<Employee> arrayList;
    SetCustomClickListener listener;


    public interface SetCustomClickListener{
        public void customOnClick(Employee e);
    }




    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return this.arrayList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{

        TextView name;
        TextView gender;
        TextView age;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.emp_name);
            gender = itemView.findViewById(R.id.emp_type);
            age = itemView.findViewById(R.id.emp_age);

        }

        public void bindData(Employee e,  SetCustomClickListener listener) {
            name.setText("Name : " + e.getName());
        }

    }

}
