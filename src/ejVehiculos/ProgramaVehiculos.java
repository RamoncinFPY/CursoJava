package ejVehiculos;
import java.util.*;

//Pertenece a la clase Vehiculos.java
public class ProgramaVehiculos{
	
	public static int indiceCocheMasBarato(Vehiculos coches[]) {
		float precio;
		int indice = 0;
		
		precio = coches[0].getPrecio();
		for(int i = 0; i < coches.length; i++) {
			if(coches[i].getPrecio() < precio) {
				precio = coches[i].getPrecio();
				indice = i;
			}
		}
		return indice;
	}
	
	public static void main(String[] args) {
		//Declaro mis variables.
		Scanner entrada = new Scanner(System.in);
		String marca; 
		String modelo;
		float precio;
		int numeroVehiculos, indiceBarato;
		
		//Solicito al usuario cuantos vehiculos desea comparar.
		System.out.print("¿Cuántos vehículos deseas comparar?  ");
		numeroVehiculos = entrada.nextInt();
		
		//Creo un array con la cantidad de vehículos.
		Vehiculos coches[] = new Vehiculos[numeroVehiculos];
		
		//Con el for voy llenando el array.
		for(int i = 0; i < coches.length; i++) {
			//Esta línea es para vaciar el buffer de Scanner
			entrada.nextLine();
			System.out.println("Ingrese las características del coche "+ (i+1));
			
			System.out.print("Ingrese la marca: ");
			marca = entrada.nextLine();
			
			System.out.print("Ingrese el modelo: ");
			modelo = entrada.nextLine();
			
			System.out.print("Ingrese el precio: ");
			precio = entrada.nextFloat();
			
			coches[i] = new Vehiculos(marca, modelo, precio);
		}
		entrada.close();
		indiceBarato = indiceCocheMasBarato(coches);
		System.out.println("\nEl coche más barato es:");
		System.out.println(coches[indiceBarato].mostrarDatos());
	}
}