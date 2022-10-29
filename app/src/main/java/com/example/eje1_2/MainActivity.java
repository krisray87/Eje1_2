package com.example.eje1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.eje1_2.configuracion.SQLiteConexion;
import com.example.eje1_2.tablas.Transacciones;

public class MainActivity extends AppCompatActivity {
    EditText nombre;
    EditText apellido;
    EditText edad;
    EditText correo;
    EditText direccion;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(EditText) findViewById(R.id.txtNombre);
        apellido=(EditText) findViewById(R.id.txtApell);
        edad=(EditText) findViewById(R.id.txtEdad);
        correo=(EditText) findViewById(R.id.txtCorreo);
        direccion=(EditText) findViewById(R.id.txtDireccion);
        enviar=(Button) findViewById(R.id.btnEnviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Activity2.class);
                AgregarPersona();
                startActivity(intent);
            }
        });




    }
    private void AgregarPersona()
    {
        SQLiteConexion conexion = new SQLiteConexion(this, Transacciones.NameDatabase, null, 1);
        SQLiteDatabase db = conexion.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(Transacciones.nombres, nombre.getText().toString());
        valores.put(Transacciones.apellidos, apellido.getText().toString());
        valores.put(Transacciones.edad, edad.getText().toString());
        valores.put(Transacciones.correo, correo.getText().toString());
        valores.put(Transacciones.direccion, direccion.getText().toString());

        Long resultado  = db.insert(Transacciones.TbPersonas, Transacciones.id, valores);

        Toast.makeText(getApplicationContext(), "Registro Ingresado" + resultado.toString()
                , Toast.LENGTH_SHORT).show();

        db.close();

        ClearScreen();
    }


    private void ClearScreen() {
        nombre.setText("");
        apellido.setText("");
        edad.setText("");
        correo.setText("");


    }
}