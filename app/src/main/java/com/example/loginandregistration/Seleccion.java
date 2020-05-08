package com.example.loginandregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Seleccion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);
    }


    //metodo para script
    public void bash(View script){
        Intent shell = new Intent(this, bash.class);
        startActivity(shell);
    }

    //metodo para el php
    public void php(View view){
        Intent php = new Intent(this, HomeActivity.class);
        startActivity(php);
    }
    //metodo para el java
    public void java(View java){
        Intent java_ = new Intent(this, HomeActivity.class);
        startActivity(java_);
    }
    //metodo para el mysql
    public void mysql(View view){
        Intent mysql = new Intent(this, HomeActivity.class);
        startActivity(mysql);
    }
    //metodo para el phyton
    public void phyton(View view){
        Intent phyton = new Intent(this, HomeActivity.class);
        startActivity(phyton);
    }
    //metodo para el Java Script
    public void javaS(View view){
        Intent javaS = new Intent(this, HomeActivity.class);
        startActivity(javaS);
    }

    //metodo para el boton cuenta
    public void cuenta(View view) {
        Intent cuenta = new Intent(this, HomeActivity.class);
        startActivity(cuenta);
    }

}
