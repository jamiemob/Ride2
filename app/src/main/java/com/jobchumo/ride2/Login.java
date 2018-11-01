package com.jobchumo.ride2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {



    EditText ussr,paswr;
    DBConnect DBConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ussr = (EditText) findViewById(R.id.Usrnam);
        paswr = (EditText) findViewById(R.id.Passwrd);

    }

    public void LogIN(View view) {

    }

    public void SignuP(View view) {
        startActivity(new Intent(Login.this, SignUp.class));

    }
}
