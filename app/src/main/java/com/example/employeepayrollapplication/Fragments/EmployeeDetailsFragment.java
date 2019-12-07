package com.example.employeepayrollapplication.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.employeepayrollapplication.Interface.EmployeeDetailsInterface;
import com.example.employeepayrollapplication.R;
import com.example.employeepayrollapplication.models.CommissionBasedPartTime;
import com.example.employeepayrollapplication.models.Employee;
import com.example.employeepayrollapplication.models.FixedBasedPartTime;
import com.example.employeepayrollapplication.models.FullTime;
import com.example.employeepayrollapplication.models.Intern;
import com.example.employeepayrollapplication.models.PartTime;

public class EmployeeDetailsFragment extends Fragment implements EmployeeDetailsInterface {


    Employee employee;
    TextView name;
    TextView age;
    TextView gender;
    TextView vehicle;
    CardView parttime_card;
    CardView fulltime_card;
    CardView intern_card;
    TextView employment_type;
    TextView total_earning;


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.employee_details_fragment, container, false);
    }
    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.name = view.findViewById(R.id.text_name_value);
        this.age = view.findViewById(R.id.text_age_value);
        this.gender = view.findViewById(R.id.text_gender_value);
        this.vehicle = view.findViewById(R.id.text_vehicle_value);
        this.parttime_card = view.findViewById(R.id.parttime_card);
        this.fulltime_card = view.findViewById(R.id.fulltime_card);
        this.intern_card = view.findViewById(R.id.intern_card);
        this.employment_type = view.findViewById(R.id.text_employment_type_value);
        this.total_earning = view.findViewById(R.id.text_total_earning_val);

        this.name.setText(employee.getName().toUpperCase());
        this.age.setText(employee.getAge()+"");

        if(employee instanceof PartTime)
        {

            fulltime_card.setVisibility(View.GONE);
            intern_card.setVisibility(View.GONE);
            TextView rate = view.findViewById(R.id.text_rate_value);
            TextView hour = view.findViewById(R.id.text_hours_value);
            TextView commission_fixedamount_value = view.findViewById(R.id.text_commission_fixedamount_value);
            TextView commission_fixedamount_label = view.findViewById(R.id.text_commission_fixedamount_label);

            rate.setText("$ "+((PartTime) employee).getRate());
            hour.setText(((PartTime) employee).getHoursWorked()+"");

            if(employee instanceof CommissionBasedPartTime)
            {
                this.employment_type.setText("COMMISSION BASED");
                commission_fixedamount_label.setText("COMMISSION");
                commission_fixedamount_value.setText(((CommissionBasedPartTime) employee).getCommissionPerc()+"%");
                this.total_earning.setText("$ "+((CommissionBasedPartTime)employee).commissionCalcEarnings());

            }
            else
            {
                this.employment_type.setText("Fixed BASED");
                commission_fixedamount_label.setText("FIXED AMOUNT");
                commission_fixedamount_value.setText("$ "+((FixedBasedPartTime) employee).getFixedAmount());
                this.total_earning.setText("$ "+((FixedBasedPartTime)employee).fixedAmountCalcEarnings());
            }



        }// part time
        else if(employee instanceof FullTime)
        {
            this.employment_type.setText("FULL TIME");
            parttime_card.setVisibility(View.GONE);
            intern_card.setVisibility(View.GONE);

            TextView salary = view.findViewById(R.id.text_salary_value);
            TextView bonus = view.findViewById(R.id.text_bonus_value);

            salary.setText("$ "+((FullTime) employee).getSalary());
            bonus.setText("$ "+((FullTime) employee).getBonus());
            this.total_earning.setText("$ "+((FullTime)employee).calcEarning());

        }
        else
        {

            this.employment_type.setText("INTERN");
            parttime_card.setVisibility(View.GONE);
            fulltime_card.setVisibility(View.GONE);

            TextView stiphend = view.findViewById(R.id.text_stiphend_value);
            TextView school = view.findViewById(R.id.text_school_value);

            stiphend.setText("$ "+employee.calcEarning());
            school.setText(((Intern)employee).getSchoolName());
            this.total_earning.setText("$ "+((Intern)employee).calcEarning());


        }


    }

    @Override
    public void employeeObject(Employee employee) {
        this.employee = employee;
    }
}
