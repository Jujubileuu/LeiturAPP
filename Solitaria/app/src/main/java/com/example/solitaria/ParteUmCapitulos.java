package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
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

        findViewById(R.id.btnVoltar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaSumario = new Intent(getApplicationContext(), Sumario.class);
                startActivity(telaSumario);
            }
        });
    }
    public void setCapitulo(String idCapitulo) {
        final TextView yPText;
        switch(idCapitulo) {
            case "quintal":
                yPText = findViewById(R.id.pt1Quintal);
                break;
            case "plantabaixa":
                yPText = findViewById(R.id.pt1PlantaBaixa);
                break;
            case "piscina":
                yPText = findViewById(R.id.pt1Piscina);
                break;
            case "cozinha":
                yPText = findViewById(R.id.pt1Cozinha);
                break;
            case "escritorio":
                yPText = findViewById(R.id.pt1Escritorio);
                break;
            case "portaria":
                yPText = findViewById(R.id.pt1Portaria);
                break;
            case "salaofestas":
                yPText = findViewById(R.id.pt1SalaoFestas);
                break;
            case "portao":
                yPText = findViewById(R.id.pt1Portao);
                break;
            case "calcada":
                yPText = findViewById(R.id.pt1Calcada);
                break;
            case "quartobebe":
                yPText = findViewById(R.id.pt1QuartoBebe);
                break;
            case "escadas":
                yPText = findViewById(R.id.pt1Escadas);
                break;
            case "banheiro":
                yPText = findViewById(R.id.pt1Banheiro);
                break;
            case "pracinha":
                yPText = findViewById(R.id.pt1Pracinha);
                break;
            case "recepcao":
                yPText = findViewById(R.id.pt1Recepcao);
                break;
            case "banheirinho":
                yPText = findViewById(R.id.pt1Banheirinho);
                break;
            case "janela":
                yPText = findViewById(R.id.pt1Janela);
                break;
            default:
                yPText = null;
        }

        if (yPText != null) {
            yPText.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    // Remove the listener to avoid multiple calls
                    yPText.getViewTreeObserver().removeOnGlobalLayoutListener(this);

                    // Now get the correct position
                    yPosition = yPText.getTop();
//                    Toast.makeText(ParteUmCapitulos.this, String.valueOf(yPosition), Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}