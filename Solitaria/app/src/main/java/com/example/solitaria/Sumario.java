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

        findViewById(R.id.pt1Quintal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCap = new Intent(getApplicationContext(), ParteUmCapitulos.class);
                idCapitulo = "quintal";
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
    }
}