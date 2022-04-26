package variosCasa;

import java.util.*;

public class CalculadoraIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaro las constantes si necesito hacer conversiones.
		//final double KILOGRAMOS_X_LIBRA = 0.454;
		//final double METROS_X_PIE = 0.3046;
		
		//Para mostrar el t�tulo.
		System.out.println("Calculadora Indice Masa Corporal");
		//Esto se usa para poder pedir datos por pantalla.
		Scanner entrada = new Scanner(System.in);
		try {
			//Solicito los datos al usuario.
			System.out.println("Introduzca su peso en kilos: ");
			double pesoEnKilos = entrada.nextDouble();
			System.out.println("Introduzca su altura en metros: ");
			double alturaEnMetros = entrada.nextDouble();
		
			//C�lculo del IMC
			double imc = pesoEnKilos / (alturaEnMetros * alturaEnMetros);
			
			//Muestro los resultados por consola.
			System.out.println("T� IMC es: " + Math.round(imc));
		}finally {
			entrada.close();
		}
		
	}
	
}
