package com.example.fn1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    //Step 1: Create Variable
    TextView txtView;
    EditText edtView1, edtView2;
    Button Btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Step 2
        txtView = findViewById(R.id.textHeader1);
        edtView1 = findViewById(R.id.myText1);
        edtView2 = findViewById(R.id.myText2);
        Btn1 = findViewById(R.id.buttonSend);

        //Step 3
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Step 4:
                String str1 = edtView1.getText().toString();
                String str2 = edtView2.getText().toString();
                txtView.setText("Hi! " + str1 + " " + str2);
            }
        });
    }
}