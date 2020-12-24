package com.example.superdiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.superdiceroller.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();
    }

    public void myButtonListenerMethod(){
        Intent intent = new Intent(this, AttivitaUnDado.class);
        Intent intent1 = new Intent(this, AttivitaDueDadi.class);
        Button bottone = findViewById(R.id.button);
        bottone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputNumero = (EditText) findViewById(R.id.inputNumber);
                String numero = inputNumero.getText().toString();
                int valoreNumero = Integer.parseInt(numero);
                if(valoreNumero > 0 && valoreNumero < 3){
                    switch(valoreNumero){
                        case 1:
                            //richiama l'attività con 1 dado
                            intent.putExtra(EXTRA_MESSAGE, numero);
                            startActivity(intent);
                            break;
                        case 2:
                            //richiama l'attività con 2 dadi
                            intent1.putExtra(EXTRA_MESSAGE, numero);
                            startActivity(intent1);
                            break;
                        default:
                            TextView errore = (TextView) findViewById(R.id.Text1);
                            errore.setText("Numero dadi compreso tra 1 e 2");
                            break;
                    }
                }
            }
        });
    }
}