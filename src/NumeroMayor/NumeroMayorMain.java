package NumeroMayor;

public class NumeroMayorMain {
    public static void main(String[] args) {
        //Creo un objeto de la interfaz
        NumeroMayorInterfaz mayorMenor = new NumeroMayorInterfaz();

        NumeroMayor comparacion = new NumeroMayor();

        String salidaInterfaz = comparacion.comparar(mayorMenor.pideNumero1(),mayorMenor.pideNumero2());

        mayorMenor.salida1(salidaInterfaz);




    }
}
