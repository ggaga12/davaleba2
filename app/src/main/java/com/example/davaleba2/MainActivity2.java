package com.example.davaleba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button cancel2 = findViewById(R.id.cancel2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onBtncancel2(View view) {
        Intent goback2 = new Intent(this, MainActivity.class);
        startActivity(goback2);
    }
}