package banco;

import java.util.Set;

public class Banco {
    private int n_ent;

    private String nombre;

    private Set<Sucursal> sucursales;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_ent() {
        return n_ent;
    }

    public void setN_ent(int n_ent) {
        this.n_ent = n_ent;
    }

    public Set<Sucursal> getSucursales(){
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public Banco(String nombre, int n_ent, Set<Sucursal> sucursales) {
        this.nombre = nombre;
        this.n_ent = n_ent;
        this.sucursales = sucursales;
    }

    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}

