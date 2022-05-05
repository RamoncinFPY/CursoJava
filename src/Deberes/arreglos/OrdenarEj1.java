package deberes.arreglos;

import java.util.Scanner;

/*Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
el segundo, el antepenúltimo, el tercero, y así sucesivamente.*/
public class OrdenarEj1 {
    public static void main(String[] args) {
        System.out.println("Ordenamiento intercalado de 10 números\n(el último, el primero, el penúltimo," +
                "el segundo, et...)");
        Scanner entrada = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];
        System.out.println("b.length = " + b.length);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número para la posición " +i+ " :");
            a[i] = entrada.nextInt();
        }
        /*
        // como en cada iteración del for se muestran dos números
        // solo necesitaremos recorrer la mitad de iteraciones, con eso es suficiente.
        System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
            System.out.println(arreglo[9 - i]); // y el i-ésimo por el final
            System.out.println(arreglo[i]); // mostramos el i-ésimo número por el principio
        }
        */

        int mayores = 9;
        int menores = 0;

        for (int i = 0; i < a.length; i+=2) {
                b[i] = a[mayores];
                b[i+1] = a[menores];
                mayores--;
                menores++;
        }

        System.out.println("============================================");
        System.out.println("Array original.");
        for (int i = 0; i < a.length; i++) {
            System.out.println("=> a[" + i + "] = " + a[i]);
        }
        System.out.println("============================================");

        System.out.println("Array ordenado.");
        for (int i = 0; i < a.length; i++) {
            System.out.println("=> b[" + i + "] = " + b[i]);
        }
    }
}
