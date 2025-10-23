package unidad3;

import java.io.FileWriter;
// import java.io.IOException; 

public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to the Book Management Application!");
        
        try {
            // Crear una lista de 3 libros
            Book book1 = new Book("Don Quijote", "Miguel de Cervantes", 15.99);
            Book book2 = new Book("Cien años de soledad", "Gabriel García Márquez", 12.99);
            Book book3 = new Book("El Principito", "Antoine de Saint-Exupéry", 8.99);

            // Limpiar el archivo anterior (crear nuevo archivo)
            new FileWriter("books.txt", false).close();

            // Guardar los libros en el archivo
            System.out.println("\nGuardando libros...");
            BookFileHandler.saveBookToFile(book1, "books.txt");
            BookFileHandler.saveBookToFile(book2, "books.txt");
            BookFileHandler.saveBookToFile(book3, "books.txt");

            // Leer y mostrar todos los libros
            System.out.println("\nLeyendo todos los libros guardados:");
            BookFileHandler.readAllBooks("books.txt");

        } catch (Exception e) {
            System.err.println("Error general en la aplicación: " + e.getMessage());
        } finally {
            System.out.println("\nPrograma finalizado.");
        }
    }
}