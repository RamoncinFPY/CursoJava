package NumeroMayor;

public class NumeroMayor {
    private int numero1;
    private int numero2;

    public NumeroMayor() {
    }

    public NumeroMayor(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public String comparar(int a, int b){
        String salida = (a > b) ? "El primer número " + a + " es mayor." : "El segundo número " + b + " es mayor.";
        return salida;
    }
}
