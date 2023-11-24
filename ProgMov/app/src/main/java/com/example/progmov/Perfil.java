package com.example.progmov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil);

        getSupportActionBar().hide();
    }
}