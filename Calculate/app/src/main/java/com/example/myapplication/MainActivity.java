package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numberA, numberB;
    Button add, sub, mul, div;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setControl() {
        numberA = findViewById(R.id.a);
        numberB = findViewById(R.id.b);
        sub = findViewById(R.id.sub);
        add = findViewById(R.id.add);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        res = findViewById(R.id.res);
    }

    private void setEvent() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a, b, c;
                a = Float.parseFloat(numberA.getText().toString());
                b = Float.parseFloat(numberB.getText().toString());
                c = a + b;

                res.setText(c + "");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a, b, c;
                a = Float.parseFloat(numberA.getText().toString());
                b = Float.parseFloat(numberB.getText().toString());
                c = a - b;

                res.setText(c + "");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a, b, c;
                a = Float.parseFloat(numberA.getText().toString());
                b = Float.parseFloat(numberB.getText().toString());
                c = a * b;

                res.setText(c + "");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a, b, c;
                a = Float.parseFloat(numberA.getText().toString());
                b = Float.parseFloat(numberB.getText().toString());
                c = a / b;

                res.setText(c + "");
            }
        });
    }


}
