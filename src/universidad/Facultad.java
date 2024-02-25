package universidad;

import java.util.HashSet;
import java.util.Set;

public class Facultad {
    private int n_fac;
    private String nombre;
    private Set<Catedra> catedras;

    public Facultad(int n_fac, String nombre) {
        this.n_fac = n_fac;
        this.nombre = nombre;
        this.catedras = new HashSet<>();
    }

    public int getN_fac() {
        return n_fac;
    }

    public void setN_fac(int n_fac) {
        this.n_fac = n_fac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }
    @Override
    public String toString(){
        return this.n_fac + " " + this.nombre;
    }
}
