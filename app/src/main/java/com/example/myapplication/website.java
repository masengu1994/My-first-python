package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class website extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
    }
    mWeb = findViewById(R.id.my_web);
    WebSettings settings = mWeb.getSettings();
    settings.setJavaScriptEnabled(true);
    mWeb.loadUrl("https://www.emobilis.ac.ke/");

}