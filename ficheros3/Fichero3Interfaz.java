package ficheros3;

import javax.swing.*;

public class Fichero3Interfaz {
    //Le indico la expresión regular que necesito para validar la entrada nombre.
    private static  boolean sonLetras(String n){
        return n.matches("[a-zA-Z]*");
    }

    //Solicito la entrada de los datos.
    public String ingresaFrase() {
        String frase = JOptionPane.showInputDialog("Ingrese una palabra:");

        while (frase == null || frase.isEmpty() || frase.isBlank()){
            frase = JOptionPane.showInputDialog(null,
                    "Error!.\n" +
                            "Por favor, ingrese una palabra:");
        }
        return frase;
    }

    //Muestro los datos que se recogieron.+
    public void mostrarSalida(String i){
        JOptionPane.showMessageDialog(null, i);
    }
}
