package deberesTau.ejercicio3;

import deberesTau.ejercicio3.lecturaEscritura.Ejercicio3LeerEscribir;

public class Ejercicio3Evaluador {

    String rutaEntrada = "D:\\PROGRAMACION\\JavaCurso\\CursoJava\\src\\deberesTau\\ejercicio3\\archivos\\ficheroEntrada.txt";
    String rutaSalida = "D:\\PROGRAMACION\\JavaCurso\\CursoJava\\src\\deberesTau\\ejercicio3\\archivos\\ficheroSalida.txt";

    Ejercicio3Comprobador comprobar = new Ejercicio3Comprobador();
    Ejercicio3LeerEscribir escribir = new Ejercicio3LeerEscribir();

    public Ejercicio3Evaluador() {
        String fraseFichero = comprobar.leerFrase();
        String contadorComprobador = comprobar.contarVocalesCaracteres(fraseFichero, rutaEntrada);
        escribir.crearArchivoWriter(rutaSalida, contadorComprobador);
    }
}
