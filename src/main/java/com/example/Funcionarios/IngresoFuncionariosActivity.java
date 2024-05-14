package com.example.Funcionarios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ikeasistencia.R;

public class IngresoFuncionariosActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private TextView errorMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_funcionarios);

        // Inicializar vistas
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        errorMessageTextView = findViewById(R.id.errorMessageTextView);
    }

    private boolean verificarCredenciales(String username, String password) {
        // Verificar credenciales hardcodeadas
        return username.equals("jeison") && password.equals("142536");
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
                // Credenciales correctas, redirigir a la actividad MenuFuncionariosActivity
                Intent intent = new Intent(IngresoFuncionariosActivity.this, MenuFuncionariosActivity.class);
                startActivity(intent);
            } else {
                // Credenciales incorrectas, mostrar mensaje de error
                errorMessageTextView.setText("Credenciales incorrectas. Por favor, inténtalo de nuevo.");
                errorMessageTextView.setVisibility(View.VISIBLE);
            }
        }
    }
}
