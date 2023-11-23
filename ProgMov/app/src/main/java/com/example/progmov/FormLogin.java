package com.example.progmov;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
public class FormLogin extends AppCompatActivity{

    private TextView text_tela_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formlogin);

        getSupportActionBar().hide();

        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormLogin.this, FormCadastro.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponente(){
        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
    }
}
