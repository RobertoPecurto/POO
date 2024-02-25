package network;

public class Comentario {

    private static int cuenta = 0;

    private int ID;

    private Publicacion publicacion;

    private Usuario usuario;

    private String comentario;

    public Comentario(Fotografia publicacion, Usuario usuario, String comentario) {
        this.ID = cuenta++;
        this.usuario = usuario;
        this.publicacion = publicacion;
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int cuenta) {
        Comentario.cuenta = cuenta;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public String toString(){
        return this.usuario + " " + this.comentario;
    }
}
