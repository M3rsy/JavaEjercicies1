/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciobiblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ghot-
 */
public class EjercicioBiblioteca {

    public static void main(String[] args) {
       // Creación y agregación de libros
        // Crear la instancia de la clase Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954, "Fantasía", true));
        biblioteca.agregarLibro(new Libro("1984", "George Orwell", 1949, "Ficción distópica", true));

        // Búsqueda de libros
        biblioteca.buscarLibro("1984");
        biblioteca.buscarLibro("J.R.R. Tolkien");

        // Prestar y devolver libros
        biblioteca.prestarLibro("1984");
        biblioteca.devolverLibro("1984");

        // Mostrar libros disponibles
        biblioteca.mostrarLibrosDisponibles();
    }
    
    ////////////////////////
//se agrego static a la clase biblioteca
public static class Biblioteca {
    // Lista para guardar los objetos de Libro
    public static List<Libro> libros;

    // Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // Método para agregar un libro
    public  void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para buscar libros por título o autor
    public void buscarLibro(String busqueda) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(busqueda) || libro.getAutor().equalsIgnoreCase(busqueda)) {
                libro.mostrarInfo();
            }
        }
    }

    // Método para prestar un libro
    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.isDisponible()) {
                libro.setDisponible(false);
                System.out.println("Libro prestado: " + titulo);
                return;
            }
        }
        System.out.println("Libro no disponible o no encontrado.");
    }

    // Método para devolver un libro
    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && !libro.isDisponible()) {
                libro.setDisponible(true);
                System.out.println("Libro devuelto: " + titulo);
                return;
            }
        }
        System.out.println("Libro no encontrado o ya estaba disponible.");
    }

    // Método para mostrar la información de todos los libros disponibles
    public void mostrarLibrosDisponibles() {
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                libro.mostrarInfo();
            }
        }
    }
}

///////////////
// se agrego static
public static class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String genero;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion, String genero, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.disponible = disponible;
    }

    // Métodos de acceso (getters y setters)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método para mostrar información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + anioPublicacion + ", Género: " + genero + ", Disponible: " + (disponible ? "Sí" : "No"));
    }
}

//////////////end///////////
}
    

