package jueves2104;

public class AlarmaMain {

    public static void main(String[] args) {
        Alarma alerta1 = new Alarma(0);

        alerta1.aumentarPeligro();
        System.out.println(alerta1.mostrar());;

        alerta1.disminuyePeligro();
        System.out.println(alerta1.mostrar1());;

        alerta1.aumentar2Peligro();
        System.out.println(alerta1.mostrar());;

        alerta1.disminuye2Peligro();
        System.out.println(alerta1.mostrar1());;
    }
}
