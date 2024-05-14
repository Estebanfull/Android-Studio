package com.example.Usuarios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.Funcionarios.CrearUsuarioActivity;
import com.example.ikeasistencia.R;

public class MenuUsuariosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usuarios);

        // Puedes realizar cualquier manipulación adicional de vistas aquí según sea necesario
    }

    // Método para alternar la visibilidad del menú principal y los submenús
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

        // Ocultar todos los submenús
        hideAllSubMenus();
    }

    // Método para alternar la visibilidad del submenú de asistencia
    public void toggleAsistenciaSubMenu(View view) {
        LinearLayout submenuAsistencia = findViewById(R.id.submenu_asistencia);

        // Alternar la visibilidad del submenú de asistencia
        if (submenuAsistencia.getVisibility() == View.VISIBLE) {
            submenuAsistencia.setVisibility(View.GONE);
        } else {
            submenuAsistencia.setVisibility(View.VISIBLE);
        }

        // Ocultar los demás submenús
        hideOtherSubMenus(submenuAsistencia);
    }

    // Método para alternar la visibilidad del submenú de perfil
    public void togglePerfilSubMenu(View view) {
        LinearLayout submenuPerfil = findViewById(R.id.submenu_perfil);

        // Alternar la visibilidad del submenú de perfil
        if (submenuPerfil.getVisibility() == View.VISIBLE) {
            submenuPerfil.setVisibility(View.GONE);
        } else {
            submenuPerfil.setVisibility(View.VISIBLE);
        }

        // Ocultar los demás submenús
        hideOtherSubMenus(submenuPerfil);
    }

    // Método para ocultar todos los submenús
    private void hideAllSubMenus() {
        LinearLayout submenuAsistencia = findViewById(R.id.submenu_asistencia);
        LinearLayout submenuPerfil = findViewById(R.id.submenu_perfil);

        submenuAsistencia.setVisibility(View.GONE);
        submenuPerfil.setVisibility(View.GONE);
        // Agrega más submenús aquí si es necesario
    }

    // Método para ocultar todos los submenús excepto el submenú actual
    private void hideOtherSubMenus(LinearLayout currentSubMenu) {
        LinearLayout submenuAsistencia = findViewById(R.id.submenu_asistencia);
        LinearLayout submenuPerfil = findViewById(R.id.submenu_perfil);

        if (submenuAsistencia != currentSubMenu) {
            submenuAsistencia.setVisibility(View.GONE);
        }

        if (submenuPerfil != currentSubMenu) {
            submenuPerfil.setVisibility(View.GONE);
        }
        // Agrega más submenús aquí si es necesario
    }

    // Implementa métodos para manejar las acciones de los botones en los submenús
    public void navigateToCreateAsistencia(View view) {
        startActivity(new Intent(this, CrearAsistenciaActivity.class));
        // Implementa la lógica para navegar a la actividad correspondiente
    }

    public void navigateToModifyAsistencia(View view) {
        startActivity(new Intent(this, ModificarAsistenciaActivity.class));
        // Implementa la lógica para navegar a la actividad correspondiente
    }

    public void navigateToDeleteAsistencia(View view) {
        startActivity(new Intent(this, EliminarAsistenciaActivity.class));
        // Implementa la lógica para navegar a la actividad correspondiente
    }

    public void navigateToModifyPerfil(View view) {
        startActivity(new Intent(this, ModificarPerfilActivity.class));
        // Implementa la lógica para navegar a la actividad correspondiente
    }
}
