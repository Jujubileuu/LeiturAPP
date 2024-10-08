package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class ParteUmCapitulos extends AppCompatActivity {

    int yPosition = 0;

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
                findViewById(R.id.scrollCap).scrollTo(0, yPosition);
            }
        });
    }

    public void setCapitulo(String idCapitulo) {
        TextView yPText;
        switch(idCapitulo) {
            case "quintal":
                yPText = findViewById(R.id.pt1Quintal);
                yPosition = yPText.getScrollY();
                break;
            case "quartobebe":
                yPText = findViewById(R.id.pt1QuartoBebe);
                yPosition = yPText.getScrollY();
                break;
        }
        Toast.makeText(this, String.valueOf(yPosition), Toast.LENGTH_LONG).show();
    }
}