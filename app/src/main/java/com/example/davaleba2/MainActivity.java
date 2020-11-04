package com.example.davaleba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button signin = findViewById(R.id.signin);
    Button register = findViewById(R.id.register);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnclick1(View view) {
        Intent shesvla = new Intent(this, MainActivity2.class);
        startActivity(shesvla);
    }

    public void onBtnclick2(View view) {
        Intent registracia = new Intent(this, MainActivity3.class);
        startActivity(registracia);
    }
}