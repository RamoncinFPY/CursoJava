package demoUi;

import javax.swing.*;

public class Interfaz extends Suma{

    public Interfaz() {
    }

    public Interfaz(int num1, int num2) {
        super(num1, num2);
    }

    public int pideNum1(){
        Integer num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Primer Número"));
        return num1;
    }

    public int pideNum2(){
        Integer num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo Número"));
        return num2;
    }

    public int daTotal(){
        Integer total;
        JOptionPane.showMessageDialog(null, (total = getNum1() + getNum2()));
        return total;
    }
}
