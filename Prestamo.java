/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.time.LocalDate;

public class Prestamo {
    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;

     // Constructor
    public Prestamo(Usuario usuario, Libro libro) {
        this.fecha = LocalDate.now();
        this.usuario = usuario;
        this.libro = libro;
    }

    // Método para prestar el libro
    public boolean prestarLibro() {
        if (libro.consultarDisponibilidad()) {
            libro.setDisponible(false);
            usuario.agregarLibro(libro);
            System.out.println("Exito: Se le presto el libro '" + libro.getTitulo() + "' a " + usuario.getNombre() + ".");
            return true;
        } else {
            System.out.println(" Error: El libro '" + libro.getTitulo() + "' no está disponible.");
            return false;
        }
    }

    // Método para devolver el libro
    public boolean devolverLibro() {
        if (!libro.consultarDisponibilidad() && usuario.getLibrosPrestados().contains(libro)) {
            libro.setDisponible(true);
            usuario.removerLibro(libro);
            System.out.println("Exito: El libro '" + libro.getTitulo() + "' fue devuelto correctamente.");
            return true;
        } else {
            System.out.println(" Error: Este libro no puede ser devuelto por este usuario.");
            return false;
        }
    }

    // Getters y Setters
    public LocalDate getFecha() { return fecha; }
    public Usuario getUsuario() { return usuario; }
    public Libro getLibro() { return libro; }
}

    
