package universidad;

import java.util.HashSet;
import java.util.Set;

public class AreaConocimiento {
    private int n_arCo;
    private String nombre;
    private Set<Departamento> departamentos;

    public AreaConocimiento(int n_arCo, String nombre) {
        this.n_arCo = n_arCo;
        this.nombre = nombre;
        this.departamentos = new HashSet<>();
    }

    public int getN_arCo() {
        return n_arCo;
    }

    public void setN_arCo(int n_arCo) {
        this.n_arCo = n_arCo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void addDepartamento (Departamento departamento){
        this.departamentos.add(departamento);
    }

    @Override
    public String toString(){
        return this.nombre + " " + this.n_arCo;
    }
}
