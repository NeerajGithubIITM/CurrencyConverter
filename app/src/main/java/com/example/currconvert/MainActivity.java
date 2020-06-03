package com.example.currconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.btnusd);
        b2=(Button)findViewById(R.id.btnpounds);
        b3=(Button)findViewById(R.id.btneuro);
        b4=(Button)findViewById(R.id.btnaud);
        b5=(Button)findViewById(R.id.btndirham);
        b6=(Button)findViewById(R.id.btnyen);
        b7=(Button)findViewById(R.id.btnyuan);
        b8=(Button)findViewById(R.id.btnrouble);
        b9=(Button)findViewById(R.id.btndinar);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(MainActivity.this, DollarActivity.class);
                startActivity(in1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(MainActivity.this, PoundActivity.class);
                startActivity(in1);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(MainActivity.this, EuroActivity.class);
                startActivity(in1);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(MainActivity.this, AUDActivity.class);
                startActivity(in1);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(MainActivity.this, DirhamActivity.class);
                startActivity(in1);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(MainActivity.this, YenActivity.class);
                startActivity(in1);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(MainActivity.this, YuanActivity.class);
                startActivity(in1);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(MainActivity.this, RoubleActivity.class);
                startActivity(in1);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(MainActivity.this, DinarActivity.class);
                startActivity(in1);
            }
        });


    }
}
