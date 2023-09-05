package com.example.fn1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class week15C extends AppCompatActivity {

    //Step 1
    TextView myRS15C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week15_c);

        //Step 2
        myRS15C = findViewById(R.id.RS15C);

        //Step 3
        final SharedPreferences sp = this.getSharedPreferences("shared_name", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sp.edit();

        myRS15C.setText("Result = " + sp.getInt("my_score", 0));

    }
}