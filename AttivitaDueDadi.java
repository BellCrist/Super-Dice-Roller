package com.example.superdiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class AttivitaDueDadi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attivita_due_dadi);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        metodoLancioDoppio();
    }

    public void metodoLancioDoppio(){
        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random oggettoRand = new Random();
                int valoreCasuale = oggettoRand.nextInt(6) +1;
                int secondoValoreCausale = oggettoRand.nextInt(6) +1;
                int totale = valoreCasuale + secondoValoreCausale;
                TextView areaTesto = (TextView) findViewById(R.id.textViewRisultato);
                areaTesto.setText(Integer.toString(totale));
                ImageView fotoUno = (ImageView) findViewById(R.id.primoDado);
                ImageView fotoDue = (ImageView) findViewById(R.id.secondoDado);

                switch(valoreCasuale){
                    case 1:
                        fotoUno.setImageResource(R.drawable.primafaccia);
                        break;
                    case 2:
                        fotoUno.setImageResource(R.drawable.secondafaccia);
                        break;
                    case 3:
                        fotoUno.setImageResource(R.drawable.terzafaccia);
                        break;
                    case 4:
                        fotoUno.setImageResource(R.drawable.quartafaccia);
                        break;
                    case 5:
                        fotoUno.setImageResource(R.drawable.quintafaccia);
                        break;
                    case 6:
                        fotoUno.setImageResource(R.drawable.sestafaccia);
                        break;
                }

                switch(secondoValoreCausale){
                    case 1:
                        fotoDue.setImageResource(R.drawable.primafaccia);
                        break;
                    case 2:
                        fotoDue.setImageResource(R.drawable.secondafaccia);
                        break;
                    case 3:
                        fotoDue.setImageResource(R.drawable.terzafaccia);
                        break;
                    case 4:
                        fotoDue.setImageResource(R.drawable.quartafaccia);
                        break;
                    case 5:
                        fotoDue.setImageResource(R.drawable.quintafaccia);
                        break;
                    case 6:
                        fotoDue.setImageResource(R.drawable.sestafaccia);
                        break;
                }
            }
        });
    }
}