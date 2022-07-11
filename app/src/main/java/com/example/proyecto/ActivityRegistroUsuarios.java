package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityRegistroUsuarios extends AppCompatActivity {

        Button btnregistrar3;
        TextView txtnombre,txtapellido,txtcuenta,txtemail,txtpassword,txtcorreo,txtcontraseña;
        Spinner listaCarreras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuarios);



        btnregistrar3 = (Button) findViewById(R.id.btnRegistrar3);
        txtnombre = (TextView) findViewById(R.id.txtNombre3);
        txtapellido = (TextView) findViewById(R.id.txtApellido3);
        txtcuenta = (TextView) findViewById(R.id.txtcuenta);
        txtemail = (TextView) findViewById(R.id.txtEmail3);
        txtpassword = (TextView) findViewById(R.id.txtpassword);
        listaCarreras = (Spinner) findViewById(R.id.carreras);




        btnregistrar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validarDatos();

            }
        });



    }

    private void validarDatos() {
        if (txtnombre.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Debe de escribir un nombre" ,Toast.LENGTH_LONG).show();
        }else  if (txtapellido.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Debe de escribir un apellido" ,Toast.LENGTH_LONG).show();
        }else  if (txtcuenta.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Debe de escribir el numero de cuenta" ,Toast.LENGTH_LONG).show();
        }else  if (txtemail.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Debe de escribir el email" ,Toast.LENGTH_LONG).show();
        }else  if (txtpassword.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Debe de escribir la contraseña" ,Toast.LENGTH_LONG).show();
        }
    }
    }
