package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView txtusuario, txtcontraseña;
    Button btnagregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnagregar = (Button) findViewById(R.id.btnagregar);
        txtusuario = (TextView) findViewById(R.id.txtusuario);
        txtcontraseña = (TextView) findViewById(R.id.txtcontraseña);

        btnagregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validarDatos();

            }
        });



        }

    private void validarDatos() {
        if (txtusuario.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Debe de escribir un Usuario" ,Toast.LENGTH_LONG).show();
        }else  if (txtcontraseña.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Debe de escribir la contraseña" ,Toast.LENGTH_LONG).show();
        }
    }
}

