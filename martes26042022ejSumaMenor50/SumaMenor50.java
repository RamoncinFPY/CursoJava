package martes26042022ejSumaMenor50;

public class SumaMenor50 {
    private int numero1;
    private int numero2;
    private int total;

    public SumaMenor50() { }

    public SumaMenor50(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getTotal() {
        SumaMenor50Interfaz interfaz = new SumaMenor50Interfaz();
        numero1 = interfaz.ingresaNumero1();
        numero2 = interfaz.ingresaNumero2();
        total = numero1 + numero2;
        return total;
    }
}
