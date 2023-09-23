package com.example.tarefa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class IguatemiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iguatemi);
        getSupportActionBar().hide();
    }

    public void btnMapa(View v) {
        Uri uri = Uri.parse("geo:0,0?q=shopping+iguatemi+esplanada");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnSite(View v) {
        Uri uri = Uri.parse("https://iguatemi.com.br/esplanada/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnTelefone(View v) {
        Uri uri = Uri.parse("tel:1530421400");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        int permissionCheck = ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{android.Manifest.permission.CALL_PHONE},1);
        } else {
            startActivity(intent);
        }
    }
}