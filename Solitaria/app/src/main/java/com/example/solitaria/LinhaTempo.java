package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
        ImageButton btn1 = findViewById(R.id.linhabtn1);
        ImageButton btn2 = findViewById(R.id.linhabtn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textolinha.setText(R.string.testelinha1);
                imagemLinha.setImageDrawable(R.drawable.ellipse_2);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textolinha.setText(R.string.testelinha2);
            }
        });

    }

}