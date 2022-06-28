import java.util.*;
import java.util.Collections;

public class Reto1 {

    public static void main(String[] args) {

        int[] arrayPrueba = {5, 9, 8, 4, 6, 5, 8, 7, 4, 2, 5, 9, 0, 1, 5, 4};
        reporte(arrayPrueba); //Llamar el metodo

        /*int edad;
        double dolares;
        int miArray[]; //Declarar un array, sintaxis similar a variables
        int miArray2[] = new int[5]; //Declarar e instanciar un array, tamaño 5
        Integer[] miArray3 = {5, 6, 8, 9, 4, 2, 7, 8};

        //Crear un array sin tamaño fijo
        ArrayList<Integer> miArrayDinamico = new ArrayList<Integer>();
        miArrayDinamico.add(15); //Se utiliza el metodo add para agregar valores al array
        miArrayDinamico.add(10);
        miArrayDinamico.add(8);
        miArrayDinamico.add(9);
        miArrayDinamico.add(4);
        miArrayDinamico.add(20);

        //Uso de for each para recorrer el array y visualizar cada elemento
        for (int valor:miArray3) {
            System.out.println(valor);
        }

        // Calcular maximos y minimos usando varios metodos
        int valorMaximo;
        int valorMinimo;

        //Metodo 1: Usar max y min del Collections
        valorMaximo = Collections.max(Arrays.asList(miArray3));
        valorMinimo = Collections.min(Arrays.asList(miArray3));
        System.out.println("Valor maximo");
        System.out.println(valorMaximo);
        System.out.println("Valor minimo");
        System.out.println(valorMinimo);

        //Metodo 2. Usar ciclo for each y Math
        valorMaximo = 0; //Integer.MIN_VALUE
        valorMinimo = 99999; //Integer.MAX_VALUE
        System.out.println("Maximos usando for each y math");
        for (int numero:miArrayDinamico) {
            valorMaximo = Math.max(valorMaximo, numero);
            valorMinimo = Math.min(valorMinimo, numero);
        }
        System.out.println(valorMaximo);
        System.out.println(valorMinimo);

        miArrayDinamico.size();
        //Metodo 3. Usar for y condicionales
        valorMaximo = Integer.MIN_VALUE;
        valorMinimo = Integer.MAX_VALUE;
        System.out.println("Maximos y minimos usando for y condicionales");
        for (int i = 0; i < miArray3.length; i++) {
            if (miArray3[i] < valorMinimo){
                valorMinimo = miArray3[i];
            }
            if (miArray3[i] > valorMaximo){
                valorMaximo = miArray3[i];
            }
        }
        System.out.println(valorMinimo);
        System.out.println(valorMaximo);
        System.out.println(miArray3.length);*/
    }

    public static int[] reporte(int[] arrayValores){

        //CALCULAR MAXIMOS Y MINIMOS

        int[] resultados = new int[5];

        int valorMaximo = arrayValores[0]; //Integer.MIN_VALUE;
        int valorMinimo = arrayValores[0]; //Integer.MAX_VALUE;
        int longitud = arrayValores.length;
        int suma = 0;

        /*
        for (int i = 0; i < arrayValores.length; i++) {
            if (arrayValores[i] < valorMinimo){
                valorMinimo = arrayValores[i];
            }
            if (arrayValores[i] > valorMaximo){
                valorMaximo = arrayValores[i];
            }
            suma += arrayValores[i];

        }*/

        for (int numero:arrayValores) {
            valorMaximo = Math.max(valorMaximo, numero);
            valorMinimo = Math.min(valorMinimo, numero);
            suma += numero;
        }

        resultados[0] = valorMinimo;
        resultados[1] = valorMaximo;
        resultados[2] = longitud;
        resultados[3] = suma;
        resultados[4] = suma / longitud;

        System.out.println(Arrays.toString(resultados));

        System.out.println(resultados[0]);
        System.out.println(resultados[1]);
        System.out.println(resultados[2]);
        System.out.println(resultados[3]);
        System.out.println(resultados[4]);

        return resultados;
    }
}
