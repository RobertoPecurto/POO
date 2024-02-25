package vehiculo;

public abstract class Aereo extends Vehiculo {
    private String despegue;
    public Aereo(String nombreVehiculo, String tipoVehiculo, int cantidadPasajeros, String despegue) {
        super(nombreVehiculo, tipoVehiculo, cantidadPasajeros);
        this.despegue = despegue;
    }

    public String getDespegue() {
        return despegue;
    }

    public void setDespegue(String despegue) {
        this.despegue = despegue;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.despegue;
    }
}
