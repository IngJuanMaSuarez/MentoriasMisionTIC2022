public class Main {

    public static void main(String[] args) {

        Perro miPerro = new Perro("Luna", 10, 'F', "Crilla");
        //System.out.println(miPerro.caminar());

        miPerro.setFiel(true);
        //System.out.println(miPerro.isFiel());

        Gato miGato = new Gato("Michi", 5, 'M', "Angora");
        //System.out.println(miGato.dormir());

        Canario miCanario = new Canario("Piolin", 10, 'C', "Americano");

        //System.out.println(miGato.comer());
        //System.out.println(miPerro.comer());
        //System.out.println(miGato);

        System.out.println(miGato.dormir());
        System.out.println(miPerro.dormir());

        Animal misAnimales [] = new Animal [3];
        misAnimales [0] = miPerro;
        misAnimales [1] = miGato;
        misAnimales [2] = miCanario;

        Animal miAnimal = new Perro("Tony", 5, 'M', "Doberman");

        System.out.println(miAnimal.comer());

        //miGato = miAnimal;
        miAnimal = miGato;

        System.out.println(miAnimal.comer());

    }

}