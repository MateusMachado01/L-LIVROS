package com.example.efeitosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtTexto = findViewById(R.id.txtTexto);

        Button btnTransparencia = findViewById(R.id.btnTransparencia);
        btnTransparencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtTexto.setAlpha(0.5f);
            }
        });
        TextView txtAnimacao = findViewById(R.id.txtAnimacao);
        Button btnAnimacao = findViewById(R.id.btnAnimacao);
        btnAnimacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animation = ObjectAnimator.ofFloat(txtAnimacao, "rotation", 0f, 360f);
                animation.setDuration(1000);
                animation.setRepeatCount(ValueAnimator.INFINITE);
                animation.start();
            }
        });
        TextView txtTransicao = findViewById(R.id.txtTransicao);
        Button btnTransicao = findViewById(R.id.btnTransicao);
        btnTransicao.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtTransicao.animate().translationX(200f).setDuration(500).start();
            }
        }));
        TextView txtTransicaobaixo = findViewById(R.id.txtTransicaobaixo);
        Button btnTransicaobaixo = findViewById(R.id.btnTransicaobaixo);
        btnTransicaobaixo.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtTransicaobaixo.animate().translationY(200f).setDuration(500).start();
            }
        }));
        TextView txtAnimacao2 = findViewById(R.id.txtAnimacao2);
        Button btnAnimacao2 = findViewById(R.id.btnAnimacao2);
        btnAnimacao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animation = ObjectAnimator.ofFloat(txtAnimacao2, "rotation", 0f, -360f);
                animation.setDuration(1000);
                animation.setRepeatCount(ValueAnimator.INFINITE);
                animation.start();
            }
        });
    }
}