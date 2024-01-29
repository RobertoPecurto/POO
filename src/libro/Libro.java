package libro;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

    private String titulo;
    private Autor autor;
    private List<Tema> temas;

    public Libro(String titulo, Autor autor, List<Tema> temas) {
        this.titulo = titulo;
        this.autor = autor;
        this.temas = temas;
    }

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.temas = new ArrayList<>();
    }

    @Override
    public String toString(){
        return this.titulo + "\n\t" + this.autor + "\n\t\t" + this.temas;
    }
}
