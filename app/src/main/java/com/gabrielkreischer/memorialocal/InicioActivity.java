package com.gabrielkreischer.memorialocal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class InicioActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    TextView txtMudar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        txtMudar = (TextView)  findViewById(R.id.txtMudar);

        sharedPreferences = getSharedPreferences(getString(R.string.pref_key), Context.MODE_PRIVATE);
        String result = sharedPreferences.getString("Gabriel", "");
        txtMudar.setText("Resultado --> " + result);
    }
}