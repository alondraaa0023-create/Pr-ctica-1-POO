/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;
    
     // Constructor completo
    public Libro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;  
    }
    
    // Sobrecarga de constructor (por ejemplo, sin ISBN al inicio)
    public Libro(String titulo, String autor){
        this(titulo, autor, "S/N");
    }
    
    // Getters y Setters (Encapsulamiento)
    public String getTitulo(){ 
        return titulo; 
    }
    public void setTitulo(String titulo){ 
        this.titulo = titulo; 
    }

    public String getAutor(){ 
        return autor; 
    }
    public void setAutor(String autor){ 
        this.autor = autor; 
    }

    public String getIsbn(){ 
        return isbn; 
    }
    public void setIsbn(String isbn){ 
        this.isbn = isbn; 
    }

    public boolean isDisponible(){ 
        return disponible; 
    }
    public void setDisponible(boolean disponible){ 
        this.disponible = disponible; 
     }
    
       // Método para consultar disponibilidad
    public boolean consultarDisponibilidad(){
        return this.disponible;
    }
    }

  
