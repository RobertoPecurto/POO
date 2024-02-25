package banco;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int n_suc;
    private String direccion;
    private Banco banco;
    private Set<Prestamo> prestamos;

    private Set<CuentaCorriente> cuentasCorrientes;

    public Sucursal(int nSuc, String direccion, Banco banco) {
        this.n_suc = nSuc;
        this.direccion = direccion;
        this.banco = banco;
        this.prestamos = new HashSet<>();
        this.cuentasCorrientes = new HashSet<>();
    }

    public int getN_suc() {
        return n_suc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Banco getBanco() {
        return banco;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Set<CuentaCorriente> getCuentasCorrientes() {
        return cuentasCorrientes;
    }

    public void setCuentasCorrientes(Set<CuentaCorriente> cuentasCorrientes) {
        this.cuentasCorrientes = cuentasCorrientes;
    }

    public void addCuentaCorriente(CuentaCorriente cuentaCorriente){this.cuentasCorrientes.add(cuentaCorriente);}

    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }
    @Override
    public String toString(){
        return this.n_suc + " - " + this.direccion;
    }
}
