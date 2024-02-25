package vehiculo;

import java.util.HashSet;
import java.util.Set;

public abstract class Vehiculo {
    private int numSerie;
    private static int cuenta = 0;

    private String nombreVehiculo;
    private String tipoVehiculo;
    private int cantidadPasajeros;
    private Set<Pasajero> pasajeros;

    public Vehiculo(String nombreVehiculo, String tipoVehiculo, int cantidadPasajeros) {
        this.numSerie = cuenta++;
        this.nombreVehiculo = nombreVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.cantidadPasajeros = cantidadPasajeros;
        this.pasajeros = new HashSet<>();
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public Set<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Set<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void addPasajero (Pasajero pasajero){
        this.pasajeros.add(pasajero);
    }

    @Override
    public String toString() {
        return "Número de serie: " + this.numSerie + " - Nombre: " + this.nombreVehiculo + " - Tipo: " + this.tipoVehiculo + " - Pasajeros: " + this.cantidadPasajeros;
    }
}
