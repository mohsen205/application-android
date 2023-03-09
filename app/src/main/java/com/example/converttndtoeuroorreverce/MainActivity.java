package com.example.converttndtoeuroorreverce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText amount = findViewById(R.id.amount);
        Button btn = findViewById(R.id.btn);
        RadioButton  euroToTnd = findViewById(R.id.myRadioButton1);
        TextView resulat = findViewById(R.id.myTextView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(amount.getText().toString().trim());
                if(euroToTnd.isChecked()){
                    double result = a * 3.6;
                    resulat.setText("Result of : " +  result );
                } else {
                    double result = a * 1.8;
                    resulat.setText("Result of: " + result );
                }
            }
        });

    }
}