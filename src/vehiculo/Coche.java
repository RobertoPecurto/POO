package vehiculo;

import java.util.HashSet;
import java.util.Set;

public class Coche extends Terrestre {
    private String traccion;
    public Coche(String nombreVehiculo, String tipoVehiculo, int cantidadPasajeros, int numRuedas, String traccion) {
        super(nombreVehiculo, tipoVehiculo, cantidadPasajeros, numRuedas);
        this.traccion = traccion;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    @Override
    public String toString(){
        return super.toString() + " - Tracción: " + this.traccion;
    }
}
