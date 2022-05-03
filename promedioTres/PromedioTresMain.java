package promedioTres;

public class PromedioTresMain {
    public static void main(String[] args) {
        PromedioTresCalculos p1 = new PromedioTresCalculos();
        p1.totalTres();
        p1.promedioTres();
        System.out.println(p1.salida());
    }
}