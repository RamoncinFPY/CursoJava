package jueves2104;

public class VipMain {

    public static void main(String[] args) {
        int numeroClientes = 0;
        Vip cliente1 = new Vip("Ramón","VIP",'B');
        Vip cliente2 = new Vip("Francisco","NORMAL",'A');

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}
