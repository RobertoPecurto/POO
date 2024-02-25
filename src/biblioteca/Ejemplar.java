package biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Ejemplar {
    private int n_reg;
    private String nombre;

    private Libro libro;

    private Set<Historico> historicos;

    private Prestamo prestamo;

    public Ejemplar(int n_reg, String nombre, Libro libro, Prestamo prestamo) {
        this.n_reg = n_reg;
        this.nombre = nombre;
        this.libro = libro;
        this.historicos = new HashSet<>();
        this.prestamo = prestamo;
    }

    public Ejemplar(int n_reg, String nombre) {
        this.n_reg = n_reg;
        this.nombre = nombre;
        this.historicos = new HashSet<>();
    }

    public int getN_reg() {
        return n_reg;
    }

    public void setN_reg(int n_reg) {
        this.n_reg = n_reg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Set<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(Set<Historico> historicos) {
        this.historicos = historicos;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public void addHistorico(Historico historico){
        this.historicos.add(historico);
    }

    @Override
    public String toString(){
        return this.n_reg + " - " + this.nombre;
    }
}
