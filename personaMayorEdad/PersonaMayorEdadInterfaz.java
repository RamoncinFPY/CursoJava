package personaMayorEdad;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonaMayorEdadInterfaz extends PersonaMayorEdad{

    public PersonaMayorEdadInterfaz() {
    }

    public PersonaMayorEdadInterfaz(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

   //Método para que el usuario sólo ingrese letras.
    public static boolean sonLetras(String n){
        return n.matches("[a-zA-Z]*");
    }
    //Solicito la entrada de los datos.
    public String ingresaNombre() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:").trim();

        while ((nombre == null) || nombre.isEmpty() || nombre.isBlank() || !sonLetras(nombre)) {
            nombre = JOptionPane.showInputDialog(null,
                    "Nombre introducido erróneo!. \n" +
                            "Por favor, ingrese su nombre:");
        }
        return nombre;
    }
    //Método para que el usuario sólo ingrese números.
    private static boolean esNumero(String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public int ingresaEdad() {
        String edadStr = JOptionPane.showInputDialog(null,"Ingrese su edad:");
        while (!esNumero(edadStr) || edadStr.contains("-")) {
            edadStr = JOptionPane.showInputDialog(null,
                    "Edad introducida errónea!. \n" +
                            "Por favor, ingrese su edad:");
        }

        int edad = Integer.parseInt(edadStr);
        return edad;
    }

    public void mostrarSalida(String i){
        JOptionPane.showMessageDialog(null, i);
    }
}