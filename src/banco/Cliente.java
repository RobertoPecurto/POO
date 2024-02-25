package banco;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private int dni;
    private String nombre;

    private Set<Prestamo> prestamos;
    private CuentaCorriente cuentaCorriente;

    public Cliente(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestamos = new HashSet<>();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }
    public void addCuentaCorriente(CuentaCorriente cuentaCorriente){

    }
    @Override
    public String toString(){
        return this.dni + " - " + this.nombre;
    }
}
