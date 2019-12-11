package com.example.employeepayrollapplication.Interface;

import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public interface PartTimeDataInterface {
    void defaultViewsPartTimeFragment(TextView id, TextView name, TextView age, TextView ratePerHour,
                                      TextView numberOfHours, TextView dateOfBirth, RadioGroup vehicle);

}
