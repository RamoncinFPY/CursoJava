package ficheros3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Fichero3Comparar {
    //Instancias de mis dos clases.
    Fichero3 f1 = new Fichero3();
    Fichero3Interfaz f1i = new Fichero3Interfaz();

    public Fichero3Comparar() {
        String fraseIngresada = leerFrase();
        leerFichero(fraseIngresada);
    }

    //Método para solicitar al usuario que ingrese la palabra o frase.
    public String leerFrase(){
         String s = f1i.ingresaFrase();
        return s;
    }

    //PARA LEER FICHEROS.
    public String leerFichero(String s) {
        String ruta = f1.getRuta();
        String lectura = null;
        FileReader fr = null;
        BufferedReader br = null;
        String resultado = "";
        char[] resultadoVocales;
        int contarVocales = 0;

        //Se prueba si el fichero existe y si tiene contenido.
        try {
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            //Se lee el contenido
            while ((lectura = br.readLine()) != null) {
                //Comparo si la palabra se encuentra en la frase.
                resultado = (lectura.contains(s)) ? "La palabra se encuentra en la frase." : "La palabra NO se encuentra en la frase.";
                //Convierto la frase del fichero y lo convierto a array para contar las vocales.
                resultadoVocales = lectura.toCharArray();
                for (int i = 0; i < resultadoVocales.length; i++) {
                    if (resultadoVocales[i] == 'a' || resultadoVocales[i] == 'e' || resultadoVocales[i] == 'i' || resultadoVocales[i] == '0' || resultadoVocales[i] == 'u') {
                        contarVocales++;
                    }

                }
                //Muestro el contenido y el resultado.
                f1i.mostrarSalida("\nFrase fichero = " + lectura + "\nPalabra ingresada = " + s + "\nCOMPARACIÓN = " + resultado + "\n\tLa frase del fichero contiene " + contarVocales + "Vocales.");
            }

            //Se recoge el error si lo hubiere.
        } catch (Exception e) {
            System.err.println("Error = " + e);
        } finally {
            try {//Se cierra el fichero y el buffer.
                if (null != fr || null != br) {
                    fr.close();
                    br.close();
                }
            //Se recoge el error si no se cierran los fr y br.
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return resultado;
    }
}