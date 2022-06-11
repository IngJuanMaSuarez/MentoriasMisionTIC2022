import java.util.Scanner;

public class Rifa {
    public static void main(String[] args){
        int limiteInferior = 0;
        int limiteSuperior = 20;
        int numeroGanador = 12;
        int numeroJugador; //Declaro variable y no la inicializo
        int numeroIntentos = 1;

        //Declarar e inicializar variables del mismo tipo en una sola linea
        //int limiteInferior = 0, limiteSuperior = 20, numeroGanador = 12;

        //Linea usada para crear un objeto sc que permite el ingreso de datos por teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero entre " + limiteInferior + " y " + limiteSuperior);
        numeroJugador = sc.nextInt(); //Captura por teclado un entero

        //El ciclo se repite mientras el jugador no adivine el numero
        while (numeroJugador != numeroGanador) {

            //Verificar que el numero esta dentro del intervalo de la rifa
            if (numeroJugador >= limiteInferior && numeroJugador <= limiteSuperior ){
                System.out.println("El numero esta dentro del intervalo");
                if (numeroJugador > numeroGanador) {
                    System.out.println("Te pasaste!");
                    numeroIntentos++;
                    System.out.println("Ingresa un numero entre " + limiteInferior + " y " + limiteSuperior);
                    numeroJugador = sc.nextInt(); //Captura por teclado un entero
                }
                else {
                    System.out.println("Te falta");
                    numeroIntentos++;
                    System.out.println("Ingresa un numero entre " + limiteInferior + " y " + limiteSuperior);
                    numeroJugador = sc.nextInt(); //Captura por teclado un entero
                }
            }

            else {
                System.out.println("El numero esta fuera del intervalo");
                System.out.println("Ingresa un numero entre " + limiteInferior + " y " + limiteSuperior);
                numeroJugador = sc.nextInt(); //Captura por teclado un entero
            }
        }
        System.out.println("Ganaste!, Adivinaste en " + numeroIntentos);
    }
}