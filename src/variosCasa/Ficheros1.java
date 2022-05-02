package variosCasa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros1 {

	public static void main(String[] args) {

		String ruta = "C:\\Users\\Alumnos\\IdeaProjects\\ejercicio1Java\\src\\variosCasa\\fichero1.txt";//Fichero ruta = new File REVISAR
		Scanner entrada = new Scanner(System.in);
		String frase;

		//PARA ESCRIBIR UN FICHERO.
		try {//Modo escritura sobreescribe cada vez que se da uso.
			FileWriter fw = new FileWriter(ruta);// Hay que poner <,true> para añadir texto modo append().
			System.out.println("\nIntroduce las palabras que deseas guardar en el fichero");
			frase = entrada.nextLine();
			fw.write(frase + "\n");
			entrada.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error = " + e);
		}

		//PARA LEER FICHEROS.
		System.out.println("\t=======================");
		System.out.println("\t  Fichero de salida");
		System.out.println("\t=======================");

		FileReader fr = null;
		BufferedReader br = null;
		String lectura;
		try {
			fr = new FileReader(ruta);
			br = new BufferedReader(fr);

			while ((lectura = br.readLine()) != null) {

				System.out.println(lectura);
			}

		} catch (Exception e) {
			System.err.println("Error = " + e);
		} finally {
			try {
				if (null != fr || null != br) {
					fr.close();
					br.close();				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
