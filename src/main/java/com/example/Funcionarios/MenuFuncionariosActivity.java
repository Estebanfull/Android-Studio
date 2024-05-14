package com.example.Funcionarios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.ikeasistencia.R;

public class MenuFuncionariosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_funcionarios);

        // Puedes realizar cualquier manipulación adicional de vistas aquí según sea necesario
    }

    public void toggleSubMenu(View view) {
        ScrollView menuScroll = findViewById(R.id.menu_scroll);
        LinearLayout menuList = findViewById(R.id.menu_list);

        // Alternar la visibilidad del menú principal
        if (menuScroll.getVisibility() == View.VISIBLE) {
            menuScroll.setVisibility(View.GONE);
            menuList.setVisibility(View.GONE);
        } else {
            menuScroll.setVisibility(View.VISIBLE);
            menuList.setVisibility(View.VISIBLE);
        }
    }

    public void toggleUserSubMenu(View view) {
        LinearLayout submenuUsuarios = findViewById(R.id.submenu_usuarios);

        // Alternar la visibilidad del submenú de usuarios
        if (submenuUsuarios.getVisibility() == View.VISIBLE) {
            submenuUsuarios.setVisibility(View.GONE);
        } else {
            submenuUsuarios.setVisibility(View.VISIBLE);
        }
    }

    public void toggleWorkerSubMenu(View view) {
        LinearLayout submenuTrabajadores = findViewById(R.id.submenu_trabajadores);

        // Alternar la visibilidad del submenú de trabajadores
        if (submenuTrabajadores.getVisibility() == View.VISIBLE) {
            submenuTrabajadores.setVisibility(View.GONE);
        } else {
            submenuTrabajadores.setVisibility(View.VISIBLE);
        }
    }

    public void toggleProviderSubMenu(View view) {
        LinearLayout submenuProveedores = findViewById(R.id.submenu_proveedores);

        // Alternar la visibilidad del submenú de proveedores
        if (submenuProveedores.getVisibility() == View.VISIBLE) {
            submenuProveedores.setVisibility(View.GONE);
        } else {
            submenuProveedores.setVisibility(View.VISIBLE);
        }
    }

    public void toggleTechnicianSubMenu(View view) {
        LinearLayout submenuTecnicos = findViewById(R.id.submenu_tecnicos);

        // Alternar la visibilidad del submenú de técnicos
        if (submenuTecnicos.getVisibility() == View.VISIBLE) {
            submenuTecnicos.setVisibility(View.GONE);
        } else {
            submenuTecnicos.setVisibility(View.VISIBLE);
        }
    }




    // Métodos para las acciones de los botones dentro del submenú de usuarios
    public void navigateToCreateUser(View view) {
        startActivity(new Intent(this, CrearUsuarioActivity.class));
        // Aquí debes implementar la lógica para navegar a la pantalla de creación de usuario

    }

    public void navigateToModifyUsers(View view) {
        startActivity(new Intent(this, ModificarUsuariosActivity.class));

        // Aquí debes implementar la lógica para navegar a la pantalla de modificación de usuarios
    }

    public void navigateToCreateWorker(View view) {
        startActivity(new Intent(this, CrearTrabajadorActivity.class));
    }

    public void navigateToModifyWorkers(View view) {
        startActivity(new Intent(this, ModificarTrabajadorActivity.class));
    }

    public void navigateToDeleteWorker(View view) {
        startActivity(new Intent(this, EliminarTrabajadorActivity.class));
    }

    public void navigateToCreateProvider(View view) {
        startActivity(new Intent(this, CrearProveedorActivity.class));
    }

    public void navigateToModifyProvider(View view) {
        startActivity(new Intent(this, ModificarProveedorActivity.class));
    }

    public void navigateToDeleteProvider(View view) {
        startActivity(new Intent(this, EliminarProveedorActivity.class));
    }

    public void navigateToCreateTechnician(View view) {
        startActivity(new Intent(this, CrearTecnicoActivity.class));
    }

    public void navigateToModifyTechnician(View view) {
        startActivity(new Intent(this, ModificarTecnicoActivity.class));
    }

    public void navigateToDeleteTechnician(View view) {
        startActivity(new Intent(this, EliminarTecnicoActivity.class));
    }
}
