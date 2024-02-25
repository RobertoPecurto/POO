package subasta;

import java.util.HashSet;
import java.util.Set;

public class Subasta {

    private String nombre;

    private String dia;

    private Set<Lote> lotes;

    public Subasta(String nombre, String dia) {
        this.nombre = nombre;
        this.dia = dia;
        this.lotes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Set<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(Set<Lote> lotes) {
        this.lotes = lotes;
    }

    public void addLote(Lote lote){
        this.lotes.add(lote);
    }

    @Override
    public String toString(){
        return this.nombre + " - " + this.dia;
    }
}
