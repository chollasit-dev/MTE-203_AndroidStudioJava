package com.example.fn1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class week14 extends AppCompatActivity {

    //Step 1
    EditText myNum1, myNum2;
    Button mySum1, myMinus1, myMultiply1, myDivide1;
    TextView myTotal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week14);

        //Step 2
        myNum1 = findViewById(R.id.num1);
        myNum2 = findViewById(R.id.num2);
        mySum1  = findViewById(R.id.sum1);
        myMinus1 = findViewById(R.id.minus1);
        myMultiply1 = findViewById(R.id.multiply1);
        myDivide1 = findViewById(R.id.divide1);
        myTotal1 = findViewById(R.id.total1);

        //Step 3: sum1
        mySum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Step 4
                if(myNum1.getText().toString().equals("")) {    //Check If Value in the Box = Null by Using ""
                    myNum1.setError("Null!");
                } else if (myNum2.getText().toString().equals("")) {
                    myNum2.setError("Null!");
                } else {
                    int x = Integer.parseInt(myNum1.getText().toString());
                    int y = Integer.parseInt(myNum2.getText().toString());
                    int z = x + y;
                    myTotal1.setText("Result = " + z);  //Use "": Prevent Crashed from Integer Only
                }
            }
        });

        //Step 3: minus1
        myMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Step 4
                if(myNum1.getText().toString().equals("")) {    //Check If Value in the Box = Null by Using ""
                    myNum1.setError("Null!");
                } else if (myNum2.getText().toString().equals("")) {
                    myNum2.setError("Null!");
                } else {
                    int x = Integer.parseInt(myNum1.getText().toString());
                    int y = Integer.parseInt(myNum2.getText().toString());
                    int z = x - y;
                    myTotal1.setText("Result = " + z);  //Use "": Prevent Crashed from Integer Only
                }
            }
        });

        //Step 3: multiply1
        myMultiply1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Step 4
                if(myNum1.getText().toString().equals("")) {    //Check If Value in the Box = Null by Using ""
                    myNum1.setError("Null!");
                } else if (myNum2.getText().toString().equals("")) {
                    myNum2.setError("Null!");
                } else {
                    int x = Integer.parseInt(myNum1.getText().toString());
                    int y = Integer.parseInt(myNum2.getText().toString());
                    int z = x * y;
                    myTotal1.setText("Result = " + z);  //Use "": Prevent Crashed from Integer Only
                }
            }
        });

        //Step 3: divide1
        myDivide1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Step 4
                if(myNum1.getText().toString().equals("")) {    //Check If Value in the Box = Null by Using ""
                    myNum1.setError("Null!");
                } else if (myNum2.getText().toString().equals("")) {
                    myNum2.setError("Null!");
                } else {
                    int x = Integer.parseInt(myNum1.getText().toString());
                    int y = Integer.parseInt(myNum2.getText().toString());
                    int z = x / y;
                    myTotal1.setText("Result = " + z);  //Use "": Prevent Crashed from Integer Only
                }
            }
        });

    }
}