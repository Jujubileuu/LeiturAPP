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

        final boolean[] Animacao = {false, false, false, false};

//        findViewById(R.id.btnLinhaTempo).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (Animacao[0]) {
//                    Intent telaLinhaTempo = new Intent(getApplicationContext(), LinhaTempo.class);
//                    startActivity(telaLinhaTempo);
//                } else {
//                    findViewById(R.id.btnLinhaTempo).animate().translationY(-105f).setDuration(100).start();
//                    Animacao[0] = true;
//                }
//            }
//        });

        findViewById(R.id.btnSumario).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Animacao[1]) {
                    Intent telaSumario = new Intent(getApplicationContext(), Sumario.class);
                    startActivity(telaSumario);
                } else {
                    findViewById(R.id.btnSumario).animate().translationY(-110f).setDuration(100).start();
                    Animacao[1] = true;
                }
            }
        });

        findViewById(R.id.btnGaleria).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Animacao[2]) {
                    Intent telaGaleria = new Intent(getApplicationContext(), Galeria.class);
                    startActivity(telaGaleria);
                } else {
                    findViewById(R.id.btnGaleria).animate().translationY(-105f).setDuration(100).start();
                    Animacao[2] = true;
                }
            }
        });

        findViewById(R.id.btnAutora).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Animacao[3]) {
                    Intent telaAutora = new Intent(getApplicationContext(), Biografia.class);
                    startActivity(telaAutora);
                } else {
                    findViewById(R.id.btnAutora).animate().translationY(-110f).setDuration(100).start();
                    Animacao[3] = true;
                }
            }
        });

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
                idPersonagem = "personagem3";
                telaPerfil.putExtra("idPersonagem", idPersonagem);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                idPersonagem = "personagem4";
                telaPerfil.putExtra("idPersonagem", idPersonagem);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                idPersonagem = "personagem5";
                telaPerfil.putExtra("idPersonagem", idPersonagem);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                idPersonagem = "personagem6";
                telaPerfil.putExtra("idPersonagem", idPersonagem);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                idPersonagem = "personagem7";
                telaPerfil.putExtra("idPersonagem", idPersonagem);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                idPersonagem = "personagem8";
                telaPerfil.putExtra("idPersonagem", idPersonagem);
                startActivity(telaPerfil);
            }
        });

        findViewById(R.id.imgPersonagem9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaPerfil = new Intent(getApplicationContext(), Perfil.class);
                idPersonagem = "personagem9";
                telaPerfil.putExtra("idPersonagem", idPersonagem);
                startActivity(telaPerfil);
            }
        });
    }
}