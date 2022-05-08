package proyectoCombate.theArtOfFighting2;

public class Coliseo {
    public static void main(String[] args) {

        Arena arena = new Arena();

        arena.escribirArchivo();
        while (arena.guerrero1.getVida() > 0 && arena.guerrero2.getVida() > 0) {

            int peleador = arena.modoPeleadores();
            arena.modoPelea(peleador);
        }
        String salida = arena.combate();
        arena.escribirResultados(salida);
        System.out.println(salida);
    }
}
