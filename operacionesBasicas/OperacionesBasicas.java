package operacionesBasicas ;

public class OperacionesBasicas {
    private int numero1;
    private int numero2;
    private String opcion;
    private double total;

    public OperacionesBasicas() {
    }

    public OperacionesBasicas(int numero1, int numero2) {
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

    public double calculo(){
        OperacionesBasicasInterfaz calcular = new OperacionesBasicasInterfaz();
        numero1 = calcular.ingresaNum1();
        numero2 =calcular.ingresaNum2();
        opcion = calcular.ingresaOperacion().toUpperCase();
        switch (opcion){
            case "+": total = numero1 + numero2;
                break;
            case "-": total = numero1 - numero2;
                break;
            case "*": total = numero1 * numero2;
                break;
            case "/": total = numero1 / numero2;
                break;
        }
        return total;
    }
    @Override
    public String toString() {
        OperacionesBasicasInterfaz calcular = new OperacionesBasicasInterfaz();
        calculo();
        String imprimir = "OperacionesBasicas:" +
                          "\n " + numero1 + "  " +opcion+ " " + numero2 +
                          "\nResultado = " + total;
        String salida = calcular.mostrarSalida(imprimir);
        return salida;
    }
}
