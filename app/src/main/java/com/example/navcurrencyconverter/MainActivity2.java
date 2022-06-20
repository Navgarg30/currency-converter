package com.example.navcurrencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2<E2> extends AppCompatActivity {
    Button button2;
    EditText editText;
    private TextInputEditText E2;
    private TextView textview5;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Amount converted", Toast.LENGTH_LONG).show();
            }
        });
        editText = findViewById(R.id.E1);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convert();
            }
        });


    }

    public void convert() {
        String amountDollars = editText.getText().toString();
        if (amountDollars.equals("")) {
            Toast.makeText(this, "Enter valid number", Toast.LENGTH_LONG).show();
        } else {
            Double amuntDollarsdouble = Double.parseDouble(amountDollars);
            Double amountRsDouble = amuntDollarsdouble * 78;
            String amountRs = amountRsDouble.toString();
            Toast.makeText(this, "Amount in RS is " + amountRs, Toast.LENGTH_LONG).show();
        }
    }
}