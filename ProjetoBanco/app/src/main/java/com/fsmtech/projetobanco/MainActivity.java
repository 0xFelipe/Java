package com.fsmtech.projetobanco;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.fsmtech.projetobanco.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(binding.getRoot(), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        binding.imgSaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent telaSaldo = new Intent(MainActivity.this, Saldo.class);
                startActivity(telaSaldo);
                finish(); //Utilizado para finalizar o contextro atual, ou seja a tela passar ser a intancia principal.
            }
        });

        binding.imgFaturas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent telaFatura = new Intent(MainActivity.this, Faturas.class);
                startActivity(telaFatura);
                finish();
            }
        });

        binding.imgTransferencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent telaTransferencia = new Intent(MainActivity.this, Transferencia.class);
                startActivity(telaTransferencia);
                finish();
            }
        });
        binding.imgPoupanca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent telaPoupanca = new Intent(MainActivity.this, Poupanca.class);
                startActivity(telaPoupanca);
                finish();
            }
        });
    }
}