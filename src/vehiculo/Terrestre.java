package vehiculo;

public abstract class Terrestre extends Vehiculo {
    private int numRuedas;
    public Terrestre(String nombreVehiculo, String tipoVehiculo, int cantidadPasajeros, int numRuedas) {
        super(nombreVehiculo, tipoVehiculo, cantidadPasajeros);
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    @Override
    public String toString(){
        return super.toString() + " Ruedas: " + this.numRuedas;
    }
}
