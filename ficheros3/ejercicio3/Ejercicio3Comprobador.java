package deberesTau.ejercicio3;

import deberesTau.ejercicio3.lecturaEscritura.Ejercicio3LeerEscribir;

public class Ejercicio3Comprobador {
    //Instancias de mis dos clases.
    Ejercicio3LeerEscribir f1 = new Ejercicio3LeerEscribir();
    Ejercicio3Interfaz f1i = new Ejercicio3Interfaz();

    //Constructor
    public Ejercicio3Comprobador() {    }

    //Método para solicitar al usuario que ingrese la palabra o frase.
    public String leerFrase() {
        String s = f1i.ingresaFrase();
        return s;
    }

    //PARA LEER FICHEROS.
    public String contarVocalesCaracteres(String s, String nombreArchivo) {

        String lectura = null;
        String resultado = "";
        char[] resultadoVocales;
        int contarVocales = 0;
        String salidaAlFichero = null;

        lectura = f1.leerArchivo(nombreArchivo);

        //Comparo si la palabra se encuentra en la frase.
        resultado = (lectura.contains(s)) ? "La palabra se encuentra en la frase." : "La palabra NO se encuentra en la frase.";
        //Convierto la frase del fichero y lo convierto a array para contar las vocales.
        resultadoVocales = lectura.toCharArray();
        for (int i = 0; i < resultadoVocales.length; i++) {
            if (resultadoVocales[i] == 'a' || resultadoVocales[i] == 'e' || resultadoVocales[i] == 'i' ||
                    resultadoVocales[i] == '0' || resultadoVocales[i] == 'u') {
                contarVocales++;
            }
        }
        int contadorLetrasFrase = resultadoVocales.length;
        String caracteresFichero = (contadorLetrasFrase > 40) ? "tiene más de 40 caracteres" : "tiene " + contadorLetrasFrase + " caracteres, está dentro del rango de 40 caracteres.";
        int contadorLetrasPalabra = s.length();
        String caracteresPalabra = (contadorLetrasFrase > 40) ? "tiene más de 40 caracteres" : "tiene " + contadorLetrasPalabra +" caracteres, está dentro del rango de 40 caracteres.";

        //Muestro el contenido y el resultado.
        f1i.mostrarSalida("\nFrase fichero = " + lectura +  "tiene " + contarVocales + " vocales y " + caracteresFichero +
                              "\nPalabra ingresada = [" + s + "] " + caracteresPalabra +
                              "\nCOMPARACIÓN = " + resultado);

        salidaAlFichero = "La  del fichero " + lectura + " tiene " + contarVocales + " vocales.";
        return salidaAlFichero;
    }
}
