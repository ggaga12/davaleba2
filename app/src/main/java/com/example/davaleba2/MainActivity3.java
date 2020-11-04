package com.example.davaleba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button cancel = findViewById(R.id.cancel);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void onBtncancel1(View view) {
        Intent goback = new Intent(this, MainActivity.class);
        startActivity(goback);
    }
}