package variosCasa;

import java.util.*;
import java.lang.*;
import java.io.*;

import javax.swing.JOptionPane;

public class String1 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		// Para pedir n�meros a trav�s de interfaz gr�fica
		// int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un n�mero:
		// "));

		String frase = "", subFrase = "", busqueda = "";
		// int inicio = 0, fin = 0;

		System.out.println("*******************************");
		System.out.println("  Ingresa la frase a analizar: ");
		System.out.println("*******************************");

		frase = entrada.nextLine();
		System.out.println("La frase tiene " + frase.length() + " caracteres.");
		// char[] aCaracteres = frase.toCharArray();
		// System.out.println(aCaracteres);
		/*
		 * //Para hacer substrings.
		 * System.out.print("Desde d�nde deseas tu subfrase?: "); inicio =
		 * entrada.nextInt(); System.out.print("Hasta d�nde deseas tu subfrase?: "); fin
		 * = entrada.nextInt();
		 * 
		 * subFrase = frase.substring(inicio, fin);
		 * System.out.println("Tu subfrase es: " + subFrase);
		 */
		System.out.print("Qu� caracter deseas buscar?: ");
		busqueda = entrada.next();

		/*
		 * //Para saber la posici�n de un caracter. int posicion1 =
		 * frase.indexOf(busqueda, 0); int posicion2 = frase.lastIndexOf(busqueda,
		 * frase.length()-1);
		 * 
		 * System.out.println("El caracter \"" + busqueda +
		 * "\" se encuentra en la posici�n: " + posicion1);
		 * System.out.println("El caracter \"" + busqueda +
		 * "\" se encuentra en la posici�n: " + posicion2);
		 * 
		 * for(int i = 0; i < frase.length()-1; i++) { int posicion =
		 * frase.indexOf(busqueda, i); //char buscar = frase.charAt(posicion);
		 * 
		 * //Para saber si la cadena contiene caracteres o palabras.
		 * if(frase.contains(busqueda)) { System.out.println("El caracter [" + busqueda
		 * + "] se encuentra en la posici�n: " + posicion); }else {
		 * System.out.print("El caracter [" + busqueda + "] no se encuentra"); } }
		 */
		// char[] charSearch = {'@'};
		//Convierto el caracter a buscar a un char para recorrer la frase y compararla.
		char[] charSearch = busqueda.toCharArray();
		
		for (int i = 0; i < frase.length(); i++) {
			//Convierto cada letra de la frase a caracter para poder comparalo.
			char chr = frase.charAt(i);
			// System.out.println("Esto es chr " +chr);
			for (int j = 0; j < charSearch.length; j++) {
				if (charSearch[j] == chr) {
					int posicion = i + 1;
					System.out.println("El caracter: \"" + charSearch[j] + "\" se encuentra en la frase \"" + frase
							+ "\" en la posici�n: " + posicion + ".\tPosici�n real = " + i);
				}
			}
		}

		entrada.close();
	}
}