package com.jobchumo.ride2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    EditText fir,las,phonne,usern,passw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        fir= (EditText) findViewById(R.id.First);
        las= (EditText) findViewById(R.id.last);
        phonne= (EditText) findViewById(R.id.phone);
        usern= (EditText) findViewById(R.id.user);
        passw= (EditText) findViewById(R.id.pass);

    }

    public void Login(View view) {

        startActivity(new Intent(SignUp.this, Login.class));

    }

    public void SignUP(View view) {

        fir.getText().toString();
        las.getText().toString();
        phonne.getText().toString();
        usern.getText().toString();
        passw.getText().toString();



    }
}
