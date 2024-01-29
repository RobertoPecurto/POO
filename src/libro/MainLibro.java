package libro;

import java.util.ArrayList;
import java.util.List;

public class MainLibro {
    public static void main(String[] args) {
        Autor a = new Autor("Kerstin Gier", "01-05-1975");
        Tema t = new Tema("Juvenil");
        List<Tema> l = new ArrayList<>();
        l.add(t);
        Libro libro = new Libro("Lo que esconde la noche",a,l);
        System.out.println(libro);
    }
}
