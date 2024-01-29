public class Ordenador {
    private String numSerie;
    private String modelo;
    private double precio;

    public Ordenador(String numSerie, String modelo, double precio) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.precio = precio;
    }


    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString (){
        return this.numSerie + "\n\t" + this.modelo + " (" + this.precio + ")";
    }
}
