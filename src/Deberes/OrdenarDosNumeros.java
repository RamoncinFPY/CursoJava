package deberes;

import java.util.Scanner;

public class OrdenarDosNumeros {
    public static void main(String[] args) {

        //Solicito la entrada de los números a comparar.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        int numero2 = entrada.nextInt();
        //Para la comparación uso un operador ternario.
        String salida = (numero1 > numero2) ? (numero1+"\n"+ numero2) : (numero2+"\n"+ numero1);
        System.out.println("Ordenados de mayor a menor:\n" + salida);
    }
}