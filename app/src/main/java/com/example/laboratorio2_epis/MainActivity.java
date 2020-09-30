package com.example.laboratorio2_epis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nombre, apellidos, cui, correo, telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(EditText)findViewById(R.id.nombre);
        apellidos=(EditText)findViewById(R.id.apellidos);
        cui=(EditText)findViewById(R.id.cui);
        correo=(EditText)findViewById(R.id.correo);
        telefono=(EditText)findViewById(R.id.telefono);
    }
    public void  Enviar(View view){
        Intent intent=new Intent(this, Datos_recibidos.class);
        intent.putExtra("dato1",nombre.getText().toString());
        intent.putExtra("dato2",apellidos.getText().toString());
        intent.putExtra("dato3", cui.getText().toString());
        intent.putExtra("dato4",correo.getText().toString());
        intent.putExtra("dato5",telefono.getText().toString());
        startActivity(intent);
    }
}
