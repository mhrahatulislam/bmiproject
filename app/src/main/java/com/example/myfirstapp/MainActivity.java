package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editWeight, editTextFt, editTextIn;
        Button btnCalculate;
        TextView result;

        editWeight = findViewById(R.id.etWeight);
        editTextFt = findViewById(R.id.etHightFt);
        editTextIn = findViewById(R.id.etHightIn);
        btnCalculate = findViewById(R.id.btCalculat);
        result = findViewById(R.id.result);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int wt= Integer. parseInt(editWeight.getText().toString());
              int hift= Integer.parseInt(editTextFt.getText().toString());
              int hiin= Integer.parseInt(editTextIn.getText().toString());

              int totalIn= hift*12+hiin;
              double totalcm = totalIn*2.53;
              double totalmeter = totalcm/100;

              double bmi= wt/(totalmeter*totalmeter);
              if (bmi>25){
                  result.setText("your OverWeight");
              }
              else if(bmi<18){
                  result.setText("You are Under Weight");
              }
              else {
                  result.setText("You are Ok");
              }

            }
        });

    }




}