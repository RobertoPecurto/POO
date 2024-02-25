package vehiculo;

public class Helicoptero extends Aereo{
    private int numHelices;

    public Helicoptero(String nombreVehiculo, String tipoVehiculo, int cantidadPasajeros, String despegue, int numHelices) {
        super(nombreVehiculo, tipoVehiculo, cantidadPasajeros, despegue);
        this.numHelices = numHelices;
    }

    public int getNumHelices() {
        return numHelices;
    }

    public void setNumHelices(int numHelices) {
        this.numHelices = numHelices;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.numHelices;
    }
}
