package deberes;

import javax.swing.*;

public class MultiplicarSinX {
    public static void main(String[] args) {
        //Solicito los dos números.
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número"));

        //Con el for voy sumando num1 las veces de num2 para obtener el resultado.
        int total = 0;
        for (int i = 0; i < num2; i++) {
            total += num1;
        }
        //Imprimo el resultado.
        JOptionPane.showMessageDialog(null, " " +num1+ " *  " +num2+ " =  " +total);
    }
}