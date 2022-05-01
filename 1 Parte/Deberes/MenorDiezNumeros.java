package Deberes;

import java.util.Scanner;

public class MenorDiezNumeros {
    public static void main(String[] args) {
        //Creo un Scanner para recibir los datos.
        Scanner entrada = new Scanner(System.in);
        //Declaro las variables que voy a usar.
        int menor = Integer.MAX_VALUE; //Al comparar los números me aseguro que este sea el mayor.
        int numero;
        boolean ciclo = true;
        int cantNumeros = 0;

        //Solicito el ingreso de datos y realizo un try catch por si es menor de 10
        do {
            System.out.println("Cuántos números deseas comparar? Mínimo 10 números");
            try {
                cantNumeros = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Mínimo 10 números a comparar!");
                ciclo = false;
            }
            //Realizo la comparación de los números ingresados.
            for (int i = 0; i < cantNumeros; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = entrada.nextInt();
                menor = (numero < menor) ? numero : menor;
                System.out.println("El número menor es: " + menor);
            }
        } while (ciclo);
        //Imprimo los resultados.
        if (menor < 10) {
            System.out.println("El número " + menor + " es menor que 10!");
        } else {
            System.out.println("El número " + menor + " es igual o mayor que 10!");
        }
    }
}