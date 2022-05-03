package ficheros2;

import javax.swing.*;

public class Fichero2Interfaz {
    public Fichero2Interfaz() {    }

    //Método para comprobar que sea un número.
    private static boolean esNumero(String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public int ingresaNumero() {
        String num = JOptionPane.showInputDialog(null,"Ingrese un número:");
        while (!esNumero(num) || num.contains("-")) {
            num = JOptionPane.showInputDialog(null,
                    "Error!.\n" +
                            "Por favor, ingrese un número:");
        }
        int numero = Integer.parseInt(num);
        return numero;
    }

    //Muestro los datos que se recogieron.+
    public void mostrarSalida(String i){
        JOptionPane.showMessageDialog(null, i);
    }
}
