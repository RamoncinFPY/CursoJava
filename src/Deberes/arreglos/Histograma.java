package Deberes.arreglos;
/*Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en 
un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6, incluso 
si no están presente en el arreglo.
Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
1: ***
2: 
3: *
4: *****
5: *
6: **
Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numerosHistograma = new int[12];
        int longitud = numerosHistograma.length;

        System.out.println("Ingrese 12 números del 1 al 6, repita los que más le agraden.");
        //For para llenar el arreglo.
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese un número: ");
            int auxiliar = scanner.nextInt();
            if (auxiliar > 0 && auxiliar < 7){
                numerosHistograma[i] = auxiliar;
            } else {
                System.out.println("Número fuera de rango.");
                i--;
            }
        }
        //Imprimo el arreglo numerosHistograma.
        System.out.println("==============================================\nArray original.");
        Arrays.sort(numerosHistograma);
        for (int numero : numerosHistograma) {
            System.out.print(" " + numero);
        }

        //Recorro el array original para ver las repeticiones de cada número para imprimir los *.
        int[] histogramaRepetidos = new int[12];
        for (int i = 0; i < longitud; i++) {
            int repeticiones = 0;
            for (int j = 0; j < longitud; j++) {
                if (numerosHistograma[i] == numerosHistograma[j]){
                    repeticiones++;
                }
            }
            histogramaRepetidos[i] = repeticiones;
        }

        //Imprimo el arreglo histograma.
        System.out.println("\n==============================================\nArray histograma.");
        for (int elemento : histogramaRepetidos) {
            System.out.print(" " + elemento);
        }

        //Recorro el hA para ver el número de asteriscos que tengo que imprimir.
        System.out.println("\n=======HISTOGRAMA=======");
        String[] histogramaArray = new String[6];
        for (int i = 0; i < histogramaArray.length; i++) {
            int auxiliar = i + 1 ;
            String histograma = auxiliar + ": ";
            for (int j = 0; j < numerosHistograma.length; j++) {
                if (auxiliar == numerosHistograma[j]) {
                    histograma += " *";
                }
            }
            histogramaArray[i] = histograma;
        }
        for (String elemento : histogramaArray) {
            System.out.println(elemento);
        }
    }
}
