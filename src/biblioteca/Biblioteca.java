import java.io.*;
import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>(); // Inicializar la lista primero
        leerLibros("libros.txt"); // Leer los libros si existen
    }

    // Guardar los libros en un archivo
    public void guardarLibros(String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(libros);
            System.out.println("✅ Libros guardados correctamente.");
        } catch (IOException e) {
            System.out.println("❌ Error al guardar los libros.");
            e.printStackTrace();
        }
    }

    // Leer los libros desde un archivo
    @SuppressWarnings("unchecked")
    public void leerLibros(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            libros = (ArrayList<Libro>) ois.readObject();
            System.out.println("✅ Libros cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("⚠️ No se encontraron libros previos o el archivo está corrupto.");
        }
    }

    public boolean agregarLibro(Libro libro) {
        for (Libro l : libros) {
            if (l.getId() == libro.getId()) {
                System.out.println("❌ Error: Ya existe un libro con este ID.");
                return false;
            }
        }
        libros.add(libro);
        guardarLibros("libros.txt"); // Guardar cambios
        System.out.println("✅ Libro agregado correctamente.");
        return true;
    }

    public String buscarLibro(String criterio) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(criterio)) {
                return libro.toString();
            }
        }
        System.out.println("❌ Libro no encontrado.");
        return null;
    }

    public boolean eliminarLibro(String criterio) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(criterio)) {
                libros.remove(libro);
                guardarLibros("libros.txt"); // Guardar cambios
                System.out.println("✅ Libro eliminado correctamente.");
                return true;
            }
        }
        System.out.println("❌ No se encontró el libro para eliminar.");
        return false;
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("📚 No hay libros en la biblioteca.");
        } else {
            System.out.println("📖 Lista de libros:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}
