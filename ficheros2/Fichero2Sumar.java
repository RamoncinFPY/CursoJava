package ficheros2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero2Sumar {

    Fichero2 f2 = new Fichero2();
    Fichero2Interfaz f2i = new Fichero2Interfaz();

    public Fichero2Sumar() {
    }

    public double leerNumero() {
        return f2i.ingresaNumero();
    }

    public String leerFichero(double s) {
        String ruta = f2.getRuta();
        String lectura;

        //PARA LEER FICHEROS.
        System.out.println("\t=======================");
        System.out.println("\t  SUMA AL FICHERO");
        System.out.println("\t=======================");

        FileReader fr = null;
        BufferedReader br = null;

        double resultado = 0;
        try {
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);

            while ((lectura = br.readLine()) != null) {
                resultado = Integer.parseInt(lectura) + s;
                System.out.println(lectura + " + " + s + " = " + resultado);
                f2i.mostrarSalida("\nNúmero fichero = " + lectura + "\nNúmero ingresado = " + s + "\nSuma = " + resultado);
            }

        } catch (Exception e) {
            System.err.println("Error = " + e);
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                    assert br != null;
                    br.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return String.valueOf(resultado);
    }

    //PARA ESCRIBIR UN FICHERO.
    public String escribirFichero(String w) {
        //PARA ESCRIBIR UN FICHERO.
        FileWriter fw = null;
        try {//Modo escritura sobreescribe cada vez que se usa.
            fw = new FileWriter(f2.getRutaSalida());// Hay que poner <, true> para añadir texto modo append().
            fw.write(w + "\n");
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error = " + e);

        }finally {
            try {
                if (null != fw) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return w;
    }
}
