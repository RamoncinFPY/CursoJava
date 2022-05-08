package proyectoCombate.theArtOfFighting;

public class Arena {
    //Constructor sin parámetros
    public Arena() {    }

    //Creo un método para que los guerreros peleen.
    public String combate() {
        //LLamo a la Class interfaz para usar JOptionPane
        Interfaz ventana = new Interfaz();
        //Creo los 2 guerreros necesarios para este programa.
        Guerrero guerrero1 = new Guerrero(ventana.ingresaNombre(), ventana.ingresaTipo(), ventana.ingresaFuerza(), ventana.ingresVida());
        Guerrero guerrero2 = new Guerrero(ventana.ingresaNombre(), ventana.ingresaTipo(), ventana.ingresaFuerza(), ventana.ingresVida());
        //Una vez creados los guerreros regreso los valores para el combate
        int fuerza1 = guerrero1.getFuerza();
        int vida1   = guerrero1.getVida();
        int fuerza2 = guerrero2.getFuerza();
        int vida2   = guerrero2.getVida();
        //Hago la comparación para ver quien es el que pierde.
        String f    = (fuerza1 > fuerza2) ? ("Gana Guerrero 1, Guerrero 2 pierde con " + (vida2 - fuerza1)) : ("Gana Guerrero 2, Guerrero 1 pierde con " + (vida1 - fuerza2));
        //Guardo en una variable los valores a mostrar.
        String salida = "\tThe Art Of Fighting" +
                "\n" + guerrero1.toString() +
                "\n" + guerrero2.toString() +
                "\nRESULTADO DEL COMBATE: " + f;
        //Los muestro con JOptionPane.
        ventana.mostrar(salida);
        return salida;
    }
}