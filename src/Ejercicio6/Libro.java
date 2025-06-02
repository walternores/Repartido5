package Ejercicio6;

import Ejercicio5.Persona;

public class Libro {

    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de Soledad", "Gabriel García Márquez", 1967);
    }

    private String titulo;
    private String autor;
    private int anio;

    public Libro(String titulo, String autor, int anio) {

        if(anio<=2025) {
            this.titulo = titulo;
            this.autor = autor;
            this.anio = anio;
        }else{
            System.out.println("No fue posible crear el objeto. El año NO debe ser mayor que el actual. Verifique");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
