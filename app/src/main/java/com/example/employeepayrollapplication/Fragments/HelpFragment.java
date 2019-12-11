package com.example.employeepayrollapplication.Fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;


public class HelpFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        showAlert();
        return null;
    }
    public void showAlert(){
        androidx.appcompat.app.AlertDialog.Builder alertDailogBuilder = new androidx.appcompat.app.AlertDialog.Builder(getActivity());
      alertDailogBuilder.setTitle("Contacts ");
        alertDailogBuilder.setMessage("Email: abc@payrollapp.ca\n" +
                "Phone: (+1)123-456-7891");
        alertDailogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alertDailogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog mAlertDialog = alertDailogBuilder.create();
        mAlertDialog.show();
    }
}