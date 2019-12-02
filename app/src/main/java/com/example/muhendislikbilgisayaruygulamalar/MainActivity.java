package com.example.muhendislikbilgisayaruygulamalar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button giris = findViewById(R.id.girisButonu);
        final Button hakkimizda = findViewById(R.id.hakkimizdaButonu);

        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anaEkran = new Intent(MainActivity.this, AnaEkran.class);
                startActivity(anaEkran);
            }
        });

        hakkimizda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hakkimizdaEkrani = new Intent(MainActivity.this, HakkimizdaEkrani.class);
                startActivity(hakkimizdaEkrani);
            }
        });





    }
}
