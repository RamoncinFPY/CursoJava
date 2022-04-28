package operacionesBasicas;

import javax.swing.*;

public class OperacionesBasicasInterfaz extends OperacionesBasicas {
   
    public OperacionesBasicasInterfaz() {
    }

    public int ingresaNum1(){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número:"));
        return num1;
    }

    public int ingresaNum2(){
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número:"));
        return num2;
    }

    public String ingresaOperacion(){
        String operacion = JOptionPane.showInputDialog("< + > Sumar\n< - > Restar\n< * > Multiplicar\n< / > Dividir");
        return operacion;
    }

    public String mostrarSalida(String i){
        JOptionPane.showMessageDialog(null,i);
        return i;
    }
}
