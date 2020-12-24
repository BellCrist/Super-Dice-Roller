package com.example.superdiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class AttivitaUnDado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attivita_un_dado);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        metodoLancio();
    }

    public void metodoLancio(){
        Button bottone = findViewById(R.id.button2);
        bottone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomValue = new Random();
                int rollResult = randomValue.nextInt(6) +1;
                TextView risultatoTesto = (TextView) findViewById(R.id.resultTextView);
                risultatoTesto.setText(Integer.toString(rollResult));
                ImageView immagine = (ImageView) findViewById(R.id.imageView2);

                switch (rollResult){
                    case 1:
                        immagine.setImageResource(R.drawable.primafaccia);
                        break;
                    case 2:
                        immagine.setImageResource(R.drawable.secondafaccia);
                        break;
                    case 3:
                        immagine.setImageResource(R.drawable.terzafaccia);
                        break;
                    case 4:
                        immagine.setImageResource(R.drawable.quartafaccia);
                        break;
                    case 5:
                        immagine.setImageResource(R.drawable.quintafaccia);
                        break;
                    case 6:
                        immagine.setImageResource(R.drawable.sestafaccia);
                        break;
                }
            }
        });
    }
}