package com.example.loginandregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bash);
    }

    //metodo para el boton atras
    public void atras(View view){
        Intent atras = new Intent(this, Seleccion.class);
        startActivity(atras);
    }
}
