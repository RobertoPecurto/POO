package banco;

public class Prestamo {
    private int num_p;
    private int cantidad;
    private Sucursal sucursal;

    private Cliente cliente;

    public Prestamo(int num_p, int cantidad, Sucursal sucursal, Cliente cliente) {
        this.num_p = num_p;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.cliente = cliente;
    }

    public int getNum_p() {
        return num_p;
    }

    public void setNum_p(int num_p) {
        this.num_p = num_p;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString(){
        return this.num_p + " - " + this.cantidad;
    }
}
