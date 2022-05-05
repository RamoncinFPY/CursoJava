package deberes;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingrese su nombre y apellido:");
        String nombre2 = JOptionPane.showInputDialog("Ingrese su nombre y apellido:");
        String nombre3 = JOptionPane.showInputDialog("Ingrese su nombre y apellidor:");

        int espacio1 = nombre1.indexOf(" ");
        String nombre_1 = nombre1.substring(0,espacio1);
        int longitud1 = nombre_1.length();

        int espacio2 = nombre2.indexOf(" ");
        String nombre_2 = nombre2.substring(0,espacio2);
        int longitud2 = nombre_2.length();

        int espacio3 = nombre3.indexOf(" ");
        String nombre_3 = nombre3.substring(0,espacio3);
        int longitud3 = nombre_3.length();

        int longitud = longitud1 > longitud2 ? longitud1 : longitud2;
        longitud = longitud > longitud3 ? longitud : longitud3;

        if (longitud == longitud1){
            JOptionPane.showMessageDialog(null, "El nombre más largo es " + nombre1);
        } else if (longitud == longitud2){
            JOptionPane.showMessageDialog(null, "El nombre más largo es " + nombre2);
        } else if (longitud == longitud3) {
            JOptionPane.showMessageDialog(null, "El nombre más largo es " + nombre3);
        }
    }
}