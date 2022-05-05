package deberes.arreglos;
/*Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.*/

import java.util.Scanner;

public class ElMayorDelArreglo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[7];
        int mayor = Integer.MIN_VALUE; //Asigno el valor menor para comparar con todos los números introducidos.

        //Para llenar el array de números.
        System.out.println("Números válidos desde 11 hasta el 99");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un numero: ");
            int auxiliar = entrada.nextInt();
            //Compruebo que los números estén dentro del rango solicitado.
            if (auxiliar > 10 && auxiliar < 100){
                numeros[i] = auxiliar;
            }else {
                System.out.println(auxiliar + " Número fuera de rango.");
                i--;
            }
        }

        //For each para imprimir el array y los resultados.
        for (int numero : numeros) {
            mayor = (mayor > numero) ? mayor : numero;
            System.out.print(numero + " - ");
        }
        System.out.println("El mayor es => " + mayor);
    }
}