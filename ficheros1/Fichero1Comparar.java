package ficheros1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Fichero1Comparar {
    Fichero1 f1 = new Fichero1();
    Fichero1Interfaz f1i = new Fichero1Interfaz();

    public Fichero1Comparar() {    }

    public String leerFrase(){
         String s = f1i.ingresaFrase();
        return s;
    }

    public String leerFichero(String s) {
        String ruta = f1.getRuta();
        String lectura = null;

        //PARA LEER FICHEROS.
        System.out.println("\t=======================");
        System.out.println("\t  Fichero de salida");
        System.out.println("\t=======================");

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);

            while ((lectura = br.readLine()) != null) {
                System.out.println(lectura);
                String resultado = (lectura.equals(s)) ? "Las frases son iguales." : "Las frases  NO son iguales.";
                System.out.println(resultado);
                f1i.mostrarSalida("\nFrase fichero = "+lectura+"\nFrase ingresada = "+s+"\nCOMPARACIÓN = "+resultado);
            }

        } catch (Exception e) {
            System.err.println("Error = " + e);
        } finally {
            try {
                if (null != fr || null != br) {
                    fr.close();
                    br.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return s;
    }
}
