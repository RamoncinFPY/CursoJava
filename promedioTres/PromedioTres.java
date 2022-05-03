package promedioTres;
//Clase principal, constructor, getters, setters, y toString.
public class PromedioTres {
    private double numero1;
    private double numero2;
    private double numero3;
    private double total;
    private double promedio;


    public PromedioTres() {    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero3() {
        return numero3;
    }

    public void setNumero3(double numero3) {
        this.numero3 = numero3;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Promedio Tres números {" +
                " numero1 = " + numero1 +
                ", numero2 = " + numero2 +
                ", numero3 = " + numero3 +
                ", total = " + total +
                ", promedio = " + promedio +
                " }";
    }
}