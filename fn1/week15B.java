package com.example.fn1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class week15B extends AppCompatActivity {

    //Step 1
    EditText myScore1;
    Button mySave1, myWeek15C, myWeek15D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week15_b);

        //Step 2
        myScore1 = findViewById(R.id.score1);
        mySave1 = findViewById(R.id.save1);
        myWeek15C = findViewById(R.id.week15C);
        myWeek15D = findViewById(R.id.week15D);

        //Step 2.5: Build & Connect Data (Can be Use With onCreate Only)
        final SharedPreferences sp = this.getSharedPreferences("shared_name", Context.MODE_PRIVATE);
        //getSharedPreferences: Can be Use With Any Other Page, Unlike SharedPreferences
        final SharedPreferences.Editor editor = sp.edit();

        //Step 3: Save Data
        mySave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Step 4
                int score = Integer.parseInt(myScore1.getText().toString());
                editor.putInt("my_score", score);
                editor.commit();

            }
        });

        //Step 3: week15C
        myWeek15C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Step 4
                Intent intent = new Intent(getApplicationContext(), week15C.class);
                startActivity(intent);


            }
        });

        //Step 3: week15D
        myWeek15D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Step 4
                Intent intent = new Intent(getApplicationContext(), week15D.class);
                startActivity(intent);


            }
        });

    }
}