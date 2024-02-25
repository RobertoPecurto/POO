package person;

public class Person {
    private String nombre;
    private String direccion;

    public Person (String nombre){
        this.nombre = nombre;
    }

    Person (String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString(){
        return this.nombre + "\n\t" + this.direccion;
    }
}