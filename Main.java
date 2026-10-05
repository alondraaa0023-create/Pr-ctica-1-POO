/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Main {
     public static void main(String[] args) {
         
        // 1. Creamos un libro y un usuario
        Libro libro1 = new Libro("Cien Anios de Soledad", "Gabriel Garcia Marquez", "978-0307474728");
        Usuario usuario1 = new Usuario("Alondra", "U001");

        // 2. Probamos la disponibilidad inicial
        System.out.println("Esta disponible?: " + libro1.consultarDisponibilidad());

        // 3. Hacemos un préstamo
        Prestamo prestamo1 = new Prestamo(usuario1, libro1);
        prestamo1.prestarLibro();

        // 4. Verificamos disponibilidad después de prestar
        System.out.println("Esta disponible ahora?: " + libro1.consultarDisponibilidad());

        // 5. Devolvemos el libro
        prestamo1.devolverLibro();
        System.out.println("Esta disponible tras devolucion?: " + libro1.consultarDisponibilidad());
    }
}
    

