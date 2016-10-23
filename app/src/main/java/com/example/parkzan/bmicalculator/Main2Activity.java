package com.example.parkzan.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.parkzan.bmicalculator.model.Human;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Human h = new Human();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent in = getIntent();
        String inputh =in.getStringExtra("numberheight");
        String inputw = in.getStringExtra("numberweight");
         h.addNumber(inputh,inputw);
        TextView tv = (TextView) findViewById(R.id.textView4);
        TextView tt = (TextView) findViewById(R.id.textView6);
     tv.setText(h.getNumber());
        tt.setText(h.getTet());
    }
}
