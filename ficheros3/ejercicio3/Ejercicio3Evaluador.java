package deberesTau.ejercicio3;

import deberesTau.ejercicio3.lecturaEscritura.Ejercicio3LeerEscribir;

public class Ejercicio3Evaluador {
    //Constructor con parámetros.
    public Ejercicio3Evaluador(String rutaEntrada, String rutaSalida) {
        Ejercicio3Comprobador comprobar = new Ejercicio3Comprobador();
        Ejercicio3LeerEscribir escribir = new Ejercicio3LeerEscribir();
        String fraseFichero = comprobar.leerFrase();
        String contadorComprobador = comprobar.contarVocalesCaracteres(fraseFichero, rutaEntrada);
        escribir.crearArchivoWriter(rutaSalida, contadorComprobador);
    }
}
