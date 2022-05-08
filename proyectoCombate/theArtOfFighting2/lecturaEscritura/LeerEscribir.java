package proyectoCombate.theArtOfFighting2.lecturaEscritura;

import java.io.*;
import java.util.Scanner;

public class LeerEscribir {

    //Método para crear el archivo en modo append.
    public void crearArchivoAppend(String ruta, String escribir) {
        File archivo = new File(ruta);
        //Desde java 7 se puede usar esto, y así se evita el file y buffer.close().
        try (BufferedWriter anadir = new BufferedWriter(new FileWriter(archivo, true))) {
            //Se puede usar este método o directamente FileWriter.
            anadir.append(escribir + "\n");
            //anadir.close(); //El cierre se haría aquí, pero ya no es necesario.
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Método para crear el archivo en modo escritura.
    public void crearArchivoWriter(String ruta, String escritura) {
        File archivo = new File(ruta);
        try (PrintWriter escribir = new PrintWriter(new FileWriter(archivo))) {
            escribir.println(escritura);
            //Se puede usar esto. //escribir.println("Hola que tal amigos!");
            //o el print formateado //escribir.printf("Hasta luego %s!", "Lucas");
            // buffer.close(); //No es necesario.
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Métodos para leer los archivos.
    public String leerArchivo(String nombreArchivo) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombreArchivo);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    //Otra manera de leer los archivos.
    public String leerArchivo2(String nombre) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)) {
            //Establece el patrón delimitador de este escáner en un patrón construido a partir de la string especificada.
            s.useDelimiter("\n");
            //El método hasNext simplemente comprueba si el valor de la variable está dentro del rango.
            //o El método next guarda el valor de la variable
            while (s.hasNext()) {
                sb.append(s.next()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}