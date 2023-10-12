package com.example.examenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

import DatosExamen.EstructuraDatos;

public class ExamenActivity extends AppCompatActivity {

    TextView txtpregunta;
    RadioButton r1, r2, r3;

    Button  btnant, btnsig, btncal;

    ArrayList<EstructuraDatos> listadatos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen);

        txtpregunta = findViewById(R.id.txtpregunta);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);

        btnant = findViewById(R.id.btnant);
        btnsig = findViewById(R.id.btnsig);
        btncal = findViewById(R.id.btncal);

        EstructuraDatos ed = new EstructuraDatos();

        ed.setPregunta("Quien es el descrubridor de america");
        ed.setR1("A) Hernan cortes");
        ed.setR2("B) Pancho Villa");
        ed.setR3("C) Cristobal Colon");
        ed.setRc("C");
        listadatos.add(ed);
        ed = new EstructuraDatos();
        ed.setPregunta("Quien pinto la ultima cena");
        ed.setR1("A) Diego Rivera");
        ed.setR2("B) Leonardo Davince");
        ed.setR3("C) Picasso");
        ed.setRc("B");
        listadatos.add(ed);
        ed = new EstructuraDatos();
        ed.setPregunta("Quien es el mejor corredor de formula 1");
        ed.setR1("A) Checo perez");
        ed.setR2("B) Halminton");
        ed.setR3("C) Michael");
        ed.setRc("B");
        listadatos.add(ed);
        EstructuraDatos edm = listadatos.get(0);
        //Log.i("informacion", "valor: " + edm.getPregunta());
        txtpregunta.setText(edm.getPregunta());
        r1.setText(edm.getR1());
        r2.setText(edm.getR2());
        r3.setText(edm.getR3());
    }
}