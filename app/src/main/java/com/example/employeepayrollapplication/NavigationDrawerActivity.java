package com.example.employeepayrollapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;


public class NavigationDrawerActivity extends AppCompatActivity{



        Toolbar customToolBar;
        NavigationView nav_view;
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        AddNewEmployee addEmployeesFragment;
        EmployeeListFragment employeeFragment;
        HelpFragment contactUsFragment;
        DrawerLayout nav_drawer;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_navigation_drawer);










            this.nav_drawer = (DrawerLayout) findViewById(R.id.nav_drawer);
            employeeFragment = new EmployeeListFragment();



 this.customToolBar = findViewById(R.id.tbCustom);
            setSupportActionBar(this.customToolBar);
            final ActionBar actionbar = getSupportActionBar();
            actionbar.setTitle("My title");
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setHomeAsUpIndicator(R.drawable.ic_action_list);

            fragmentManager = getSupportFragmentManager();
            this.fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.frame_layout, employeeFragment);
            fragmentTransaction.commit();
            this.customToolBar.setTitle("Employees");



            nav_view = findViewById(R.id.nav_view);

            nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    switch (menuItem.getItemId())
                    {
                        case R.id.employees :
                            fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.frame_layout, employeeFragment, null);
                            fragmentTransaction.commit();
                            actionbar.setTitle("Employees");
                            NavigationDrawerActivity.this.nav_drawer.closeDrawer(Gravity.LEFT, true);
                            Toast.makeText(NavigationDrawerActivity.this, "Employees" , Toast.LENGTH_LONG).show();
                            break;
                        case R.id.add_employee :
                            if(addEmployeesFragment == null)
                            {
                                addEmployeesFragment = new AddNewEmployee();
                            }
                            fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.frame_layout, addEmployeesFragment);
                            fragmentTransaction.commit();
                            actionbar.setTitle("Add employee");
                            NavigationDrawerActivity.this.nav_drawer.closeDrawer(Gravity.LEFT, true);
                            Toast.makeText(NavigationDrawerActivity.this, "Add employee" , Toast.LENGTH_LONG).show();
                            break;
                        case R.id.contact_us :
                            if(contactUsFragment == null)
                            {
                                contactUsFragment = new HelpFragment();
                            }
                            fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.frame_layout, contactUsFragment);
                            fragmentTransaction.commit();
                            actionbar.setTitle("Contact Us");
                            NavigationDrawerActivity.this.nav_drawer.closeDrawer(Gravity.LEFT, true);
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

    private void setSupportActionBar(Toolbar customToolBar) {
            this.customToolBar=customToolBar;
    }


    @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    this.nav_drawer.openDrawer(Gravity.LEFT);
                    return true;
            }
            return super.onOptionsItemSelected(item);
        }
    }
