package com.example.employeepayrollapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.util.Log;

public class LoginActivity extends  AppCompatActivity  {
    private EditText edtUsername;
    private EditText edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsername=findViewById(R.id.edtUsername);
        edtPassword=findViewById(R.id.edtPassword);
        btnLogin=findViewById(R.id.btnLogin);

btnLogin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

       if (edtUsername.getText().toString().trim().equals("user@employee.com") && edtPassword.getText().toString().trim().equals("s3cr3t")){
            Intent mIntent=new Intent(LoginActivity.this, MainActivity.class);
            startActivity(mIntent);
           Log.d("myTag", "Success");
       }
        else{
            btnLogin.setAlpha(.5f);
            edtUsername.setError("Please enter valid email or password");
            showAlert();


     }

   }
});

}  public void showAlert()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Login error");
        AlertDialog mAlertDialog=alertDialogBuilder.create();
        mAlertDialog.show();
    }
}