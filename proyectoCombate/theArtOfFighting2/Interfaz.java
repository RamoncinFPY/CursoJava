package proyectoCombate.theArtOfFighting2;

import javax.swing.*;

public class Interfaz {
    private String nombreI;
    private String tipo;
    private Integer fuerza;
    private Integer vida;
    private final int MANOTAZO = 5;
    private final int GUARACAZO = 10;
    private final int PATADA = 20;
    private final int ESPADA = 30;
    private int menu;
    private int menuPelea;


    private String mostrarResultados;

    //Constructor sin parámetros.
    public Interfaz() {    }

    //Uso JOptionPane para pedir los datos al usuario para construir los guerreros y luego mostrarlos.
    public String getNombreI() {
        this.nombreI = JOptionPane.showInputDialog(null,"Nombre del guerrero:").toUpperCase();
        return nombreI;
    }

    public String getTipoI() {
        this.tipo = JOptionPane.showInputDialog(null,"Tipo del guerrero:");
        return tipo;
    }

    public int getFuerza() {
        this.fuerza = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de fuerza del guerrero:"));
        return fuerza;
    }

    public int getVida() {
        this.vida = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de vida del guerrero:"));
        return vida;
    }

    public int getMenu(String x, String y){
        this.menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Que guerrero inicia el combate?"+
                "\n1 Guerrero1: " + x +"\n2 Guerrero2: " + y));
        return menu;
    }

    public int getMenuAtaques(){
        this.menuPelea = Integer.parseInt(JOptionPane.showInputDialog(null,"===============================\n"+
                "OPCIONES DE ATAQUES\n1 ataque 1\n2 ataque 2\n3 ataque 3\n4 ataque 4"));
        return menuPelea;
    }

    public int getMANOTAZO() {
        return MANOTAZO;
    }

    public int getGUARACAZO() {
        return GUARACAZO;
    }

    public int getPATADA() {
        return PATADA;
    }

    public int getESPADA() {
        return ESPADA;
    }

    public String getMostrarResultados(String x, ImageIcon icono) {
        JOptionPane.showMessageDialog(null, x, "COLISEO", JOptionPane.PLAIN_MESSAGE,icono);
        return mostrarResultados;
    }
}
