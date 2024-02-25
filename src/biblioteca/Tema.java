package biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Tema {
    private int cod_t;

    private String nombre;

    private Set<Libro> libros;

    public Tema(int cod_t, String nombre) {
        this.cod_t = cod_t;
        this.nombre = nombre;
        this.libros = new HashSet<>();
    }

    public int getCod_t() {
        return cod_t;
    }

    public void setCod_t(int cod_t) {
        this.cod_t = cod_t;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }

    public void addLibro(Libro libro){
        this.libros.add(libro);
    }

    @Override
    public String toString(){
        return this.cod_t + " - " + this.nombre;
    }
}
