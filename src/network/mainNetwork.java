package network;

import org.w3c.dom.Text;

import java.util.HashSet;
import java.util.Set;

public class mainNetwork {
    public static void main(String[] args) {

        Set<Usuario> usuarios = new HashSet<>();
        Usuario maria = new Usuario("Maria");
        usuarios.add(maria);
        Usuario juan = new Usuario("Juan");
        usuarios.add(juan);
        Usuario andres = new Usuario("Andres");
        usuarios.add(andres);


        Fotografia f = new Fotografia(maria,"imagen.png","Pajaro");
        maria.addPublicacion(f);
        Fotografia f2 = new Fotografia(juan,"juan.png","Pajaro Juan");
        juan.addPublicacion(f2);
        Fotografia f3 = new Fotografia(andres,"andres.png","andres Juan");
        andres.addPublicacion(f3);

        Texto t = new Texto(maria, "Hola mundo");
        maria.addPublicacion(t);
        Texto t2 = new Texto(maria, "Adios mundo");
        maria.addPublicacion(t2);

        Comentario c = new Comentario(f2,andres,"Muy bonita");
        f2.addComentario(c);
        Comentario c2 = new Comentario(f2,juan,"Muy bonita también");
        f2.addComentario(c2);

        for (Usuario u : usuarios){
            System.out.println(u);
            for (Publicacion p : u.getPublicaciones()){
                System.out.println("\t" + p);
                for (Comentario comentario : p.getComentarios()){
                    System.out.println("\t\t" + comentario);
                }
            }
        }

    }
}
