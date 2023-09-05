package com.example.fn1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class week14C extends AppCompatActivity {

    //Step 1
    TextView myRS14C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week14_c);

        //Step 2
        myRS14C = findViewById(R.id.RS14C);

        //Step 3-4
        Intent myintent = getIntent();
        String name = myintent.getStringExtra("my_name");
        int gpa = myintent.getIntExtra("my_gpa", 0);    //("my_gpa", 0): Default When "my_gpa" isn't Found

        myRS14C.setText(name + "'s Result is " + gpa);

    }
}