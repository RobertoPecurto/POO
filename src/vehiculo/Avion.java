package vehiculo;

public class Avion extends Aereo implements Mercancia{
    private int numMotores;

    public Avion(String nombreVehiculo, String tipoVehiculo, int cantidadPasajeros, String despegue, int numMotores) {
        super(nombreVehiculo, tipoVehiculo, cantidadPasajeros, despegue);
        this.numMotores = numMotores;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    @Override
    public String transporta() {
        return "Contenedores";
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.numMotores + " Transporta: " + this.transporta();
    }
}
