package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class Perfil extends AppCompatActivity {

    public void trocarConteudo(String idPersonagem) {
        TextView txtInfoGeral = (TextView) findViewById(R.id.txtInfoGeral);
        ImageView imgIcon = (ImageView) findViewById(R.id.imgAutora);
        if (Objects.equals(idPersonagem, "personagem1")) {
            imgIcon.setImageResource(R.drawable.mabelimg);
            txtInfoGeral.setText(getString(R.string.PersonagemID1));
        } else if (Objects.equals(idPersonagem, "personagem2")) {
            imgIcon.setImageResource(R.drawable.euniceimg);
            txtInfoGeral.setText(getString(R.string.PersonagemID2));
        } else if (Objects.equals(idPersonagem, "personagem3")) {
            imgIcon.setImageResource(R.drawable.jo_opedroimg);
            txtInfoGeral.setText(getString(R.string.PersonagemID3));
        } else if (Objects.equals(idPersonagem, "personagem4")) {
            imgIcon.setImageResource(R.drawable.cacauimg);
            txtInfoGeral.setText(getString(R.string.PersonagemID4));
        } else if (Objects.equals(idPersonagem, "personagem5")) {
            imgIcon.setImageResource(R.drawable.jurandirimg);
            txtInfoGeral.setText(getString(R.string.PersonagemID5));
        } else if (Objects.equals(idPersonagem, "personagem6")) {
            imgIcon.setImageResource(R.drawable.thiagoimg);
            txtInfoGeral.setText(getString(R.string.PersonagemID6));
        } else if (Objects.equals(idPersonagem, "personagem7")) {
            imgIcon.setImageResource(R.drawable.luciaimg);
            txtInfoGeral.setText(getString(R.string.PersonagemID7));
        } else if (Objects.equals(idPersonagem, "personagem8")) {
            imgIcon.setImageResource(R.drawable.camilaimg);
            txtInfoGeral.setText(getString(R.string.PersonagemID8));
        } else if (Objects.equals(idPersonagem, "personagem9")) {
            imgIcon.setImageResource(R.drawable.mingalimg);
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

        findViewById(R.id.btnVoltar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaSumario = new Intent(getApplicationContext(), Sumario.class);
                startActivity(telaSumario);
            }
        });
    }
}