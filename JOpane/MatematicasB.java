package JOpane;

import javax.swing.*;

public class MatematicasB {
    public static void main(String[] args) {
        String[] operacion = {"SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR"};

        //int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el primer número:", "Matemáticas Básicas",JOptionPane.OK_CANCEL_OPTION, new ImageIcon("monito.png")));
        int seleccion = JOptionPane.showOptionDialog(null,"Elige una opción:",
                "Matemáticas Básicas", 0, JOptionPane.QUESTION_MESSAGE,
                new ImageIcon("monito.png"),operacion,"SUMAR");
        System.out.println("seleccion = " + seleccion);
        System.out.println("operacion[seleccion] = " + operacion[seleccion]);
    }
}
