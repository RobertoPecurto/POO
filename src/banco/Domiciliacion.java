package banco;

public class Domiciliacion {
    private int num_d;
    private int cantidad;
    private String companyia;
    private CuentaCorriente cuentaCorriente;

    public Domiciliacion(int num_d,int cantidad, String companyia, CuentaCorriente cuentaCorriente) {
        this.num_d = num_d;
        this.cantidad = cantidad;
        this.companyia = companyia;
        this.cuentaCorriente = cuentaCorriente;
    }

    public int getNum_d() {
        return num_d;
    }

    public void setNum_d(int num_d) {
        this.num_d = num_d;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public String getCompanyia() {
        return companyia;
    }

    public void setCompanyia(String companyia) {
        this.companyia = companyia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString(){
        return this.companyia + " - " + this.cantidad;
    }
}
