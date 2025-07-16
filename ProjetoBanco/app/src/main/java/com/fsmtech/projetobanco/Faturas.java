package com.fsmtech.projetobanco;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.fsmtech.projetobanco.databinding.ActivityFaturasBinding;
import com.fsmtech.projetobanco.databinding.ActivitySaldoBinding;
import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;

public class Faturas extends AppCompatActivity {
    private ActivityFaturasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityFaturasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(binding.getRoot(), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.toolbarFaturas.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent voltarTelaPrincipal = new Intent(Faturas.this, MainActivity.class);
                startActivity(voltarTelaPrincipal);
            }
        });

                CreditCardView cartaoDeCredito = binding.cartaoDeCredito;
                cartaoDeCredito.setCardNumber("1234 5678 9012 1234");
                cartaoDeCredito.setCardName("Felipe Mendes");
                cartaoDeCredito.setExpiryDate("11/26");
                cartaoDeCredito.setType(CardType.MASTERCARD);


    }
}