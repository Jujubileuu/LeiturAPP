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
            case "quartobebe":
                yPText = findViewById(R.id.pt1QuartoBebe);
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
                    Toast.makeText(ParteUmCapitulos.this, String.valueOf(yPosition), Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}