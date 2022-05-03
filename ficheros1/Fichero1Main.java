package ficheros1;

public class Fichero1Main {
    public static void main(String[] args) {
        Fichero1Comparar f1c = new Fichero1Comparar();
        String frase = f1c.leerFrase();
        System.out.println(f1c.leerFichero(frase));

    }
}
