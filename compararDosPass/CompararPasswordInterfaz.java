package compararDosPass;

import javax.swing.*;

public class CompararPasswordInterfaz extends CompararPassword{
    public CompararPasswordInterfaz() {
    }

    public String pedirPass1(){
        String password1 = JOptionPane.showInputDialog("Ingrese la contraseña.");
        return password1;
    }
    public String pedirPass2(){
        String password2 = JOptionPane.showInputDialog("Confirme la contraseña.");
        return password2;
    }

    public String mostrarSalida(String i){
        JOptionPane.showMessageDialog(null,i);
        return i;
    }
}
