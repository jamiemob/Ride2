package com.jobchumo.ride2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CarRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_registration);
    }

    public void Home(View view) {
        startActivity(new Intent(CarRegistration.this, Maps.class));
    }

    public void Register(View view) {


    }
}
