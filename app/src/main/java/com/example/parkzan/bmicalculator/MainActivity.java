package com.example.parkzan.bmicalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.parkzan.bmicalculator.model.Human;

public class MainActivity extends AppCompatActivity {
    String a[] = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.buttoncal);
        final EditText eh = (EditText) findViewById(R.id.editText6);
        final EditText ew = (EditText) findViewById(R.id.editText7);



            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String numberh = eh.getText().toString();
                    String numberw = ew.getText().toString();
                    if (numberh.length()==0  ||numberw.length()==0) {
                        AlertDialog.Builder dialig = new AlertDialog.Builder(MainActivity.this);
                        dialig.setTitle("ผิดพลาด");
                        dialig.setMessage("ป้อนข้อมูลไม่ครบ");
                        dialig.setIcon(R.mipmap.ic_launcher);
                        dialig.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialig.show();
                    }
                    else {
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        intent.putExtra("numberheight", numberh);
                        intent.putExtra("numberweight", numberw);
                        startActivity(intent);

                    }
                }
            });


    }
}
