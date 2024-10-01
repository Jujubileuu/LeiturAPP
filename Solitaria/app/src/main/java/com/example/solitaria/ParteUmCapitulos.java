package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class ParteUmCapitulos extends AppCompatActivity {

    public void trocarConteudo(String idCapitulo) {
        final int y;
        if (Objects.equals(idCapitulo, "quintal")) {
            y = findViewById(R.id.pt1Quintal).getScrollY();
            findViewById(R.id.scrollCap).scrollTo(0, y);
        } else if (Objects.equals(idCapitulo, "quartobebe")) {
            y = findViewById(R.id.pt1QuartoBebe).getScrollY();
            findViewById(R.id.scrollCap).scrollTo(0, y);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte_um_capitulos);

        Intent telaPerfil = getIntent();
        String idCapitulo = telaPerfil.getStringExtra("idCapitulo");

        trocarConteudo(idCapitulo);
    }
}