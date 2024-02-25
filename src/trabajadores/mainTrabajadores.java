package trabajadores;

public class mainTrabajadores {
    public static void main(String[] args) {
        Directivo d = new Directivo("María");
        Oficial o = new Oficial("Juan");
        Tecnico t  = new Tecnico("Manuel");

        System.out.println(d);
        System.out.println(o);
        System.out.println(t);
    }
}
