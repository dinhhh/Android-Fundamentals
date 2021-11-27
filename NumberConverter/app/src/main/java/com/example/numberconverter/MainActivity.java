package com.example.numberconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {

    List<Integer> base = Arrays.asList(2, 8, 10, 16);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner fromBase = findViewById(R.id.fromBase);
        Spinner toBase = findViewById(R.id.toBase);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, base);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromBase.setAdapter(ad);
        toBase.setAdapter(ad);

        TextView inputTxtView = findViewById(R.id.txtInput);
        TextView resultTxtView = findViewById(R.id.resultTxtView);

        Button convertBtn = findViewById(R.id.convertBtn);
        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("ConvertApp", " Convert btn is clicked");
                int fromBaseValue = (int) fromBase.getSelectedItem();
                int toBaseValue = (int) toBase.getSelectedItem();
                String number = inputTxtView.getText().toString();
                Log.v("ConvertApp", String.format(" Convert number %s from base %d to base %d", number, fromBaseValue, toBaseValue));
                try {
                    String result = convertFromBaseToBase(number, fromBaseValue, toBaseValue);
                    Log.v("ConvertApp", String.format(" Result %s", result));
                    resultTxtView.setText(result);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Your number is invalid", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });

        Button resetBtn = findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("ConvertApp", " Reset btn is clicked");
                inputTxtView.setText("");
            }
        });
    }

    private String convertFromBaseToBase(String number, int fromBase, int toBase) {
        return Integer.toString(Integer.parseInt(number, fromBase), toBase);
    }
}