package maquina_expendedora;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MaquinaExpendora {

    private int importe;

    private int cajon;

    private int introducido;

    public MaquinaExpendora(int importe, int cajon) {
        this.importe = importe;
        this.cajon = cajon;
    }

    public MaquinaExpendora(int importe, int cajon, int introducido) {
        this.importe = importe;
        this.cajon = cajon;
        this.introducido = introducido;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public double getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }

    public double getIntroducido() {
        return introducido;
    }

    public void setIntroducido(int introducido) {
        this.introducido = introducido;
    }

    public void calculo(int introducido, int importe){
        int[] dinero = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int devolver = 0;
        if (introducido >= importe){
            devolver = introducido - importe;
        }
        int resto;
        String cantidad = "";
        for (int i = 0; i < dinero.length; i++) {
            cantidad += devolver/dinero[i];
            int nuevo = devolver % dinero[i];
            devolver = nuevo;
        }

    }
}
