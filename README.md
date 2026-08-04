# Alke Wallet - Aplicación de Billetera Digital

Este es el proyecto final para el módulo de desarrollo de aplicaciones móviles. Se trata de **Alke Wallet**, una billetera digital interactiva desarrollada para Android usando **Java y XML en Android Studio**.

La aplicación permite simular la experiencia completa de un usuario desde que ingresa por primera vez, registra su cuenta, inicia sesión y navega por su panel principal para realizar transferencias o ver su perfil.

---

Pantallas y Flujo del Proyecto

El proyecto cuenta con **9 vistas principales** conectadas entre sí:

1. **Splash Screen (`SplashActivity`):** Pantalla de inicio con logo y fondo azul que muestra la marca por 2.5 segundos antes de avanzar automáticamente.
2. **Bienvenida / Landing (`AuthLandingActivity`):** Pantalla inicial para dar la bienvenida al usuario y permitirle elegir entre iniciar sesión o registrarse.
3. **Registro de Usuario (`SignupActivity`):** Formulario para ingresar Nombre, Apellido, Email y Contraseña. Incluye el ojo para mostrar/ocultar la clave.
4. **Inicio de Sesión (`LoginActivity`):** Vista de ingreso para usuarios ya registrados con campos de correo y contraseña.
5. **Pantalla Principal (`MainActivity`):** Panel central personalizado (*"¡Hola, Gabriel!"*) con el balance total ($124.57), acceso rápido a botones de acción y la lista de transacciones recientes.
6. **Enviar Dinero (`SendMoneyActivity`):** Formulario para ingresar el monto a transferir, nota y confirmar el envío de dinero al destinatario.
7. **Ingresar Dinero (`RequestMoneyActivity`):** Formulario para solicitar o cargar saldo a la cuenta.
8. **Mi Perfil (`ProfileActivity`):** Sección donde el usuario ve su foto de perfil personalizada, su nombre completo (*Gabriel Hormazábal Arce*) y un menú con accesos como "Mi Información", "Mis Tarjetas" y "Centro de Ayuda".
9. **Estado Vacío / Empty Case:** Estructura preparada en el diseño para mostrar un mensaje descriptivo cuando no hay transacciones registradas.

---

Tecnologías Utilizadas

* **Entorno de desarrollo:** Android Studio
* **Lenguaje de programación:** Java
* **Diseño de interfaz:** XML (`ConstraintLayout`, `CardView`, `ScrollView`, `LinearLayout`)
* **Control de versiones:** Git y GitHub Desktop

---

¿Cómo probar la aplicación?

1. Clonar o descargar este repositorio.
2. Abrir el proyecto en **Android Studio**.
3. Seleccionar un emulador Android (por ejemplo, *Pixel API 30*).
4. Presionar el botón **Play (▶)** para compilar la aplicación.
5. Iniciar la navegación desde la pantalla de bienvenida.

---

*Desarrollado por Gabriel Hormazábal Arce.*
