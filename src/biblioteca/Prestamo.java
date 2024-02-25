package biblioteca;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Prestamo {

    private String fecha_p;
    private Lector lector;

    private Set<Ejemplar> ejemplares;

    public Prestamo(String fecha_p, Lector lector) {
        this.fecha_p = fecha_p;
        this.lector = lector;
        this.ejemplares = new HashSet<>();
    }

    public Prestamo(String fecha_p) {
        this.fecha_p = fecha_p;
        this.ejemplares = new HashSet<>();
    }

    public String getFecha_p() {
        return fecha_p;
    }

    public void setFecha_p(String fecha_p) {
        this.fecha_p = fecha_p;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Set<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Set<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void addEjemplar(Ejemplar ejemplar){
        this.ejemplares.add(ejemplar);
    }

    @Override
    public String toString (){
        return this.fecha_p;
    }
}
