package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Biografia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biografia);

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

        findViewById(R.id.btnInfo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                urlListener("http://www.letras.ufmg.br/literafro/autoras/1159-eliana-alves-cruz");
            }
        });
    }

    private void urlListener (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}