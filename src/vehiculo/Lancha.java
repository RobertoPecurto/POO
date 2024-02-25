package vehiculo;

public class Lancha extends Acuatico implements Mercancia{
    private String motor;

    public Lancha(String nombreVehiculo, String tipoVehiculo, int cantidadPasajeros, String impulso, String motor) {
        super(nombreVehiculo, tipoVehiculo, cantidadPasajeros, impulso);
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String transporta() {
        return "mercancia";
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.motor + " Transporta: " + this.transporta();
    }
}
