package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public class ParteDoisCapitulos extends AppCompatActivity {

    int yPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte_dois_capitulos);

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
                yPText = findViewById(R.id.pt2Quintal);
                break;
            case "salaestar":
                yPText = findViewById(R.id.pt2SalaEstar);
                break;
            case "jardim":
                yPText = findViewById(R.id.pt2Jardim);
                break;
            case "parede":
                yPText = findViewById(R.id.pt2Parede);
                break;
            case "quartodespejo":
                yPText = findViewById(R.id.pt2QuartoDespejo);
                break;
            case "salinha":
                yPText = findViewById(R.id.pt2Salinha);
                break;
            case "areaservico":
                yPText = findViewById(R.id.pt2AreaServico);
                break;
            case "capela":
                yPText = findViewById(R.id.pt2Capela);
                break;
            case "portaentrada":
                yPText = findViewById(R.id.pt2PortaEntrada);
                break;
            case "chao":
                yPText = findViewById(R.id.pt2Chao);
                break;
            case "criadamuda":
                yPText = findViewById(R.id.pt2CriadaMuda);
                break;
            case "telefone":
                yPText = findViewById(R.id.pt2Telefone);
                break;
            case "espelhocristal":
                yPText = findViewById(R.id.pt2EspelhoCristal);
                break;
            case "laje":
                yPText = findViewById(R.id.pt2Laje);
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