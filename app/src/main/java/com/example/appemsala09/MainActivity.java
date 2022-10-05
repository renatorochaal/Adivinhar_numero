package com.example.appemsala09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    protected TextView txtSorteado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtSorteado = findViewById(R.id.Sorteado);

    }
public void jogar(View v)
{
    Random gerador = new Random();
    int numero;
    numero = gerador.nextInt(10);
    txtSorteado.setText(String.valueOf(numero));

}
}