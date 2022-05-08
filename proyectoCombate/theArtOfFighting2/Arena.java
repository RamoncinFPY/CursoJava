package proyectoCombate.theArtOfFighting2;

import proyectoCombate.theArtOfFighting2.lecturaEscritura.LeerEscribir;

import javax.swing.*;

public class Arena {
    String rutaGuerrero1 = "D:\\PROGRAMACION\\JavaCurso\\CursoJava\\src\\proyectoCombate\\theArtOfFighting2\\archivos\\guerrero1.txt";
    String rutaGuerrero2 = "D:\\PROGRAMACION\\JavaCurso\\CursoJava\\src\\proyectoCombate\\theArtOfFighting2\\archivos\\guerrero2.txt";
    String rutaSalida = "D:\\PROGRAMACION\\JavaCurso\\CursoJava\\src\\proyectoCombate\\theArtOfFighting2\\archivos\\resultadoCombate.txt";

    //Constructor sin parámetros
    public Arena() {    }

    //Creo los 2 guerreros necesarios para este programa.
    Interfaz interfaz = new Interfaz();
    Guerrero guerrero1 = new Guerrero(interfaz.getNombreI(), interfaz.getTipoI(), interfaz.getFuerza(), interfaz.getVida());
    Guerrero guerrero2 = new Guerrero(interfaz.getNombreI(), interfaz.getTipoI(), interfaz.getFuerza(), interfaz.getVida());

    //Para guardar los datos iniciales de los guerreros.
    public void escribirArchivo() {
        LeerEscribir escribir = new LeerEscribir();
        escribir.crearArchivoAppend(rutaGuerrero1, guerrero1.toString());
        escribir.crearArchivoAppend(rutaGuerrero2, guerrero2.toString());
    }

    //Método para escoger quien inicia el combate
    public int modoPeleadores() {
        int delMenu;
        delMenu = interfaz.getMenu(guerrero1.getNombre(), guerrero2.getNombre());
        return delMenu;
    }

    //Creo un método para que los guerreros peleen.
    public void modoPelea(int delMenu) {
        int resultados1;
        int resultados2;
        int ataque;
        int vida1 = guerrero1.getVida();
        int vida2 = guerrero2.getVida();

        //Llamo al método para elegir el guerrero que empieza a pelear.
        ataque = interfaz.getMenuAtaques();

        //Switch para cada modo de ataque seleccionado.
        if (delMenu == 1) {
            switch (ataque) {
                case 1 -> {
                    resultados1 = vida2 - interfaz.getMANOTAZO();
                    guerrero2.setVida(resultados1);
                    System.out.println(guerrero2.getNombre() + " te queda: " + resultados1 + " de vida.");
                }
                case 2 -> {
                    resultados1 = vida2 - interfaz.getGUARACAZO();
                    guerrero2.setVida(resultados1);
                    System.out.println(guerrero2.getNombre() + " te queda: " + resultados1 + " de vida.");                }
                case 3 -> {
                    resultados1 = vida2 - interfaz.getPATADA();
                    guerrero2.setVida(resultados1);
                    System.out.println(guerrero2.getNombre() + " te queda: " + resultados1 + " de vida.");                }
                case 4 -> {
                    resultados1 = vida2 - interfaz.getESPADA();
                    guerrero2.setVida(resultados1);
                    System.out.println(guerrero2.getNombre() + " te queda: " + resultados1 + " de vida.");                }
            }

        } else if (delMenu == 2) {
            switch (ataque) {
                case 1 -> {
                    resultados2 = vida1 - interfaz.getMANOTAZO();
                    guerrero1.setVida(resultados2);
                    System.out.println(guerrero1.getNombre() + " te queda: " + resultados2 + " de vida.");                }
                case 2 -> {
                    resultados2 = vida1 - interfaz.getGUARACAZO();
                    guerrero1.setVida(resultados2);
                    System.out.println(guerrero1.getNombre() + " te queda: " + resultados2 + " de vida.");                }
                case 3 -> {
                    resultados2 = vida1 - interfaz.getPATADA();
                    guerrero1.setVida(resultados2);
                    System.out.println(guerrero1.getNombre() + " te queda: " + resultados2 + " de vida.");                }
                case 4 -> {
                    resultados2 = vida1 - interfaz.getESPADA();
                    guerrero1.setVida(resultados2);
                    System.out.println(guerrero1.getNombre() + " te queda: " + resultados2 + " de vida.");                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error!\nNÚMERO DE ATAQUE NO EXISTE.");
            modoPeleadores();
        }
    }

    //Este método es el que muestra los resultados del combate.
    public String combate() {
        String f;
        ImageIcon guerrero;
        ImageIcon guerreroImg1 = new ImageIcon("D:\\PROGRAMACION\\JavaCurso\\CursoJava\\src\\proyectoCombate\\theArtOfFighting2\\imagenes\\1.png");
        ImageIcon guerreroImg2 = new ImageIcon("D:\\PROGRAMACION\\JavaCurso\\CursoJava\\src\\proyectoCombate\\theArtOfFighting2\\imagenes\\2.png");

        //Hago la comparación para ver quien es el que pierde y setteo a 0 al perdedor..
        if (guerrero1.getVida() > guerrero2.getVida()){
            guerrero2.setFuerza(0);
            guerrero2.setVida(0);
            f = "Ganador guerrero1: " + guerrero1.getNombre() + " con " + guerrero1.getVida() + " de vida.";
            guerrero = guerreroImg1;
        }else{
            guerrero1.setFuerza(0);
            guerrero1.setVida(0);
            f = "Ganador guerrero2: " + guerrero2.getNombre() + " con " + guerrero2.getVida() + " de vida.";
            guerrero = guerreroImg2;
        }
        //Guardo en una variable los valores a mostrar.
        String salida = "\tThe Art Of Fighting" +
                "\n" + guerrero1.toString() +
                "\n" + guerrero2.toString() +
                "\nRESULTADO DEL COMBATE:\n" +f;

        //Los muestro con JOptionPane.
        interfaz.getMostrarResultados(salida, guerrero);

        return salida;
    }

    //PARA ESCRIBIR LOS RESULTADOS DEL COMBATE.
    public void escribirResultados(String salida) {
        LeerEscribir escribirSalida = new LeerEscribir();
        escribirSalida.crearArchivoAppend(rutaSalida,salida);
    }

}