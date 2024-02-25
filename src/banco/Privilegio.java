package banco;

public class Privilegio {
    private CuentaCorriente cuentaCorriente;
    private Prestamo prestamo;
    private String privilegio;

    public Privilegio(CuentaCorriente cuentaCorriente, Prestamo prestamo, String privilegio) {
        this.cuentaCorriente = cuentaCorriente;
        this.prestamo = prestamo;
        this.privilegio = privilegio;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    public String toString(){
        return this.privilegio + " " + this.prestamo + " " + this.cuentaCorriente;
    }
}
