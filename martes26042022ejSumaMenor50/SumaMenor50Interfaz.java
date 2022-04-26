package martes26042022ejSumaMenor50;

import javax.swing.*;

public class SumaMenor50Interfaz extends SumaMenor50{
    private int num1;
    private int num2;
    public SumaMenor50Interfaz() {    }

    public int ingresaNumero1(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número."));
        return num1;
    }

    public int ingresaNumero2(){
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número."));
        return num2;
    }
    @Override
    public void setNumero1(int num1) {
        super.setNumero1(num1);
    }

    @Override
    public void setNumero2(int num2) {
        super.setNumero2(num2);
    }

    public void resultado(){
        int total = getTotal();
        String salida = (total < 50) ? "La suma es menor de 50." : "La suma es mayor de 50.";
        JOptionPane.showMessageDialog(null, "La suma es = "+total+ "\n" +salida);
    }
}
