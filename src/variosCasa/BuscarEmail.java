package variosCasa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscarEmail{

	public static void main(String[] args) {

		String[] listaTextos = {
			"�Hola Mundo!",
			"miCorreo@gmail.com",
			"La teor�a de 'Pattern Machine' dice�",
			"correoFalso@yahoo.es",
			"En un lugar de la Mancha, cuyo nombre no quiero acordarme�",
			"+34 91 123 456 789",
			"estoNOesUnCorreoNoTieneArroba.com",
			"Ra-Mo_N1@hotmail.com",
			"Calle Alcal� 12345 Madrid, Madrid"
		};

		String expRegular = "[A-Za-z0-9_-]+@[a-z]+\\.[a-z]+";
		Pattern patron = Pattern.compile(expRegular);

		for (String texto : listaTextos) {
			Matcher emparejador = patron.matcher(texto);
			boolean esCoincidente = emparejador.find();

			if (esCoincidente) {
				System.out.println("Correo reconocido: " + texto);
			}
		}

	}
}