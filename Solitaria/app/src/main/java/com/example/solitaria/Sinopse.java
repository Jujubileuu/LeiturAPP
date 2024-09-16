package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sinopse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinopse);

        final boolean[] Animacao = {false};

        findViewById(R.id.btnLinhaTempo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Animacao[0] == true) {
                    Intent telaMain = new Intent(getApplicationContext(), LinhaTempo.class);
                    startActivity(telaMain);
                } else {
                    findViewById(R.id.btnLinhaTempo).animate().translationY(-110f).setDuration(100).start();
                    Animacao[0] = true;
                }
            }
        });
    }
}