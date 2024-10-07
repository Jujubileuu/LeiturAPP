package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class LinhaTempo extends AppCompatActivity {

    TextView textolinha = findViewById(R.id.textolinhatempo);
    ImageButton btn1 = findViewById(R.id.linhabtn1);
    ImageButton btn2 = findViewById(R.id.linhabtn2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linha_tempo);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textolinha.setText("@testelinha1");
            }
        });

    }

}