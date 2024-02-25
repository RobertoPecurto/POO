package banco;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorriente {
    private int n_cc;

    private int cantidad;

    private Sucursal sucursal;

    private Set<Cliente> clientes;
    private Set<Domiciliacion> domiciliaciones;

    public CuentaCorriente(int n_cc,int cantidad, Set<Cliente> clientes, Sucursal sucursal) {
        this.n_cc = n_cc;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.domiciliaciones = new HashSet<>();
        this.clientes = new HashSet<>();
    }

    public int getN_cc() {
        return n_cc;
    }

    public void setN_cc(int n_cc) {
        this.n_cc = n_cc;
    }

    public Set<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void setDomiciliaciones(Set<Domiciliacion> domiciliaciones) {
        this.domiciliaciones = domiciliaciones;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public void addDomiciliacion (Domiciliacion domiciliacion){
        this.domiciliaciones.add(domiciliacion);
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    @Override
    public String toString(){
        return this.n_cc + " " + this.cantidad;
    }
}
