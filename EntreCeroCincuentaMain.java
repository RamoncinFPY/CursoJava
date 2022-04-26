package deCeroA50;

import javax.swing.*;
import java.util.Objects;

public class EntreCeroCincuentaMain {

    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Ingrese un numero entre 0 y 50");
        String resultado = (!Objects.isNull(num1) && !Objects.equals(num1, "") && !Objects.equals(num1, " ") && 0 < Integer.parseInt(num1) && Integer.parseInt(num1) < 50) ? "El número está entre 0 y 50" : "El número está fuera de rango";
        JOptionPane.showMessageDialog(null, resultado);
    }
}
