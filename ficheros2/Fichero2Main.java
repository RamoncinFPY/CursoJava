package ficheros2;

public class Fichero2Main {
    public static void main(String[] args) {
        Fichero2Sumar f2s = new Fichero2Sumar();
        double x = f2s.leerNumero();
        String y = f2s.leerFichero(x);
        f2s.escribirFichero(y);

    }
}
