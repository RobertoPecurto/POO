package network;

import java.util.HashSet;
import java.util.Set;

public class Usuario{
    private static int cuenta = 0;
    private int ID;
    private String nombre;

    private Set<Publicacion> publicaciones;

    public Usuario(String nombre) {
        this.ID = cuenta++;
        this.nombre = nombre;
        this.publicaciones = new HashSet<>();
    }

    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int cuenta) {
        Usuario.cuenta = cuenta;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Set<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public void addPublicacion(Publicacion publicacion){
        this.publicaciones.add(publicacion);
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
