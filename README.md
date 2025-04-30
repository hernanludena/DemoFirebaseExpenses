# Expenses - Aplicación de Registro de Gastos para Android

**Expenses** es una aplicación móvil desarrollada para dispositivos Android que te permite llevar un control fácil y eficiente de tus gastos.  
Utiliza Firebase para el almacenamiento de datos en la nube, lo que garantiza la seguridad y disponibilidad de tu información.

## Características Principales

* **Registro de Gastos:** Añade rápidamente nuevos gastos con detalles como descripción, monto y fecha.
* **Historial de Gastos:** Visualiza una lista completa de todos tus gastos registrados, ordenados por fecha.
* **Total de Gastos:** Obtén un resumen del monto total gastado.
* **Filtro por Fecha:** Consulta los gastos realizados en una fecha específica.
* **Interfaz Intuitiva:** Diseño limpio y fácil de usar para una experiencia de usuario óptima.

## Tecnologías Utilizadas

* **Android:** Desarrollo nativo para la plataforma Android.
* **Jetpack Compose:** Framework moderno de UI declarativo para Android.
* **Kotlin:** Lenguaje de programación utilizado para el desarrollo.
* **Firebase:**
    * **Firestore:** Base de datos NoSQL para el almacenamiento de datos.
    * **Analytics:** (Opcional) Para el seguimiento del uso de la app.

## Arquitectura

La aplicación sigue un patrón de arquitectura **MVVM (Model-View-ViewModel)**:

* **Modelo:** Representa las clases de datos (`Expense`).
* **Vista:** Implementada con Compose, muestra la información al usuario y permite la interacción.
* **ViewModel:** Gestiona la lógica de la aplicación y prepara los datos para la vista.

## Instalación

1.  Clona el repositorio: `git clone [[URL_DEL_REPOSITORIO](https://github.com/hernanludena/DemoFirebaseExpenses)]`
2.  Abre el proyecto en Android Studio.
3.  Asegúrate de tener Android Studio configurado con el SDK y las herramientas de compilación necesarias.
4.  Conecta un dispositivo Android físico o utiliza un emulador.
5.  Ejecuta la aplicación.

## Configuración de Firebase

1.  Crea un proyecto en la consola de Firebase.
2.  Configura Firestore para tu proyecto.
3.  Obtén el archivo `google-services.json` de tu proyecto Firebase.
4.  Coloca el archivo `google-services.json` en el directorio `app/` de tu proyecto Android Studio.
5.  Asegúrate de que las dependencias de Firebase estén configuradas correctamente en tu archivo `build.gradle.kts` (a nivel del módulo `app`).

## Próximas Mejoras

* Categorización de gastos.
* Gráficos para visualizar los gastos.
* Funcionalidad de edición y eliminación de gastos.
* Autenticación de usuarios.

## Contribución

¡Las contribuciones son bienvenidas! Si deseas mejorar esta aplicación, siéntete libre de crear un *fork* del repositorio y enviar *pull requests*.

## Licencia

Este proyecto está licenciado bajo la Licencia Apache 2.0.

## Contacto

[Hernan Ludena]
