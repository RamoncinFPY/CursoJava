package demoUi;

public class Suma {
    private int num1;
    private int num2;
    private int total;

    public Suma() {
    }

    public Suma(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getTotal() {
        total = num1 + num2;
        return total;
    }

    public String sumarString(){
        return "La suma de " +num1+
                " + " + num2 + " = " + (num1+num2);
    }
}
