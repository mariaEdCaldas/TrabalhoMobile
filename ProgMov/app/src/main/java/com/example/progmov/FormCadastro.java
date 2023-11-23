package com.example.progmov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_cadastro);

        getSupportActionBar().hide();
    }
}