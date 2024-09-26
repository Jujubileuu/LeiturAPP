package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Galeria extends AppCompatActivity {

    String idPersonagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        findViewById(R.id.imgPersonagem1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                idPersonagem = "personagem1";
                telaPerfil.putExtra("idPersonagem", idPersonagem);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                idPersonagem = "personagem2";
                telaPerfil.putExtra("idPersonagem", idPersonagem);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                startActivity(telaPerfil);
            }
        });
    }
}