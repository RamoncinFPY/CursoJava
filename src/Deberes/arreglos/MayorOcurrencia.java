package deberes.arreglos;

import java.util.Scanner;

/*Para la tarea se debe crear un arreglo con 10 elementos
(enteros en el rango de 1 a 9). Escriba un programa que imprima
el número que tiene más ocurrencias en el arreglo y también imprimir
la cantidad de veces que aparece en el arreglo.
Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
Como resultado debería imprimir lo siguiente:
La mayor ocurrencias es: 3
El elemento que más se repite es: 5*/
public class MayorOcurrencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        //Solicito el ingreso de números para el arreglo.
        System.out.println("Ingrese números del 1 al 9, que se repitan para ver el de mayor ocurrencia.");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            int auxiliar = entrada.nextInt();
            if (auxiliar >= 1 && auxiliar <= 9) {
                numeros[i] = auxiliar;
            } else {
                System.out.println("Número fuera de rango.");
                i--;
            }
        }

        //Imprimo el array original.
        System.out.println("======================\nArray original.");
        for (int numero : numeros) {
            System.out.print("[ " + numero + " ]");
        }

        //Creo un segundo array para ver las ocurrencias de cada número.
        int[] ocurrencias = new int[10];


        for (int i = 0; i < 10; i++) {
            int contadorRepeticiones = 0; //Inicio el contador dentro del 1er for.
            for (int j = 0; j < 10; j++) {
                if (numeros[i] == numeros[j]) {
                    contadorRepeticiones++;
                }
            }
            ocurrencias[i] = contadorRepeticiones;
        }

        //Imprimo el array de las ocurrencias.
        System.out.println("\n======================\nArray ocurrencias.");
        for (int ocurrencia : ocurrencias) {
            System.out.print("[ " + ocurrencia + " ]");
        }

        //Ahora veo cual se repite más veces y así obtengo el índice del ocurrente.
        int indice = 0;
        int veces = Integer.MIN_VALUE;
        for (int i = 0; i < ocurrencias.length; i++) {
            if (veces < ocurrencias[i]) {
                veces = ocurrencias[i];
                indice = i;
            }

        }
        int ocurrente = numeros[indice];

        //Muestro los resultados.
        System.out.println("\n======================");
        //System.out.println("indice = " + indice);
        System.out.println("ocurrente = " + ocurrente);
        System.out.println("veces = " + veces);
    }
}
