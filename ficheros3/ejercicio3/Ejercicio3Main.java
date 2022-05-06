package deberesTau.ejercicio3;

public class Ejercicio3Main {
    public static void main(String[] args) {

        String rutaEntrada = "D:\\PROGRAMACION\\JavaCurso\\CursoJava\\src\\deberesTau\\ejercicio3\\archivos\\ficheroEntrada.txt";
        String rutaSalida = "D:\\PROGRAMACION\\JavaCurso\\CursoJava\\src\\deberesTau\\ejercicio3\\archivos\\ficheroSalida.txt";

        Ejercicio3Evaluador evaluador = new Ejercicio3Evaluador(rutaEntrada, rutaSalida);
    }
}
