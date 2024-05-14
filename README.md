
Ike Asistencia - Aplicación Android
Este repositorio contiene el código fuente de la aplicación Ike Asistencia para dispositivos Android.

Descripción
Ike Asistencia es una aplicación móvil diseñada para gestionar la asistencia técnica y proveer servicios relacionados a través de una plataforma intuitiva y fácil de usar. La aplicación está dirigida tanto a usuarios finales como a funcionarios de la empresa, proporcionando funcionalidades específicas para cada tipo de usuario.

Estructura del Proyecto
El proyecto está organizado de la siguiente manera:

src/main/java: Contiene el código fuente Java de la aplicación.
com.example: Paquete principal de la aplicación.
MainActivity.java: Actividad principal de la aplicación.

Funcionarios: Paquete que contiene las actividades relacionadas con los funcionarios.
FuncionariosIngresoFuncionariosActivity.java: Actividad de inicio de sesión para los funcionarios.
MenuFuncionariosActivity.java: Actividad del menú principal para los funcionarios.

CrearUsuarioActivity.java: Actividad para crear nuevos usuarios.
ModificarUsuariosActivity.java: Actividad para modificar usuarios existentes.
EliminarUsuariosActivity.java: Actividad para eliminar usuarios.

CrearTrabajadorActivity.java: Actividad para crear nuevos trabajadores.
ModificarTrabajadorActivity.java: Actividad para modificar trabajadores existentes.
EliminarTrabajadorActivity.java: Actividad para eliminar trabajadores.

CrearProveedorActivity.java: Actividad para crear nuevos proveedores.
ModificarProveedorActivity.java: Actividad para modificar proveedores existentes.
EliminarProveedorActivity.java: Actividad para eliminar proveedores.

CrearTecnicoActivity.java: Actividad para crear nuevos técnicos.
ModificarTecnicoActivity.java: Actividad para modificar técnicos existentes.
EliminarTecnicoActivity.java: Actividad para eliminar técnicos.


Usuarios: Paquete que contiene las actividades relacionadas con los usuarios finales.
FuncionariosIngresoFuncionariosActivity.java: Actividad de inicio de sesión para los usuarios finales.
MenuUsuariosActivity.java: Actividad del menú principal para los usuarios finales.

CrearAsistenciaActivity.java: Actividad para crear nuevas asistencias.
ModificarAsistenciaActivity.java: Actividad para modificar asistencias existentes.
EliminarAsistenciaActivity.java: Actividad para eliminar asistencias.

ModificarPerfilActivity.java: Actividad para modificar el perfil del usuario.


src/main/res: Contiene los recursos de la aplicación, como archivos de diseño XML y recursos gráficos.
drawable: Directorio para imágenes y otros recursos gráficos.
values: Directorio para archivos XML de valores, como estilos y cadenas de texto.
layout: Directorio para los archivos XML de diseño de las actividades de la aplicación.




src
├── main
│   ├── AndroidManifest.xml
│   ├── java
│   │   └── com
│   │       └── example
│   │           ├── MainActivity.java
│   │           ├── Funcionarios
│   │           │   ├── FuncionariosIngresoFuncionariosActivity.java
│   │           │   ├── MenuFuncionariosActivity.java
│   │           │   ├── CrearUsuarioActivity.java
│   │           │   ├── ModificarUsuariosActivity.java
│   │           │   └── EliminarUsuariosActivity.java
│   │           └── Usuarios
│   │               ├── FuncionariosIngresoFuncionariosActivity.java
│   │               ├── MenuUsuariosActivity.java
│   │               ├── ModificarPerfilActivity.java
│   │               ├── CrearAsistenciaActivity.java
│   │               ├── ModificarAsistenciaActivity.java
│   │               └── EliminarAsistenciaActivity.java
│   ├── res
│   │   ├── drawable
│   │   │   └── (imagenes)
│   │   ├── values
│   │   │   └── (estilos)
│   │   └── layout
│   │       ├── activity_main.xml
│   │       ├── activity_ingreso_usuarios.xml
│   │       ├── activity_ingreso_funcionarios.xml
│   │       ├── activity_menu_usuarios.xml
│   │       ├── activity_menu_funcionarios.xml
│   │       ├── activity_submenu_usuarios.xml
│   │       └── activity_submenu_funcionarios.xml
└── data
    └── java
        └── data
            └── MySQLiteOpenHelper.java


Configuración y Uso
Para ejecutar la aplicación en un entorno de desarrollo local, sigue estos pasos:

Clona este repositorio en tu máquina local.
Abre el proyecto en Android Studio.
Configura un emulador de dispositivo Android o conecta un dispositivo físico.
Ejecuta la aplicación desde Android Studio.

## Características Principales

Instrucciones de Ingreso

Usuarios
Para acceder como usuario, utiliza las siguientes credenciales:

Nombre de Usuario: Esteban
Contraseña: 142536
Funcionarios
Para acceder como funcionario, utiliza las siguientes credenciales:

Nombre de Usuario: jeison
Contraseña: 142536
Estas credenciales son solo para propósitos de demostración. En un entorno real, se implementaría un sistema de autenticación más seguro.

- Creación, modificación y eliminación de usuarios, trabajadores, proveedores y técnicos de asistencia.
- Solicitud de asistencia.
- Modificar Perfil.
- Menús diferenciados para usuarios y funcionarios.


  

## Estructura de la Aplicación

La aplicación sigue una estructura MVC (Modelo-Vista-Controlador):

- `Modelos`: Contiene las clases de modelo para representar datos.
- `Vistas`: Contiene archivos XML para las interfaces de usuario.
- `Controladores`: Contiene las actividades y fragmentos que actúan como controladores.

## Dependencias

La aplicación puede tener dependencias adicionales que se gestionan a través del archivo `build.gradle` en la carpeta `app`.

## Ejecución

1. Abre el proyecto en Android Studio.
2. Espera a que se carguen las dependencias.
3. Ejecuta la aplicación en un emulador o dispositivo Android.
