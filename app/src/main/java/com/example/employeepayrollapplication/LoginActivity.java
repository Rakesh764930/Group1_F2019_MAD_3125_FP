package com.example.employeepayrollapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends  AppCompatActivity {
    private EditText edtUsername;
    private EditText edtPassword;
    private Button btnLogin;
    private Switch swRememberMe;
    private TextView txtColor;
    public static  final String KEY_NAME="name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername=findViewById(R.id.edtUsername);
        edtPassword=findViewById(R.id.edtPassword);
        btnLogin=findViewById(R.id.btnLogin);
        swRememberMe=findViewById(R.id.swRememberMe);
        txtColor=findViewById(R.id.txtColor);
        btnLogin.setOnClickListener(this);

        swRememberMe.setOnCheckedChangeListener(new  CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    txtColor.setBackgroundColor(Color.YELLOW);
                    txtColor.setTextColor(Color.BLUE);
                }
                else
                {
                    txtColor.setBackgroundColor(Color.BLACK);
                    txtColor.setTextColor(Color.RED);
                }
            }
        });



    }

    @Override
    public void onClick(View view) {
        if (edtUsername.getText().toString().contentEquals("Rks764930") && edtPassword.getText().toString().contentEquals("4141")){
            Intent nintent=new Intent(MainActivity.this,SecondActivity.class);
            nintent.putExtra("name",edtUsername.getText().toString());
            startActivity(nintent);
        }
        else{
            edtUsername.setError("Please enter Name");
            showAlert();

        }

    }
    private void showAlert(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setIcon(R.drawable.ic_action_name);
        alertDialogBuilder.setTitle("Login error");
        alertDialogBuilder.setMessage("Please enter your name");
        alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

            }
        });
        alertDialogBuilder.setNegativeButtonIcon(getResources().getDrawable(R.drawable.ic_action_name));
        AlertDialog mAlertDialog=alertDialogBuilder.create();
        mAlertDialog.show();
    }
}