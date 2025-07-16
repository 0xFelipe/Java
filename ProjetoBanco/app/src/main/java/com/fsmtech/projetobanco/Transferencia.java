package com.fsmtech.projetobanco;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.fsmtech.projetobanco.databinding.ActivityPoupancaBinding;
import com.fsmtech.projetobanco.databinding.ActivitySaldoBinding;
import com.fsmtech.projetobanco.databinding.ActivityTransferenciaBinding;

public class Transferencia extends AppCompatActivity {
    private ActivityTransferenciaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityTransferenciaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(binding.getRoot(), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.toolbarTransferencia.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent voltarTelaPrincipal = new Intent(Transferencia.this, MainActivity.class);
                startActivity(voltarTelaPrincipal);
            }
        });
    }
}