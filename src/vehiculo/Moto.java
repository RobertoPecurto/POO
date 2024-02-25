package vehiculo;

import java.util.HashSet;
import java.util.Set;

public class Moto extends Vehiculo{
    private int cilindrada;
    public Moto(String nombreVehiculo, String tipoVehiculo, int cantidadPasajeros, int cilindrada) {
        super(nombreVehiculo, tipoVehiculo, cantidadPasajeros);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + " - Cilindrada: " + this.cilindrada;
    }
}
