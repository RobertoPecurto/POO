package vehiculo;

public abstract class Acuatico extends Vehiculo{
    private String impulso;

    public Acuatico(String nombreVehiculo, String tipoVehiculo, int cantidadPasajeros, String impulso) {
        super(nombreVehiculo, tipoVehiculo, cantidadPasajeros);
        this.impulso = impulso;
    }

    public String getImpulso() {
        return impulso;
    }

    public void setImpulso(String impulso) {
        this.impulso = impulso;
    }

    @Override
    public String toString() {
        return super.toString() + " - Impulso: " + this.impulso;
    }
}
