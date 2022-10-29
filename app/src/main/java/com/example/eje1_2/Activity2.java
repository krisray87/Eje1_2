package com.example.eje1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView nombre;
    TextView apell;
    TextView Edad;
    TextView correo;

    Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Bundle datos = getIntent().getExtras();
        nombre=(TextView) findViewById(R.id.txtnombrer);
        apell=(TextView) findViewById(R.id.txtapellidosr);
        Edad=(TextView) findViewById(R.id.txtedadr);
        correo=(TextView) findViewById(R.id.txtcorreor);
        volver=(Button) findViewById(R.id.btnVolver);
        nombre.setText(datos.getString("nombre"));
        apell.setText(datos.getString("apellido"));
        Edad.setText(datos.getString("edad"));
        correo.setText(datos.getString("correo"));
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}