package cuenta;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta ej1 = new Cuenta("Juan", 4000);
        Cuenta ej2 = new Cuenta("Sara", 7000);
        ej1.ingresar(1000);
        System.out.println(ej1);
        System.out.println(ej2);
        ej2.retirar(9000);
        System.out.println(ej2);
    }
}
