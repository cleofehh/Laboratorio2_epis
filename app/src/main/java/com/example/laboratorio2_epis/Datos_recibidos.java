package com.example.laboratorio2_epis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Datos_recibidos extends AppCompatActivity {

    TextView d1r,d2r,d3r,d4r,d5r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_recibidos);
        d1r=(TextView)findViewById(R.id.d1r);
        d2r=(TextView)findViewById(R.id.d2r);
        d3r=(TextView)findViewById(R.id.d3r);
        d4r=(TextView)findViewById(R.id.d4r);
        d5r=(TextView)findViewById(R.id.d5r);

        String datito1=getIntent().getStringExtra("dato1");
        String datito2=getIntent().getStringExtra("dato2");
        String datito3=getIntent().getStringExtra("dato3");
        String datito4=getIntent().getStringExtra("dato4");
        String datito5=getIntent().getStringExtra("dato5");

        d1r.setText(datito1);
        d2r.setText(datito2);
        d3r.setText(datito3);
        d4r.setText(datito4);
        d5r.setText(datito5);

    }
}
