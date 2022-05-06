package deberesTau.ejercicio3.lecturaEscritura;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3LeerEscribir {

    //Método para crear el archivo en modo append.
    public void crearArchivoAppend(String nombre) {
        File archivo = new File(nombre);
        //Desde java 7 se puede usar esto, y así se evita el file y buffer.close().
        try (BufferedWriter anadir = new BufferedWriter(new FileWriter(archivo, true))) {
            //Se puede usar este método o directamente FileWriter.
            //anadir.append("Hola que tal amigos!\n");
            //anadir.close(); //El cierre se haría aquí.
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Método para crear el archivo en modo escritura.
    public void crearArchivoWriter(String nombre, String lectura) {
        File archivo = new File(nombre);
        try (PrintWriter escribir = new PrintWriter(new FileWriter(archivo))) {
            escribir.println(lectura);
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

    public String leerArchivo2(String nombre) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)) {
            //Establece el patrón delimitador de este escáner en un patrón construido a partir de la string especificada.
            s.useDelimiter("\n");
            //El método hasNext simplemente comprueba si el valor de la variable está dentro del rango.
            // o El método next guarda el valor de la variable
            while (s.hasNext()) {
                sb.append(s.next()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}