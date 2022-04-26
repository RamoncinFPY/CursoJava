package variosCasa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "fichero1.txt";//Fichero ruta = new File REVISAR
		Scanner entrada = new Scanner(System.in);
		String frase;
		try {
			FileWriter fw=new FileWriter (ruta);//True para a�adir texto
			System.out.println("Introduce las palabras que deseas guardar en el fichero");
			frase = entrada.nextLine();
			fw.write(frase);
			entrada.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
