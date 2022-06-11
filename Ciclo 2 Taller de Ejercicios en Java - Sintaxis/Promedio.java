import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        String nombreEstudiante, nombreMateria;
        double nota, porcentaje, promedioAcumulado = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        nombreEstudiante = sc.next();

        System.out.println("Ingrese el nombre de la materia");
        nombreMateria = sc.nextLine();

        System.out.println(nombreEstudiante);
        System.out.println(nombreMateria);

        //El for tiene tres partes:
        //1. Variable: int i = 0
        //2. Condicion
        //3. Incremento: i++
        for (int numeroNota = 1; numeroNota < 4; numeroNota++) {
            System.out.println("Ingrese la nota " + numeroNota);
            nota = sc.nextDouble();

            System.out.println("Ingrese el porcentaje de la nota " + numeroNota);
            porcentaje = sc.nextDouble();

            promedioAcumulado = promedioAcumulado + (nota * porcentaje / 100);
        }

        System.out.println("La nota definitiva es " + promedioAcumulado);
    }
}
