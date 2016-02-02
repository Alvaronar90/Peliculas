package com.example.estacionvl_tc_014.estrenos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class segundaPantallaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
        String nombre = getIntent().getStringExtra("nombre");

        TextView txt = (TextView) findViewById(R.id.txt);
        txt.setText(nombre);
    }
}
