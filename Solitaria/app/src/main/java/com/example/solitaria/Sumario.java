package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sumario extends AppCompatActivity {

    String idCapitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumario);

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

        findViewById(R.id.pt1Quintal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "quintal";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1PlantaBaixa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "plantabaixa";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1Piscina).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "piscina";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1Cozinha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "cozinha";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1Escritorio).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "escritorio";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1Portaria).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "portaria";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1SalaoFestas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "salaofestas";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1Portao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "portao";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1Calcada).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "calcada";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1QuartoBebe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "quartobebe";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1Escadas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "escadas";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1Banheiro).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "banheiro";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1Pracinha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "pracinha";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1Recepcao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "recepcao";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1Banheirinho).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "banheirinho";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });

        findViewById(R.id.pt1Janela).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "janela";
                telaCap.putExtra("idCapitulo", idCapitulo);
                startActivity(telaCap);
            }
        });
    }
}