package reinoAnimal;

public class Perro extends Mamifero{

    public Perro(String nombre) {
        super(nombre);
    }

    public void comunicarse(){
        System.out.println("Guau");
    }

    @Override
    public void respirar() {

    }

    @Override
    public void moverse() {

    }

    public void traerZapatillas(){
        System.out.println("Toma tus zapatillas");
    }
}
