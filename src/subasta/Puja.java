package subasta;

public class Puja {
    private Pujador pujador;
    private Lote lote;
    private double precio;

    public Puja(Pujador pujador, Lote lote, double precio) {
        this.pujador = pujador;
        this.lote = lote;
        this.precio = precio;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void pujaMaxima(){

    }

    public String toString(){
        return this.pujador + " - " + this.precio;
    }
}
