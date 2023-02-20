package com.example.income_tax_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FY2223 extends AppCompatActivity {
    private Button button;
    private EditText Income;
    private EditText Deduction;
    private TextView TaxableIncome;
    private TextView IncomeTax;
    private TextView EduCess;
    private TextView TotalIncome;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fy2223);
        button = findViewById(R.id.bt);
        Income = findViewById(R.id.l1);
        Deduction = findViewById(R.id.l2);
        TaxableIncome = findViewById(R.id.l3);
        IncomeTax = findViewById(R.id.l4);
        EduCess = findViewById(R.id.l5);
        TotalIncome = findViewById(R.id.l6);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s1 =Income.getText().toString();
                String s2 = Deduction.getText().toString();
                int income = Integer.parseInt(s1);
                int deduction = Integer.parseInt(s2);
                int taxable_income = income-deduction;
                double total_tax_22 = 0.0;
                double educess = 0;
                if(taxable_income>1000000){
                    total_tax_22 = ((taxable_income-1000000)*0.3)+112500;
                } else if (taxable_income>500000) {
                    total_tax_22 = ((taxable_income-500000)*0.2)+12500;
                } else if (taxable_income>250000) {
                    total_tax_22 = ((taxable_income - 250000) * 0.05);
                }else {
                    total_tax_22 = 0.0;
                }
                educess =(int)Math.round(total_tax_22*0.04);
                TaxableIncome.setText(String.valueOf(taxable_income));
                IncomeTax.setText(String.valueOf(Math.round(total_tax_22)));
                EduCess.setText(String.valueOf((int) educess));
                TotalIncome.setText(String.valueOf(Math.round(educess+total_tax_22)));
            }
        });
    }
    public void back(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}