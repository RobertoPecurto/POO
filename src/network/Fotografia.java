package network;

public class Fotografia extends Publicacion{

    private String nombre_imagen;

    private String titulo_foto;

    public Fotografia(Usuario usuario, String nombre_imagen, String titulo_foto) {
        super(usuario);
        this.nombre_imagen = nombre_imagen;
        this.titulo_foto = titulo_foto;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.nombre_imagen + " " + this.titulo_foto;
    }
}
