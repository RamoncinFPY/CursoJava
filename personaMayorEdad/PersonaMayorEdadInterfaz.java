package personaMayorEdad;

import javax.swing.*;

public class PersonaMayorEdadInterfaz extends PersonaMayorEdad{

    public PersonaMayorEdadInterfaz() {
    }

    //Solicito la entrada de los datos
    public String ingresaNombre() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        return nombre;
    }

    public int ingresaEdad() {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
        return edad;
    }

    public void mostrarSalida(String i){
        JOptionPane.showMessageDialog(null, i);
    }
}
