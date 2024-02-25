package biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Libro {
    private String isbn;

    private String nombre;

    private Tema tema;

    private Set<Autor> autores;

    private Editorial editorial;

    private Set<Ejemplar> ejemplares;

    public Libro(String isbn, String nombre, Tema tema, Editorial editorial) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.tema = tema;
        this.autores = new HashSet<>();
        this.editorial = editorial;
        this.ejemplares = new HashSet<>();
    }

    public Libro(String isbn, String nombre) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.autores = new HashSet<>();
        this.ejemplares = new HashSet<>();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Set<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Set<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void addAutor(Autor autor){
        this.autores.add(autor);
    }

    public void addEjemplar(Ejemplar ejemplar){
        this.ejemplares.add(ejemplar);
    }

    @Override
    public String toString(){
        return this.isbn + " - " + this.nombre;
    }
}
