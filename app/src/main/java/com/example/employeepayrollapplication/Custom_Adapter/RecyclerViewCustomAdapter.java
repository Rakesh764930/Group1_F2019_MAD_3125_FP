package com.example.employeepayrollapplication.Custom_Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.employeepayrollapplication.R;
import com.example.employeepayrollapplication.models.Employee;

import java.util.ArrayList;

public class RecyclerViewCustomAdapter extends RecyclerView.Adapter<RecyclerViewCustomAdapter.ViewHolder> {

    ArrayList<Employee> arrayList;
    SetCustomClickListener listener;
    Context context;

    public RecyclerViewCustomAdapter(ArrayList<Employee> employees_list, Context context, final SetCustomClickListener listener) {

        this.arrayList = arrayList;
        this.context = context;
        this.listener = listener;

    }


    public interface SetCustomClickListener {
        public void customOnClick(Employee e);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(this.context);
        View view = inflater.inflate(R.layout.recyclerview_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.bindData(this.arrayList.get(position), this.listener);

    }


    @Override
    public int getItemCount() {
        return this.arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;

        TextView age;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.emp_name);

            age = itemView.findViewById(R.id.emp_age);

        }

        public void bindData(final Employee e, final SetCustomClickListener listener) {

            name.setText("Name : " + e.getName());
            age.setText("Age : " + e.getAge());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.customOnClick(e);
                }
            });

        }
    }

}

