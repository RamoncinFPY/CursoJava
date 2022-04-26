package variosCasa;

import java.util.*;

public class Promedio {

	public static void main(String[] args) {
		// Declaro las variables
		int numeroNotas;
		float nota;
		float suma = 0;
		int i = 0;
		float promedio;
		Scanner entrada = new Scanner(System.in);
		try {//Solicito la entrada de los datos.
			System.out.println("�Cu�ntas notas va a ingresar?");
			numeroNotas = entrada.nextInt();
			
			//Seg�n el numero de notas realizo el ingreso de cada una de ellas.
			while (i < numeroNotas) {
				System.out.println("Ingrese las notas: ");
				
				nota = entrada.nextFloat();
				if(nota > 0 && nota <= 10) {
					suma += nota;
					i++;
				}else {
					System.out.println("La nota introducida es incorrecta!");
				}
			}
			promedio = suma / numeroNotas;
			System.out.println("El promedio es: " + String.format("%.2f", promedio) + " sobre 10.");
			
		}finally {
			entrada.close();
		}
	}
}
