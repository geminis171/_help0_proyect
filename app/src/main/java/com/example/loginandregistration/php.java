package com.example.loginandregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class php extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php);
    }

    //metodo para el boton atras
    public void atras(View view){
        Intent atras = new Intent(this, Seleccion.class);
        startActivity(atras);
    }
}
