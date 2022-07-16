import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
        ArrayList<Double> calificaciones = new ArrayList<>();
        System.out.println(calificaciones);

        int n = 5;
        for (int i = 0; i < n; i++) {
            calificaciones.add(0.0);
        }
        System.out.println(calificaciones);
         */

        Tripulante miTripulante = new Tripulante(
                "JuanMa",
                "123456789",
                "12345",
                "ingjuanmasuarez@gmail.com",
                "Hola a todos y bienvenidos a la clase de Java",
                8
        );

        //System.out.println(miTripulante.getCalificaciones());
        //System.out.println(miTripulante.getEntregas());

        //System.out.println(Math.random() * 100000);

        String[] productosComprados = {"Boleta", "Combo 1", "Boleta", "Combo 2"};

        int total = 0;
        for (String producto: productosComprados) {
            if (producto == "Boleta"){
                total += 6000;
            } else if (producto == "Combo 1") {
                total += 8000;
            } else if (producto == "Combo 2") {
                total += 12000;
            }
        }
        //System.out.println(total);

        ArrayList<Integer> prueba = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prueba.add(0);
        }
        System.out.println(prueba);

        int retoAEntregar = 5;
        prueba.set(retoAEntregar, 10);
        System.out.println(prueba);

        int k = 5;
        if(get(k) == 10){
            System.out.println("El valore es 10");
        }

        participaSorteo = !participaSorteo;
        this.pantallas[pantalla - 1] = !this.pantallas[pantalla - 1]

    }

}