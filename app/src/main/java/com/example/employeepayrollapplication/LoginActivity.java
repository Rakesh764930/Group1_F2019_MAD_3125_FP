package com.example.employeepayrollapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.graphics.Color;
import android.content.Intent;
import android.content.DialogInterface;
import android.content.*;
import android.widget.CompoundButton;

import com.example.employeepayrollapplication.Fragments.EmployeeListFragment;

public class LoginActivity extends  AppCompatActivity  {
    private EditText edtUsername;
    private EditText edtPassword;
    private Button btnLogin;
    private Switch swRememberMe;
    private TextView txtColor;
    public static  final String KEY_NAME="name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsername=findViewById(R.id.edtUsername);
        edtPassword=findViewById(R.id.edtPassword);
        btnLogin=findViewById(R.id.btnLogin);
        swRememberMe=findViewById(R.id.swRememberMe);

btnLogin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        if (edtUsername.getText().toString().trim().equals("user@employee.com") && edtPassword.getText().toString().trim().equals("s3cr3t")){
            Intent mIntent=new Intent(LoginActivity.this, NavigationDrawerActivity.class);
            startActivity(mIntent);
        }
        else{
            btnLogin.setAlpha(.5f);
            edtUsername.setError("Please enter valid email or password");
            showAlert();

        }

   }
});
//        swRememberMe.setOnCheckedChangeListener(new  CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
//                if(b){
//                    txtColor.setBackgroundColor(Color.YELLOW);
//                    txtColor.setTextColor(Color.BLUE);
//                }
//                else
//                {
//                    txtColor.setBackgroundColor(Color.BLACK);
//                    txtColor.setTextColor(Color.RED);
//                }
//            }
//        });

}  public void showAlert()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Login error");
        AlertDialog mAlertDialog=alertDialogBuilder.create();
        mAlertDialog.show();
    }
}