package com.example.Usuarios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ikeasistencia.R;

public class IngresoUsuariosActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private TextView errorMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_usuarios);

        // Inicializar vistas
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        errorMessageTextView = findViewById(R.id.errorMessageTextView);
    }

    private boolean verificarCredenciales(String username, String password) {
        // Aquí puedes implementar la lógica de verificación de credenciales
        // Por ejemplo, puedes comparar las credenciales con una base de datos local o enviar una solicitud al servidor

        // Verificar credenciales hardcodeadas (solo para demostración)
        return username.equals("Esteban") && password.equals("142536");
    }

    public void onLoginButtonClick(View view) {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (username.isEmpty() || password.isEmpty()) {
            errorMessageTextView.setText("Por favor, completa todos los campos.");
            errorMessageTextView.setVisibility(View.VISIBLE);
        } else {
            // Verificar credenciales
            if (verificarCredenciales(username, password)) {
                // Credenciales correctas, redirigir a la actividad MenuUsuariosActivity
                Intent intent = new Intent(IngresoUsuariosActivity.this, MenuUsuariosActivity.class);
                startActivity(intent);
            } else {
                // Credenciales incorrectas, mostrar mensaje de error
                errorMessageTextView.setText("Credenciales incorrectas. Por favor, inténtalo de nuevo.");
                errorMessageTextView.setVisibility(View.VISIBLE);
            }
        }
    }
}
