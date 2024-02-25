package vehiculo;

public class Velero extends Acuatico{
    private int numVelas;
    public Velero(String nombreVehiculo, String tipoVehiculo, int cantidadPasajeros, String impulso, int numVelas) {
        super(nombreVehiculo, tipoVehiculo, cantidadPasajeros, impulso);
        this.numVelas = numVelas;
    }

    public int getNumVelas() {
        return numVelas;
    }

    public void setNumVelas(int numVelas) {
        this.numVelas = numVelas;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.numVelas;
    }
}
