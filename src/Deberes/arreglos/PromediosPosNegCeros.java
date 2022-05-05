package deberes.arreglos;
/*Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio
de los números positivos, el promedio de los negativos y contar el número de ceros.*/

import java.util.Scanner;

public class PromediosPosNegCeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numerosPromedio = new int[7];
        int negativos = 0;
        int promNegativos = 0;
        int ceros = 0;
        int positivos = 0;
        int promPositivos = 0;

        //Lleno el array con los datos del usuario.
        System.out.println("Ingresa siete números: positivos, negativos y ceros.");
        for (int i = 0; i < numerosPromedio.length; i++) {
            System.out.print("Ingresa un número: ");
            numerosPromedio[i] = entrada.nextInt();
        }
        //Realizo las comprobaciones para saber los positivos, negativos y ceros.
        for (int i = 0; i < numerosPromedio.length; i++) {
            if(numerosPromedio[i] == 0){
                ceros++;
            } else if (numerosPromedio[i] < 0) {
                promNegativos += numerosPromedio[i];
                negativos++;
            } else  {
                promPositivos += numerosPromedio[i];
                positivos++;
            }
        }
        //Muestro los resultados.
        System.out.println();
        System.out.println("Promedio positivos = " + promPositivos/positivos);
        System.out.println("Hay " + ceros + " ceros.");
        System.out.println("Promedio negativos = " + promNegativos/negativos);
    }
}