package aire_acondicionado;

import java.util.IllegalFormatException;

public class Aparato {
    private String nombre;
    private int tempMax;
    private int tempMin;
    private int tempActual;

    public Aparato(String nombre, int tempMax, int tempMin, int tempActual) {
        this.nombre = nombre;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.tempActual = tempActual;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public int getTempActual() {
        return tempActual;
    }

    public void setTempActual(int tempActual) {
        this.tempActual = tempActual;
    }

    @Override
    public String toString(){
        return this.nombre + "\n\t" + "Temperatura mínima: " +this.tempMin + "\n\t" + "Temperatura máxima: "+ this.tempMax + "\n\t" +"Temperatura actual:" + this.tempActual;
    }

    public void aumenta(){
        if (!(this.tempActual + 1 > tempMax)){
            this.tempActual++;
        }
    }

    public void disminuye(){
        if (!(this.tempActual - 1 < tempMin)){
            this.tempActual--;
        }
    }
    /*public void disminuyeExcepcion(){
        if (this.tempActual - 1 < tempMin){
            throw new IllegalArgumentException("La temperatura no puede ser inferior a " + this.tempMin);
        }
        this.tempActual--;
    }*/
}
