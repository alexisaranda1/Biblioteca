import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void mostrarMenu() {
        System.out.println("📋 Menú de opciones:\n"
                + "1. Agregar libro.\n"
                + "2. Buscar libro.\n"
                + "3. Eliminar libro.\n"
                + "4. Listar libros.\n"
                + "5. Salir de la biblioteca.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(); 
        int opcion = 0;
    
        while (opcion != 5) {
            try {
                mostrarMenu();
                opcion = scanner.nextInt();
                scanner.nextLine(); // Evita errores al leer texto después de números
    
                switch (opcion) {
                    case 1:
                        System.out.println("Ingresar el título del libro: ");
                        String titulo = scanner.nextLine();
                        System.out.println("Ingresar el autor del libro: ");
                        String autor = scanner.nextLine();
                        System.out.println("Ingresar el año de publicación: ");
                        int anio = scanner.nextInt();
                        System.out.println("Ingresar el ID del libro: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Evitar errores de salto de línea
    
                        Libro nuevoLibro = new Libro(titulo, autor, anio, id);
                        biblioteca.agregarLibro(nuevoLibro);
                        break;
    
                    case 2:
                        System.out.println("Ingresar el título del libro que quiere buscar: ");
                        String tituloBusqueda = scanner.nextLine();
                        String libroEncontrado = biblioteca.buscarLibro(tituloBusqueda);
                        if (libroEncontrado != null) {
                            System.out.println("📘 Libro encontrado: " + libroEncontrado);
                        }
                        break;
    
                    case 3:
                        System.out.println("Ingresar el título del libro que quiere eliminar: ");
                        String tituloEliminar = scanner.nextLine();
                        biblioteca.eliminarLibro(tituloEliminar);
                        break;
    
                    case 4:
                        biblioteca.listarLibros();
                        break;
    
                    case 5:
                        System.out.println("📕 Saliendo de la biblioteca...");
                        break;
    
                    default:
                        System.out.println("❌ Opción incorrecta, intenta de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Error: Debes ingresar un número válido.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
    
}