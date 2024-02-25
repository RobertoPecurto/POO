package subasta;

public class mainSubasta {
    public static void main(String[] args) {
        Subasta sub =new Subasta("Subasta Especial", "08/02/2024");
            Lote lote1 = new Lote("Lote 1", sub);
            sub.addLote(lote1);
                Articulo art1 = new Articulo("Silla", 154.4, lote1);
                lote1.addArticulo(art1);
                Articulo art2 = new Articulo("Mesa", 250.4, lote1);
                lote1.addArticulo(art2);
            Lote lote2 = new Lote("Lote 2", sub);
            sub.addLote(lote2);
                Articulo art3 = new Articulo("Mesa de billar", 1000.0, lote2);
                lote2.addArticulo(art3);
                Articulo art4 = new Articulo("Mesa de billar", 198.0, lote2);
                lote2.addArticulo(art4);
                Articulo art5 = new Articulo("Mesa de billar", 178.0, lote2);
                lote2.addArticulo(art5);
        System.out.println(sub);
        for (Lote lote: sub.getLotes()) {
            System.out.println("\t" + lote);
            for (Articulo art: lote.getArticulos()) {
                System.out.println("\t\t" + art);
            }
        }

        Pujador juan = new Pujador("Juan");
        Pujador maria = new Pujador("Maria");
        Pujador andres = new Pujador("Andres");

        Puja puja1 = new Puja(juan, lote1, 500);
        lote1.addPuja(puja1);
        Puja puja2 = new Puja(maria, lote1, 600);
        lote1.addPuja(puja2);

        Puja puja3 = new Puja(juan,lote2,600);
        lote2.addPuja(puja3);
        Puja puja4 = new Puja(andres,lote2,250);
        lote2.addPuja(puja4);

        System.out.println(sub);

        for (Lote lote: sub.getLotes()) {
            System.out.println(lote);
            for (Articulo articulo: lote.getArticulos()){
                System.out.println("\t" + articulo);
                for (Puja puja: lote.getPujas()) {
                    System.out.println("\t\t" + puja);
                }
            }
        }
    }



}
