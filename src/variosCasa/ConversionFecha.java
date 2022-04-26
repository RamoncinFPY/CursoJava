package variosCasa;

import java.util.*;
import java.lang.*;

public class ConversionFecha{
	public static void main(String args[]) {
		
		System.out.println("***********************************************");
		System.out.println("Conversor de formatos de fecha");
		System.out.println("Convierte de: 15 de septiembre de 1973\n"
							+ "           a: 1973-septiembre-15");		
		System.out.println("***********************************************");
		
		System.out.println("Ingresa una fecha en formato convencional: ");
		Scanner entrada = new Scanner(System.in);
		//trim() para quitar los posibles espacios en blanco introducidos al principio y al final.
		String fechaHabitual = entrada.nextLine();
		
		//Para ir obteniendo las partes necesarias para la conversi�n.
		
		//Obtenci�n del d�a y el nuevo substring de fechaHabitual.
		fechaHabitual = fechaHabitual.trim();
		int d = fechaHabitual.indexOf(" "); //Encuentro el �ndice del primer espacio.
		String dia = fechaHabitual.substring(0, d);
		//System.out.println("El d�a es: " + dia);
		fechaHabitual = fechaHabitual.trim();
		fechaHabitual = fechaHabitual.substring(d);
		//System.out.println("Trim sin el dia: " + fechaHabitual);
		fechaHabitual = fechaHabitual.trim();	
		//System.out.println("Substring quitando los espacios: " + fechaHabitual);
		
		//Eliminar el 1er <de> y los espacios que pueda haber y crear el nuevo substring de fechaHabitual.
		fechaHabitual = fechaHabitual.trim();
		int p = fechaHabitual.indexOf(" "); //Encuentro el �ndice del primer espacio.
		//String pde = fechaHabitual.substring(0, p);
		
		fechaHabitual = fechaHabitual.trim();
		fechaHabitual = fechaHabitual.substring(p);
		//System.out.println("Trim sin el primer de: " + fechaHabitual);
		fechaHabitual = fechaHabitual.trim();	
		//System.out.println("Substring sin espacios: " + fechaHabitual);

		//Obtenci�n del mes y el nuevo substring de fechaHabitual.
		fechaHabitual = fechaHabitual.trim();
		int m = fechaHabitual.indexOf(" "); //Encuentro el �ndice del primer espacio.
		String mes = fechaHabitual.substring(0, m);
		//System.out.println("El mes es: " + mes);
		fechaHabitual = fechaHabitual.trim();
		fechaHabitual = fechaHabitual.substring(m);
		//System.out.println("Trim sin el mes: " + fechaHabitual);
		fechaHabitual = fechaHabitual.trim();	
		//System.out.println("Substring quitando los espacios: " + fechaHabitual);
		
		//Para quitar el 2do <de>, eliminar los espacios que pueda haber y crear el nuevo substring de fechaHabitual.
		fechaHabitual = fechaHabitual.trim();
		int q = fechaHabitual.indexOf(" "); //Encuentro el �ndice del primer espacio.
		//String qde = fechaHabitual.substring(0, q);
		
		fechaHabitual = fechaHabitual.trim();
		fechaHabitual = fechaHabitual.substring(q);
		//System.out.println("Trim sin el segundo de: " + fechaHabitual);
		fechaHabitual = fechaHabitual.trim();	
		//System.out.println("Substring sin espacios: " + fechaHabitual);
		
		
		//Para la obtenci�n del a�o.
		String anio = fechaHabitual.trim();
		//System.out.println("El a�o es: " + anio);
		
		//Muestro la conversi�n.
		System.out.println("La fecha en formato est�ndar es:\n" + 
							anio + "-" + mes + "-" + dia);
		System.out.println("***********************************************");

		

	}
}