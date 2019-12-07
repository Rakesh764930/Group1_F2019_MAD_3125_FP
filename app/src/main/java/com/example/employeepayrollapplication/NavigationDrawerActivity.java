package com.example.employeepayrollapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.example.employeepayrollapplication.Fragments.AddNewEmployee;
import com.example.employeepayrollapplication.Fragments.EmployeeListFragment;
import com.example.employeepayrollapplication.Fragments.contactUsFragment;


import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class NavigationDrawerActivity extends AppCompatActivity {


        Toolbar customToolBar;
        NavigationView nav_view;
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        AddNewEmployee addEmployeesFragment;
        EmployeeListFragment employeeFragment;
        contactUsFragment contactUsFragment1;
        DrawerLayout nav_drawer;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_navigation);

        fragmentManager = getSupportFragmentManager();
        this.fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.commit();
        this.customToolBar.setTitle("Employees");
            final ActionBar actionbar = getSupportActionBar();
            actionbar.setTitle("My title");
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setHomeAsUpIndicator(R.drawable.ic_action_navbar);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("WrongConstant")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.employees :
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.commit();
                        actionbar.setTitle("Employees");
                        NavigationDrawerActivity.this.nav_drawer.closeDrawer(Gravity.START, true);
                        Toast.makeText(NavigationDrawerActivity.this, "Employees" , Toast.LENGTH_LONG).show();
                        break;
                    case R.id.add_employee :
                        if(addEmployeesFragment == null)
                        {
                            addEmployeesFragment = new AddNewEmployee();
                        }
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.commit();
                        actionbar.setTitle("Add employee");
                        NavigationDrawerActivity.this.nav_drawer.closeDrawer(Gravity.START, true);
                        Toast.makeText(NavigationDrawerActivity.this, "Add employee" , Toast.LENGTH_LONG).show();
                        break;
                    case R.id.contact_us :
                        if(contactUsFragment1 == null)
                        {
                            contactUsFragment1 = new contactUsFragment();
                        }
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.commit();
                        actionbar.setTitle("Contact Us");
                        NavigationDrawerActivity.this.nav_drawer.closeDrawer(Gravity.START, true);
                        Toast.makeText(NavigationDrawerActivity.this, "Contact Us" , Toast.LENGTH_LONG).show();
                        break;
                    case R.id.logout :
                        startActivity(new Intent(NavigationDrawerActivity.this, LoginActivity.class));
                        Toast.makeText(NavigationDrawerActivity.this, "Logout" , Toast.LENGTH_LONG).show();
                        break;

                }



                return true;
            }
        });

    }


        @SuppressLint("WrongConstant")
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.nav_drawer.openDrawer(Gravity.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
