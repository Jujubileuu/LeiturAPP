package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.Loader;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class Perfil extends AppCompatActivity {

    public void trocarConteudo(String idPersonagem) {
        TextView txtInfoGeral = (TextView) findViewById(R.id.txtInfoGeral);
        if (Objects.equals(idPersonagem, "personagem1")) {
            txtInfoGeral.setText(getString(R.string.PersonagemID1));
        } else if (Objects.equals(idPersonagem, "personagem2")) {
            txtInfoGeral.setText(getString(R.string.PersonagemID2));
        } else if (Objects.equals(idPersonagem, "personagem3")) {
            txtInfoGeral.setText(getString(R.string.PersonagemID3));
        } else if (Objects.equals(idPersonagem, "personagem4")) {
            txtInfoGeral.setText(getString(R.string.PersonagemID4));
        } else if (Objects.equals(idPersonagem, "personagem5")) {
            txtInfoGeral.setText(getString(R.string.PersonagemID5));
        } else if (Objects.equals(idPersonagem, "personagem6")) {
            txtInfoGeral.setText(getString(R.string.PersonagemID6));
        } else if (Objects.equals(idPersonagem, "personagem7")) {
            txtInfoGeral.setText(getString(R.string.PersonagemID7));
        } else if (Objects.equals(idPersonagem, "personagem8")) {
            txtInfoGeral.setText(getString(R.string.PersonagemID8));
        } else if (Objects.equals(idPersonagem, "personagem9")) {
            txtInfoGeral.setText(getString(R.string.PersonagemID9));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Intent telaPerfil = getIntent();
        String idPersonagem = telaPerfil.getStringExtra("idPersonagem");

        trocarConteudo(idPersonagem);
    }
}