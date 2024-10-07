package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class ParteUmCapitulos extends AppCompatActivity {

    Integer yPosition;
    Integer xPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte_um_capitulos);

        Intent telaSumario = getIntent();
        String idCapitulo = telaSumario.getStringExtra("idCapitulo");

        setCapitulo(idCapitulo);

        findViewById(R.id.scrollCap).post(new Runnable() {
            @Override
            public void run() {
                findViewById(R.id.scrollCap).scrollTo(xPosition, yPosition);
            }
        });
    }

    public void setCapitulo(String idCapitulo) {
        if (idCapitulo == "quintal") {
            yPosition = findViewById(R.id.pt1Quintal).getScrollY();
            xPosition = findViewById(R.id.pt1Quintal).getScrollX();
        } else if (idCapitulo == "quartobebe") {
            yPosition = findViewById(R.id.pt1QuartoBebe).getScrollY();
            xPosition = findViewById(R.id.pt1QuartoBebe).getScrollX();
        }
    }
}