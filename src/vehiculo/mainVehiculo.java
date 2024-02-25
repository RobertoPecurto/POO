package vehiculo;

import jdk.jshell.execution.Util;

import java.rmi.MarshalException;
import java.util.HashSet;
import java.util.Set;

public class mainVehiculo {
    public static void main(String[] args) {
        Set<Vehiculo> vehiculos = new HashSet<>();

        Pasajero maria = new Pasajero("María", 22);
        Pasajero juan = new Pasajero("Juan",42);
        Pasajero lorena = new Pasajero("Lorena",17);
        Pasajero antonio = new Pasajero("Antonio",31);

        Coche c1 = new Coche("BMW", "Berlina",2,4,"Trasera");
        c1.addPasajero(maria);
        c1.addPasajero(juan);
        vehiculos.add(c1);

        Moto m1 = new Moto("Yamaha","Deportiva",1,1000);
        m1.addPasajero(lorena);
        vehiculos.add(m1);

        Velero v1 = new Velero("Adventure", "Velero familiar", 5, "Velas", 2);
        v1.addPasajero(antonio);
        vehiculos.add(v1);

        Lancha l1 = new Lancha("Tempestad", "Carguero", 4,"Motor","14.9GT");
        l1.addPasajero(maria);
        vehiculos.add(l1);

        Avion a1 = new Avion("Boeing747", "Avión comercial",550,"Motores",4);
        a1.addPasajero(maria);
        a1.addPasajero(juan);
        a1.addPasajero(lorena);
        a1.addPasajero(antonio);
        vehiculos.add(a1);

        Helicoptero h1 = new Helicoptero("Bell UH-1Y","Helicoptero utilitario",5,"Helices",3);
        h1.addPasajero(maria);
        h1.addPasajero(antonio);
        vehiculos.add(h1);

        for (Vehiculo v : vehiculos){
            System.out.println("\n" + v);
            for (Pasajero p : v.getPasajeros()){
                System.out.println("\t" + p);
            }
        }
    }
}
