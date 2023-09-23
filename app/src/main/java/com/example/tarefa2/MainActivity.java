package com.example.tarefa2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void btnTelaIguatemi(View v) {
        Intent intent = new Intent(this, IguatemiActivity.class);
        startActivity(intent);
    }

    public void btnTelaParqueNatural(View v) {
        Intent intent = new Intent(this, ParqueNaturalActivity.class);
        startActivity(intent);
    }

    public void btnTelaZoologico(View v) {
        Intent intent = new Intent(this, ZoologicoActivity.class);
        startActivity(intent);
    }
}