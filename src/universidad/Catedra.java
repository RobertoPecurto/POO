package universidad;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private int n_cat;

    private String nombre;

    private Facultad facultad;

    private Departamento departamento;

    private Set<Profesor> profesores;

    public Catedra(int n_cat, String nombre, Facultad facultad, Departamento departamento) {
        this.n_cat = n_cat;
        this.nombre = nombre;
        this.facultad = facultad;
        this.departamento = departamento;
        this.profesores = new HashSet<>();
    }

    public Catedra(int n_cat, String nombre) {
        this.n_cat = n_cat;
        this.nombre = nombre;
        this.profesores = new HashSet<>();
    }

    public int getN_cat() {
        return n_cat;
    }

    public void setN_cat(int n_cat) {
        this.n_cat = n_cat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Set<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(Set<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void addProfesor(Profesor profesor){this.profesores.add(profesor);}

    @Override
    public String toString(){
        return this.n_cat + " - " + this.nombre;
    }
}
