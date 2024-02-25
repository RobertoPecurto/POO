package vehiculo;

public class Pasajero {
    private String nombre;

    private int edad;

    private Vehiculo vehiculo;

    public Pasajero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return this.nombre + " que tiene " + this.edad + " años";
    }
}
