package network;

import java.util.*;

public abstract class Publicacion{

    private static int cuenta = 0;

    private int ID;

    private Usuario usuario;

    private Date fecha;

    private int likes;

    private Set<Comentario> comentarios;

    public Publicacion(Usuario usuario) {
        this.ID = cuenta++;
        this.usuario = usuario;
        this.likes = 0;
        this.fecha = new Date();
        this.comentarios = new HashSet<>();
    }

    public static int getCuenta() {
        return cuenta;
    }

    public static void setCuenta(int cuenta) {
        Publicacion.cuenta = cuenta;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setComentarios(Set<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public Set<Comentario> getComentarios() {
        return comentarios;
    }

    public void addComentario(Comentario comentario){
        this.comentarios.add(comentario);
    }

    private void like(){
        this.likes++;
    }

    @Override
    public String toString(){
        return this.ID + " likes: " + this.likes + " fecha: " + this.fecha + " usuario: " + this.usuario;
    }
}
