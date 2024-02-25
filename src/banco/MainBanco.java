package banco;

import java.util.HashSet;
import java.util.Set;

public class MainBanco {
    public static void main(String[] args) {

        Banco bbva = new Banco("BBVA" , 100, new HashSet<>());
            Sucursal sMayor = new Sucursal(222,"C/ Mayor", bbva);
                bbva.addSucursal(sMayor);
            Cliente maria = new Cliente(1, "María");
                Prestamo p1 = new Prestamo(1, 1000,sMayor,maria);
                    sMayor.addPrestamo(p1);
                    maria.addPrestamo(p1);
                    CuentaCorriente ccMaria = new CuentaCorriente(1,1000,new HashSet<>(),sMayor);
                    ccMaria.addCliente(maria);
                    maria.addCuentaCorriente(ccMaria);
                    sMayor.addCuentaCorriente(ccMaria);
                    Domiciliacion dom = new Domiciliacion(110,100,"Iberdrola",ccMaria);
                    ccMaria.addDomiciliacion(dom);
            Sucursal sEnMedio = new Sucursal(123, "C/ Enmedio", bbva);
                bbva.addSucursal(sEnMedio);
            Cliente juan = new Cliente(2,"Juan");
                Prestamo p2 = new Prestamo(2, 5000, sEnMedio,juan);
                    sMayor.addPrestamo(p2);
                    juan.addPrestamo(p2);
                Prestamo p3 = new Prestamo(3,3000,sEnMedio,juan);
                    sEnMedio.addPrestamo(p3);
                    juan.addPrestamo(p3);


        System.out.println(bbva);
        for (Sucursal s: bbva.getSucursales()) {
            System.out.println("\t" + s);
            for (Prestamo p:s.getPrestamos()) {
                System.out.println("\t\t" + p);
                System.out.println("\t\t" + p.getCliente());
            }
            for (CuentaCorriente cc: s.getCuentasCorrientes()) {
                System.out.println("\t\t" + s);
                for (Domiciliacion d: cc.getDomiciliaciones()){
                    System.out.println("\t\t\t");
                    System.out.println("\t\t\t" + d);
                }
            }
        }

        System.out.println(sMayor.getBanco().getNombre());
        System.out.println(p3.getSucursal().getBanco().getNombre());
    }

}
