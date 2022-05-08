package proyectoCombate.theArtOfFighting;

import javax.swing.*;

public class Interfaz {
    //Constructor sin parámetros.
    public Interfaz() {    }

    //Uso JOptionPane para pedir los datos al usuario para construir los guerreros y luego mostrarlos.
    public String ingresaNombre() {
        String nom = JOptionPane.showInputDialog(null,"Nombre del guerrero:").toUpperCase();
        return nom;
    }

    public String ingresaTipo() {
        String tip = JOptionPane.showInputDialog(null,"Tipo del guerrero:");
        return tip;
    }

    public int ingresaFuerza() {
        int fuer = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de fuerza del guerrero:"));
        return fuer;
    }

    public int ingresVida() {
        int vid = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de vida del guerrero:"));
        return vid;
    }

    public void mostrar(String x){
        JOptionPane.showMessageDialog(null, x);
    }
}
