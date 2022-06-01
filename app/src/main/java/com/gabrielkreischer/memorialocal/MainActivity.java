package com.gabrielkreischer.memorialocal;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences(getString(R.string.pref_key), Context.MODE_PRIVATE);
        Button botao = (Button) findViewById(R.id.btnProximo);
        botao.setOnClickListener(this::mudaActivity);


    }
    public void mudaActivity(View view) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Gabriel", "Teste de Passagem de Valor");
        editor.apply();
        Intent intent = new Intent(this, InicioActivity.class);
        startActivity(intent);
    }
}