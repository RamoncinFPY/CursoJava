package Deberes;

import java.util.Scanner;
import static java.lang.Math.PI;

public class AreaCirculo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //Solicito la entrada de datos.
        System.out.println("Ingrese el radio del círculo.");
        double radio = entrada.nextDouble();
        //Perímetro = 2 * PI * radio.
        double perimetro = 2 * PI * radio;
        //Área = (Constante PI multiplicado por el radio al cuadrado).
        double area = PI * Math.pow(radio, 2.00);
        //Muestro los resultados.
        System.out.println("El perímetro del círculo es = " + perimetro + " cm.");
        System.out.println("El área del círculo es = " + area + " cm².");
    }
}