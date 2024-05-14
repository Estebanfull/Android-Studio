package com.example;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Funcionarios.IngresoFuncionariosActivity;
import com.example.Usuarios.IngresoUsuariosActivity;
import com.example.ikeasistencia.R;

import data.MySQLiteOpenHelper;

public class MainActivity extends AppCompatActivity {

    private MySQLiteOpenHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ingresoUsuariosButton = findViewById(R.id.ingresoUsuariosButton);
        Button ingresoFuncionariosButton = findViewById(R.id.ingresoFuncionariosButton);

        // Crear una instancia de MySQLiteOpenHelper
        dbHelper = new MySQLiteOpenHelper(this);

        // Intentar conectar a la base de datos
        if (dbHelper != null) {
            // La conexión a la base de datos fue exitosa
            Toast.makeText(this, "Conexión exitosa a la base de datos", Toast.LENGTH_SHORT).show();
        } else {
            // La conexión a la base de datos falló
            Toast.makeText(this, "Error al conectar a la base de datos", Toast.LENGTH_SHORT).show();
        }

        ingresoUsuariosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar la actividad de ingreso de usuarios
                startActivity(new Intent(MainActivity.this, IngresoUsuariosActivity.class));
            }
        });

        ingresoFuncionariosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar la actividad de ingreso de funcionarios
                startActivity(new Intent(MainActivity.this, IngresoFuncionariosActivity.class));
            }
        });
    }
}
