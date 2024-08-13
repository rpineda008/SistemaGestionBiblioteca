# SistemaGestionBiblioteca
Práctica Entrenamiento MakingDevs 
Ejercicio de Programación y Desarrollo en Grails: Sistema de Gestión de Biblioteca.
El objetivo de este proyecto es desarrollar un sistema de gestión de biblioteca que permita a los usuarios buscar, añadir, editar y eliminar libros y autores. El sistema también deberá gestionar préstamos de libros a usuarios registrados.
Crear clases de dominio para Autor, Libro y Usuario.
Autor debe tener un nombre y una lista de libros.
Libro debe tener título, ISBN, autor y estado (disponible o prestado).
Usuario debe tener nombre, correo electrónico y una lista de libros prestados.

Proyecto Spring Boot
### Ejercicio de Programación y Desarrollo en Grails: Sistema de Gestión de Biblioteca

#### Descripción del Proyecto
El objetivo de este proyecto es desarrollar un sistema de gestión de biblioteca que permita a los usuarios buscar, añadir, editar y eliminar libros y autores. El sistema también deberá gestionar préstamos de libros a usuarios registrados.

#### Requisitos Funcionales
1. **Modelo**:
Crear clases de dominio para Autor, Libro y Usuario.
Autor debe tener un nombre y una lista de libros.
Libro debe tener título, ISBN, autor y estado (disponible o prestado).
Usuario debe tener nombre, correo electrónico y una lista de libros prestados.

2. **Vista**:
   - Crear vistas para listar, añadir, editar y eliminar autores y libros.
   - Crear vistas para el registro de usuarios y préstamo de libros.

3. **Controladores**:
   - Implementar controladores para gestionar las operaciones CRUD sobre autores, libros y usuarios.
   - Implementar lógica para prestar y devolver libros.

4. **Migración de Base de Datos**:
   - Usar Liquibase para gestionar la migración de la base de datos.
   - Definir scripts de cambio para la creación inicial de tablas y cualquier modificación estructural futura.

5. **Beans de Spring**:
   - Configurar beans de Spring para servicios personalizados, por ejemplo, un servicio de notificación.

6. **Internacionalización (i18n)**:
   - Soportar inglés y español para todas las etiquetas y mensajes en la aplicación.

7. **Servicios y Transacciones**:
   - Crear servicios para manejar la lógica de negocio, como la gestión de préstamos.
   - Asegurarse de que los métodos de servicio que modifican la base de datos sean transaccionales.

8. **Decoradores de Sitio Web con CSS y un Diseño Personalizado**:
   - Utilizar SASS para escribir CSS más eficiente.
   - Implementar un diseño responsivo con Bootstrap.

#### Detalles de Implementación

##### Paso 1: Configuración del Entorno y Estructura del Proyecto
- Crear un nuevo proyecto Grails.
- Configurar dependencias para Liquibase, Spring Security, y cualquier otro plugin necesario.

##### Paso 2: Implementación de Modelos
- Define los modelos en `grails-app/domain`.
- Asegúrate de utilizar validaciones apropiadas para todos los campos.

##### Paso 3: Creación de Controladores y Vistas
- Usa `grails generate-all` para cada clase de dominio para generar automáticamente controladores y vistas.
- Personaliza las vistas generadas para mejorar la interfaz de usuario.

##### Paso 4: Servicios de Negocio
- Implementa servicios que encapsulen la lógica de préstamos y devoluciones.
- Asegura la integridad de los datos utilizando anotaciones `@Transactional`.

##### Paso 5: Internacionalización
- Configura los archivos de mensajes bajo `grails-app/i18n` para inglés y español.

##### Paso 6: Decoración y Estilos CSS
- Diseña un layout principal usando Thymeleaf para mantener un diseño coherente en todas las páginas.
- Personaliza los estilos utilizando SASS y compila a CSS para un diseño responsivo.

#### Desafío Adicional
- Integra una API externa para obtener información adicional sobre libros o autores.
- Implementa pruebas unitarias y de integración para todos los componentes.

Este ejercicio no solo cubre un amplio rango de funcionalidades en Grails, sino que también proporciona una experiencia comprensiva de desarrollo de aplicaciones web, desde la persistencia de datos hasta la interfaz de usuario y la internacionalización.
