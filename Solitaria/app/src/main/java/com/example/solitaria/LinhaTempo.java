package com.example.solitaria;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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

        TextView intro = findViewById(R.id.intro);
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
        Button btn8 = findViewById(R.id.linhabtn8);
        Button btn9 = findViewById(R.id.linhabtn9);
        Button btn10 = findViewById(R.id.linhabtn10);
        Button btn11= findViewById(R.id.linhabtn11);
        Button btn12= findViewById(R.id.linhabtn12);
        Button btn13 = findViewById(R.id.linhabtn13);

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaMain = new Intent(getApplicationContext(), Sinopse.class);
                startActivity(telaMain);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setText("");
                textolinha.setText(R.string.testelinha1);
                imagemLinha.setImageResource(R.drawable.linhatempo1);
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(textolinha,"translationY",-25,0);
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imagemLinha,"translationY",25,0);
                animation1.setDuration(200);
                animation2.setDuration(200);
                animation1.start();
                animation2.start();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setText("");
                textolinha.setText(R.string.testelinha2);
                imagemLinha.setImageResource(R.drawable.linhatempo2);
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(textolinha,"translationY",-25,0);
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imagemLinha,"translationY",25,0);
                animation1.setDuration(200);
                animation2.setDuration(200);
                animation1.start();
                animation2.start();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setText("");
                textolinha.setText(R.string.testelinha3);
                imagemLinha.setImageResource(R.drawable.linhatempo3);
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(textolinha,"translationY",-25,0);
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imagemLinha,"translationY",25,0);
                animation1.setDuration(200);
                animation2.setDuration(200);
                animation1.start();
                animation2.start();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setText("");
                textolinha.setText(R.string.testelinha4);
                imagemLinha.setImageResource(R.drawable.linhatempo4);
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(textolinha,"translationY",-25,0);
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imagemLinha,"translationY",25,0);
                animation1.setDuration(200);
                animation2.setDuration(200);
                animation1.start();
                animation2.start();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setText("");
                textolinha.setText(R.string.testelinha5);
                imagemLinha.setImageResource(R.drawable.linhatempo5);
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(textolinha,"translationY",-25,0);
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imagemLinha,"translationY",25,0);
                animation1.setDuration(200);
                animation2.setDuration(200);
                animation1.start();
                animation2.start();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setText("");
                textolinha.setText(R.string.testelinha6);
                imagemLinha.setImageResource(R.drawable.linhatempo6);
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(textolinha,"translationY",-25,0);
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imagemLinha,"translationY",25,0);
                animation1.setDuration(200);
                animation2.setDuration(200);
                animation1.start();
                animation2.start();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setText("");
                textolinha.setText(R.string.testelinha7);
                imagemLinha.setImageResource(R.drawable.linhatempo7);
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(textolinha,"translationY",-25,0);
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imagemLinha,"translationY",25,0);
                animation1.setDuration(200);
                animation2.setDuration(200);
                animation1.start();
                animation2.start();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setText("");
                textolinha.setText(R.string.testelinha7);
                imagemLinha.setImageResource(R.drawable.linhatempo8);
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(textolinha,"translationY",-25,0);
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imagemLinha,"translationY",25,0);
                animation1.setDuration(200);
                animation2.setDuration(200);
                animation1.start();
                animation2.start();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setText("");
                textolinha.setText(R.string.testelinha9);
                imagemLinha.setImageResource(R.drawable.linhatempo9);
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(textolinha,"translationY",-25,0);
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imagemLinha,"translationY",25,0);
                animation1.setDuration(200);
                animation2.setDuration(200);
                animation1.start();
                animation2.start();
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setText("");
                textolinha.setText(R.string.testelinha10);
                imagemLinha.setImageResource(R.drawable.linhatempo10);
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(textolinha,"translationY",-25,0);
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imagemLinha,"translationY",25,0);
                animation1.setDuration(200);
                animation2.setDuration(200);
                animation1.start();
                animation2.start();
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setText("");
                textolinha.setText(R.string.testelinha11);
                imagemLinha.setImageResource(R.drawable.linhatempo11);
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(textolinha,"translationY",-25,0);
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imagemLinha,"translationY",25,0);
                animation1.setDuration(200);
                animation2.setDuration(200);
                animation1.start();
                animation2.start();
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setText("");
                textolinha.setText(R.string.testelinha12);
                imagemLinha.setImageResource(R.drawable.linhatempo12);
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(textolinha,"translationY",-25,0);
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imagemLinha,"translationY",25,0);
                animation1.setDuration(200);
                animation2.setDuration(200);
                animation1.start();
                animation2.start();
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intro.setText("");
                textolinha.setText(R.string.testelinha13);
                imagemLinha.setImageResource(R.drawable.linhatempo13);
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(textolinha,"translationY",-25,0);
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imagemLinha,"translationY",25,0);
                animation1.setDuration(200);
                animation2.setDuration(200);
                animation1.start();
                animation2.start();
            }
        });



    }

}