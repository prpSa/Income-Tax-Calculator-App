package com.example.income_tax_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FY2324 extends AppCompatActivity {
    private Button button;
    private EditText Income;
    private EditText Deduction;
    private TextView TaxableIncome;
    private TextView IncomeTax;
    private TextView EduCess;
    private TextView TotalIncome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fy2324);
        button = findViewById(R.id.btt);
        Income = findViewById(R.id.ll1);
        Deduction = findViewById(R.id.ll2);
        TaxableIncome = findViewById(R.id.ll3);
        IncomeTax = findViewById(R.id.ll4);
        EduCess = findViewById(R.id.ll5);
        TotalIncome = findViewById(R.id.ll6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 =Income.getText().toString();
                String s2 = Deduction.getText().toString();
                int income = Integer.parseInt(s1);
                int deduction = Integer.parseInt(s2);
                int taxable_income = income-deduction;
                double total_tax_23 = 0.0;
                double educess = 0;
                if(taxable_income>1500000){
                    total_tax_23 = ((taxable_income-1500000)*0.3)+150000;
                } else if (taxable_income>1200000) {
                    total_tax_23 = ((taxable_income-1200000)*0.2)+90000;
                } else if (taxable_income>900000) {
                    total_tax_23 = ((taxable_income-900000)*0.15)+45000;
                } else if (taxable_income>600000) {
                    total_tax_23 = ((taxable_income-600000)*0.1)+15000;
                } else if (taxable_income>300000) {
                    total_tax_23 = ((taxable_income-300000)*0.05);
                }else {
                    total_tax_23 = 0.0;
                }
                educess =(int)Math.round(total_tax_23*0.04);
                TaxableIncome.setText(String.valueOf(taxable_income));
                IncomeTax.setText(String.valueOf(Math.round(total_tax_23)));
                EduCess.setText(String.valueOf((int) educess));
                TotalIncome.setText(String.valueOf(Math.round(educess+total_tax_23)));
            }
        });
    }
    public void back(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}