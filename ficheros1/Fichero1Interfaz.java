package ficheros1;

import javax.swing.*;

public class Fichero1Interfaz {
    //Le indico la expresión regular que necesito para validar la entrada nombre.
    private static  boolean sonLetras(String n){
        return n.matches("[a-zA-Z]*");
    }

    //Solicito la entrada de los datos.
    public String ingresaFrase() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        while (frase == null || frase.isEmpty() || frase.isBlank()){
            frase = JOptionPane.showInputDialog(null,
                    "Error!.\n" +
                            "Por favor, ingrese una frase:");
        }
        return frase;
    }

    //Muestro los datos que se recogieron.+
    public void mostrarSalida(String i){
        JOptionPane.showMessageDialog(null, i);
    }
}
