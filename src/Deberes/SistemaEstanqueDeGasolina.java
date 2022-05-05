package deberes;

import java.util.Scanner;

public class SistemaEstanqueDeGasolina {
    public static void main(String[] args) {
        double capacidad = 70.0D;
        double medida;
        int opcion = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la medida del estanque por favor.");
        medida = entrada.nextDouble();

        if (medida == 70.0D){
            System.out.println("Estanque lleno.");
        } else if (medida >= 60 && medida < 70) {
            System.out.println("Estanque  casi lleno.");
        } else if (medida > 40 && medida < 60) {
            System.out.println("Estanque 3/4.");
        } else if (medida >= 35 && medida < 40) {
            System.out.println("Estanque  medio.");
        } else if (medida >= 20 && medida < 35) {
            System.out.println("Estanque suficiente.");
        }else if (medida >= 1 && medida < 20){
            System.out.println("Estanque Insuficiente.");
        }else System.out.println("Valor incorrecto");
    }
}