package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class LinhaTempo extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linha_tempo);

        TextView textolinha = findViewById(R.id.textolinhatempo);
        ImageView imagemLinha = findViewById(R.id.imagemlinha);
        Button sair = findViewById(R.id.sair);
        Button btn1 = findViewById(R.id.linhabtn1);
        Button btn2 = findViewById(R.id.linhabtn2);
        Button btn3 = findViewById(R.id.linhabtn3);
        Button btn4 = findViewById(R.id.linhabtn4);
        Button btn5 = findViewById(R.id.linhabtn5);
        Button btn6 = findViewById(R.id.linhabtn6);
        Button btn7 = findViewById(R.id.linhabtn7);

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(telaMain);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textolinha.setText(R.string.testelinha1);
                imagemLinha.setImageResource(R.drawable.ellipse_2);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textolinha.setText(R.string.testelinha2);
                imagemLinha.setImageResource(R.drawable.noggadig);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textolinha.setText(R.string.testelinha3);
                imagemLinha.setImageResource(R.drawable.book);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textolinha.setText(R.string.testelinha4);
                imagemLinha.setImageResource(R.drawable.ellipse_2);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textolinha.setText(R.string.testelinha5);
                imagemLinha.setImageResource(R.drawable.ellipse_2);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textolinha.setText(R.string.testelinha6);
                imagemLinha.setImageResource(R.drawable.ellipse_2);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textolinha.setText(R.string.testelinha7);
                imagemLinha.setImageResource(R.drawable.ellipse_2);
            }
        });

    }

}