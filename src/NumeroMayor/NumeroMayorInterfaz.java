package NumeroMayor;

import javax.swing.*;

public class NumeroMayorInterfaz extends NumeroMayor{

    public NumeroMayorInterfaz() {
    }

    public NumeroMayorInterfaz(int numero1, int numero2) {
        super(numero1, numero2);
    }

    public int pideNumero1(){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número"));
        return num1;
    }

    public int pideNumero2(){
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número"));
        return num2;
    }

    public void salida1(String c){
        JOptionPane.showMessageDialog(null,c);
    }
}