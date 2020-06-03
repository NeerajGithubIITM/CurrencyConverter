package com.example.currconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DinarActivity extends AppCompatActivity {

    public void dinarconvert(View view)
    {
        EditText inputAmount = (EditText) findViewById(R.id.Amount);
        String input1 = inputAmount.getText().toString();
        Double doubleinput = Double.parseDouble(input1);
        Double inr = 234.84*doubleinput;
        String result = inr.toString();
        TextView textview = findViewById(R.id.resultamount);
        textview.setText(result);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinar);
    }
}
