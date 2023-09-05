package com.example.fn1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class week14B extends AppCompatActivity {

    //Step 1
    Button myOpen14c, myOpenAddress, myOpenMap;
    EditText myFullName, mygpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week14_b);

        //Step 2
        myOpen14c = findViewById(R.id.open14c);
        myOpenAddress = findViewById(R.id.openAddress);
        myOpenMap = findViewById(R.id.openMap);
        myFullName = findViewById(R.id.fullName1);
        mygpa = findViewById(R.id.gpa1);

        //Step 3: open14c
        myOpen14c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Step 4
                String fname = myFullName.getText().toString();
                int gpa = Integer.parseInt(mygpa.getText().toString());
                Intent myIntent = new Intent(getApplicationContext(), week14C.class);   //Display Specified Page inside Application: Week14C.java ---> Week14C.class
                myIntent.putExtra("my_name", fname);
                myIntent.putExtra("my_gpa", gpa);
                startActivity(myIntent);

                overridePendingTransition(R.anim.start, R.anim.out);

            }
        });

        //Step 3: openAddress
        myOpenAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Step 4
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=seacon srinakarin"));     //Display Specified Page outside Application
                //0:0 = Latitude:Longtitude, ?q="": Keyword (Can be Used in Google without x:y)
                startActivity(myIntent);

            }
        });

        //Step 3: openMap
        myOpenMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Step 4
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?saddr=13.849632296667167, 100.67824012059208&daddr=13.738256315852551, 100.62834618242334"));  //From My Home ---> TNI
                //saddr: Start, daddr: End
                startActivity(myIntent);

            }
        });

    }
}