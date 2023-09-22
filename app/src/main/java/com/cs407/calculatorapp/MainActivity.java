package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickAddition(View view){
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        double firstInt = Double.parseDouble(firstNumber.getText().toString());
        double secondInt = Double.parseDouble(secondNumber.getText().toString());
        double result = firstInt + secondInt;
        String answer = Double.toString(result);
        goToActivity(answer);
    }
    public void clickSubtraction(View view){
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        double firstInt = Double.parseDouble(firstNumber.getText().toString());
        double secondInt = Double.parseDouble(secondNumber.getText().toString());
        double result = firstInt - secondInt;
        String answer = Double.toString(result);
        goToActivity(answer);
    }
    public void clickMultiplication(View view){
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        double firstInt = Double.parseDouble(firstNumber.getText().toString());
        double secondInt = Double.parseDouble(secondNumber.getText().toString());
        double result = firstInt * secondInt;
        String answer = Double.toString(result);
        goToActivity(answer);
    }
    public void clickDivision(View view){
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        double firstInt = Double.parseDouble(firstNumber.getText().toString());
        double secondInt = Double.parseDouble(secondNumber.getText().toString());
        if(secondInt == 0.0){
            goToActivity("Cannot Divide by 0");
        } else {
            double result = firstInt / secondInt;
            String answer = Double.toString(result);
            goToActivity(answer);
        }
    }

    public void goToActivity(String str){
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("answer", str);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}