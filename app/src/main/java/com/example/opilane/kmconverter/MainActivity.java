package com.example.opilane.kmconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private static final double factor = 1.609344;

    EditText text;
    RadioButton ml, km;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static double toKm(double miles){
        return miles * factor;
    }
    public void onClick(View view) {

    }
}
