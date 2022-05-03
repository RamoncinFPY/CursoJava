package promedioTres;

import javax.swing.*;

public class PromedioTresInterfaz {
    //Constructor
    public PromedioTresInterfaz() {    }

    //Método para comprobar si el valor es numérico.
    public boolean esNumero(String n){
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
    //Para el ingreso de los datos por pantalla.
    public double ingresaNumeros(){
        String n = JOptionPane.showInputDialog(null, "Ingrese un número;", "Comparar Tres Números",3);
        while (n.contains("-") || !esNumero(n) || n.isBlank() || n.isEmpty() || n == null || n.equals(0)){
            n = JOptionPane.showInputDialog(null, "Vuelva a intentarlo!\nIngrese un número;", "Comparar Tres Números",0);
        }
        double numero = Integer.parseInt(n);
        return numero;
    }

    //Para mostrar la salida.
    public String mostrarSalida(String i){
        JOptionPane.showMessageDialog(null, i);
        return i;
    }

}