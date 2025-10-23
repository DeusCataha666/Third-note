package unidad3;

import java.io.*;


public class BookFileHandler {

    public static void saveBookToFile(Book book, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getPrice());
            writer.newLine();
            System.out.println("Libro guardado exitosamente: " + book.getTitle());
        } catch (IOException e) {
            System.err.println("Error al guardar el libro: " + e.getMessage());
        } finally {
            System.out.println("Operation finished");
        }
    }

    public static void readAllBooks(String filename) {
        boolean foundBooks = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("\nLista de todos los libros registrados:");
            System.out.println("=====================================");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    System.out.println("Título: " + parts[0]);
                    System.out.println("Autor: " + parts[1]);
                    System.out.println("Precio: $" + parts[2]);
                    System.out.println("-------------------------------------");
                    foundBooks = true;
                }
            }
            if (!foundBooks) {
                System.out.println("No se encontraron libros en el archivo.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo " + filename + " no existe.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            System.out.println("Operation finished");
        }
    }

    public static Book readBookFromFile(String filename, String title) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(title)) {
                    return new Book(parts[0], parts[1], Double.parseDouble(parts[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}