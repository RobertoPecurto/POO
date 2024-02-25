package biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Editorial {
    private int cod_ed;

    private String nombre;

    private Set<Libro> libros;

    public Editorial(int cod_ed, String nombre) {
        this.cod_ed = cod_ed;
        this.nombre = nombre;
        this.libros = new HashSet<>();
    }

    public int getCod_ed() {
        return cod_ed;
    }

    public void setCod_ed(int cod_ed) {
        this.cod_ed = cod_ed;
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
        return this.cod_ed + " - " + this.nombre;
    }
}
