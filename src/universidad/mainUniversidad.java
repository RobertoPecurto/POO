package universidad;

public class mainUniversidad {
    public static void main(String[] args) {
        Facultad fac1 = new Facultad(1,"Facultad1");
            Catedra cat1 = new Catedra(1,"Catedra1");
            fac1.addCatedra(cat1);
        AreaConocimiento area1 = new AreaConocimiento(1,"Area1");
            Departamento ciencias = new Departamento(1,"Ciencias");
                Profesor pepe = new Profesor(25654858,"Pepe",ciencias);
                    ciencias.addProfesor(pepe);
                    cat1.addProfesor(pepe);
                Profesor maria = new Profesor(65894684, "Pepe", ciencias);
                    ciencias.addProfesor(maria);
            area1.addDepartamento(ciencias);

        System.out.println(fac1);
        for (Catedra catedra: fac1.getCatedras()){
            System.out.println("\t" + catedra);
            for (Profesor profesor: catedra.getProfesores()) {
                System.out.println("\t\t" + profesor);
            }
        }
        System.out.println(area1);
        for (Departamento dep: area1.getDepartamentos()) {
            System.out.println("\t" + dep);
            for (Profesor profesor: dep.getProfesores()) {
                System.out.println("\t\t" + profesor);
            }
        }
    }
}
