package network;

public class Texto extends Publicacion{

    private String texto;

    public Texto(Usuario usuario, String texto) {
        super(usuario);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.texto;
    }
}