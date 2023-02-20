package com.example.income_tax_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnfy2223(View view){
        Intent intent = new Intent(this,FY2223.class);
        startActivity(intent);
    }
    public void btnfy2324(View view){
        Intent intent = new Intent(this,FY2324.class);
        startActivity(intent);
    }
}