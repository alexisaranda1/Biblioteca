# Sistema de Gestión de Biblioteca en Java

## Descripción
Este proyecto consiste en desarrollar una aplicación de consola en Java para gestionar una biblioteca. La aplicación permitirá agregar, buscar, eliminar y listar libros mediante un menú interactivo. Es ideal para practicar conceptos de programación orientada a objetos, manejo de excepciones y uso de colecciones en Java.

## Requisitos del Ejercicio

### 1. Clase `Libro`
- **Atributos:**
  - `titulo` (String)
  - `autor` (String)
  - `anioPublicacion` (int)
  - `isbn` (String)
- **Métodos:**
  - **Constructores:**  
    Crea uno o varios constructores que inicialicen los atributos.
  - **Getters y Setters:**  
    Métodos para acceder y modificar cada uno de los atributos.
  - **toString():**  
    Sobrescribe este método para que retorne una cadena con la información completa del libro (título, autor, año, ISBN).

### 2. Clase `Biblioteca`
- **Descripción:**  
  Esta clase gestionará una colección de objetos `Libro` utilizando una estructura como `ArrayList<Libro>`.
- **Métodos a implementar:**
  - `agregarLibro(Libro libro)`: Agrega un objeto `Libro` a la colección.
  - `buscarLibro(String criterio)`: Permite buscar un libro por título o ISBN. Si se encuentra, muestra la información del libro.
  - `eliminarLibro(String criterio)`: Elimina un libro de la colección basándose en el título o ISBN.
  - `listarLibros()`: Recorre la colección y muestra la información de todos los libros.

### 3. Clase Principal `Main`
- **Funcionalidad:**
  - Mostrar un **menú interactivo** con las siguientes opciones:
    1. Agregar libro
    2. Buscar libro
    3. Eliminar libro
    4. Listar libros
    5. Salir
  - El menú debe repetirse hasta que el usuario seleccione la opción de salir.
  - **Validación de entradas:**  
    Se debe validar que la entrada del usuario sea la esperada, utilizando bloques `try-catch` para manejar errores (por ejemplo, cuando se ingresa un dato no numérico).
  - Utiliza la clase `Scanner` para leer los datos introducidos por el usuario.

### 4. (Opcional) Persistencia de Datos
- **Funcionalidad Adicional:**
  - Al iniciar la aplicación, cargar los libros guardados en un archivo (puede ser mediante lectura de un archivo de texto o usando la serialización de objetos).
  - Al finalizar, guardar la lista actualizada de libros en el archivo para conservar la información entre ejecuciones.

## Requisitos Técnicos
- **Lenguaje:** Java (JDK 8 o superior recomendado).
- **IDE:** Cualquier IDE de tu preferencia (Eclipse, IntelliJ IDEA, NetBeans, etc.).
- **Colecciones:** Uso de `ArrayList` para almacenar los libros.
- **Manejo de Excepciones:** Utilización de `try-catch` para capturar errores de entrada.
- **Encapsulamiento:** Los atributos de las clases deben ser privados y accederse mediante getters y setters.

## Guía Paso a Paso

1. **Configuración del Proyecto:**
   - Crea un nuevo proyecto en tu IDE.
   - Organiza las clases en un paquete (por ejemplo, `biblioteca`).

2. **Implementar la Clase `Libro`:**
   - Define los atributos: `titulo`, `autor`, `anioPublicacion` y `isbn`.
   - Crea el constructor y los métodos `get` y `set` para cada atributo.
   - Sobrescribe el método `toString()` para retornar la información del libro de forma legible.

3. **Implementar la Clase `Biblioteca`:**
   - Declara una variable de tipo `ArrayList<Libro>` para almacenar los libros.
   - Implementa los métodos:
     - `agregarLibro(Libro libro)`
     - `buscarLibro(String criterio)`  
       *(puedes buscar comparando el título o el ISBN, según lo que ingrese el usuario)*
     - `eliminarLibro(String criterio)`  
       *(similar a la búsqueda, elimina el libro si se encuentra el título o ISBN)*
     - `listarLibros()`  
       *(recorre la lista y muestra cada libro utilizando el método `toString()` de la clase `Libro`)*

4. **Implementar la Clase `Main`:**
   - Crea un menú interactivo en un bucle `while` o `do-while` que muestre las opciones mencionadas.
   - Usa la clase `Scanner` para leer la entrada del usuario.
   - Valida las entradas utilizando bloques `try-catch` para evitar errores de formato.
   - Llama a los métodos de la clase `Biblioteca` según la opción seleccionada.

5. **(Opcional) Implementar la Persistencia de Datos:**
   - Investiga sobre la serialización de objetos en Java o el manejo de archivos.
   - Agrega métodos en la clase `Biblioteca` o en otra clase auxiliar para guardar y cargar la lista de libros de un archivo.
   - Asegúrate de cargar los datos al inicio y guardarlos antes de que la aplicación finalice.

## Ejemplo de Menú (Salida en Consola)


- La aplicación debe solicitar la entrada del usuario y ejecutar la acción correspondiente según la opción elegida.

## Consejos Adicionales
- **Planificación:** Antes de escribir código, realiza un pequeño diagrama o pseudocódigo de la lógica de tu aplicación.
- **Pruebas:** Testea cada método de forma individual para asegurarte de que funcionan correctamente.
- **Documenta tu código:** Agrega comentarios para explicar la lógica y facilitar futuras modificaciones o revisiones.

## Recursos Adicionales
- [Tutorial de Java - Oracle](https://docs.oracle.com/javase/tutorial/)
- [Uso de ArrayList en Java - Baeldung](https://www.baeldung.com/java-arraylist)
- [Manejo de Excepciones en Java - GeeksforGeeks](https://www.geeksforgeeks.org/exception-handling-in-java/)

---

¡Buena suerte con este ejercicio y disfruta programando en Java!
