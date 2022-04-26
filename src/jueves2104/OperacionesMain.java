package jueves2104;

public class OperacionesMain {
    public static void main(String[] args) {
        Operaciones ejercicio1 = new Operaciones(15, 6);
        Operaciones ejercicio2 = new Operaciones();

        //Bloque de métodos con parámetros desde el constructor.
        System.out.println("Parámetros desde la clase");
        System.out.println(ejercicio1.toString());

        //Bloque de métodos con parámetros.
        System.out.println(" ");
        System.out.println("Parámetros por el método");
        System.out.println("Solo la suma: "+ejercicio2.suma(7,8));
        System.out.println("Solo la resta: "+ejercicio2.resta(12,4));
        System.out.println("Solo la multiplicacion: "+ejercicio2.mult(56,3));
        System.out.println("Solo la division: "+ejercicio2.div(874,32));

    }
}
