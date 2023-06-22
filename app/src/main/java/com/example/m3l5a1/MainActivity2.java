package com.example.m3l5a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button btn;
    EditText txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.b1);
        txt= findViewById(R.id.ET1);
        btn.setOnClickListener(v -> Toast.makeText(MainActivity2.this,"hello"+txt.getText().toString()+"Nice to talk to you",Toast.LENGTH_LONG).show());

    }
}