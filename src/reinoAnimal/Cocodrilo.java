package reinoAnimal;

public class Cocodrilo extends Animal{

    public Cocodrilo(String nombre) {
        super(nombre);
    }

    public void comunicarse(){
        System.out.println("Muevo la cola para comunicarme");
    }

    @Override
    public void respirar() {

    }

    @Override
    public void moverse() {

    }
}
