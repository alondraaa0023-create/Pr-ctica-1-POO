/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String idUnico;
    private List<Libro> librosPrestados;

   // Constructor
    public Usuario(String nombre, String idUnico){
        this.nombre = nombre;
        this.idUnico = idUnico;
        this.librosPrestados = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre(){ 
        return nombre; 
    }
    public void setNombre(String nombre){ 
        this.nombre = nombre; 
    }

    public String getIdUnico(){ 
        return idUnico; 
    }
    public void setIdUnico(String idUnico){ 
        this.idUnico = idUnico; 
    }

    public List<Libro> getLibrosPrestados(){ 
        return librosPrestados; 
    }

     // Métodos de negocio
    public void agregarLibro(Libro libro) {
        this.librosPrestados.add(libro);
    }

    public void removerLibro(Libro libro) {
        this.librosPrestados.remove(libro);
    }
}
    

