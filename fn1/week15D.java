package com.example.fn1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class week15D extends AppCompatActivity {

    //Step 1
    TextView myRS15D;
    Button myBt15D;
    EditText myN1, myN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week15_d);

        //Step 2
        myRS15D = findViewById(R.id.RS15D);
        myBt15D = findViewById(R.id.bt15D);
        myN1 = findViewById(R.id.N1);
        myN2 = findViewById(R.id.N2);

        //Step 3
        final SharedPreferences sp = this.getSharedPreferences("shared_name", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor  = sp.edit();

        myRS15D.setText("Result = " + sp.getInt("my_score", 0));

        //Step 3: bt15D
        myBt15D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (myN1.getText().toString().equals("")){  //Check If Null
                    myN1.setError("Null!");
                } else if (myN2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "N2 is null!", Toast.LENGTH_SHORT).show();
                } else if (myN1.getText().toString().equals(myN2.getText().toString())){
                    Toast.makeText(getApplicationContext(), "N1 = N2", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"N1 != N2", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}