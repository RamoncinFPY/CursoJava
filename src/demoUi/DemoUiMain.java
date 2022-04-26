package demoUi;

public class DemoUiMain extends Interfaz{
    public static void main(String[] args) {
        //Suma laSuma = new Suma(5,5);
        //System.out.println(laSuma.sumarString());
        Interfaz ejemplo1 = new Interfaz();
        Suma sumaEjemplo  = new Suma(ejemplo1.pideNum1(), ejemplo1.pideNum2());
        int totalConsola = sumaEjemplo.getTotal();
        System.out.println(totalConsola);
        int totalInterfaz =  ejemplo1.daTotal();
        System.out.println("totalInterfaz = " + totalInterfaz);
        ejemplo1.daTotal();
    }
}
