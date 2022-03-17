package com.example.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTrue(View view) {
        Toast.makeText(getApplicationContext(), "Great !", Toast.LENGTH_LONG).show();
    }

    public void onCLickFalse(View view) {
        Toast.makeText(getApplicationContext(), "Bad !", Toast.LENGTH_LONG).show();
    }
}