package jueves2104;

public class Operaciones {
    private int num1 = 0;
    private int num2 = 0;

    public Operaciones(){
        this.num1 = num1;
        this.num2 = num2;
    }
    public Operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //Sin parametros
    public int suma(){ return num1 + num2; }
    public int resta(){ return num1 - num2; }
    public int mult(){ return num1 * num2; }
    public float div(){ return num1 / num2; }

    //Con Parametros
    public int suma(int num1, int num2){ return num1 + num2; }
    public int resta(int num1, int num2){ return num1 - num2; }
    public int mult(int num1, int num2){ return num1 * num2; }
    public float div(int num1, int num2){ return num1 / num2; }

    @Override
    public String toString() {
        return "\nOperaciones:" +
                "\nLa suma es: " +suma()+
                "\nLa resta es: " +resta()+
                "\nLa multiplicacion es: "+mult()+
                "\nLa division es: "+div();
    }
}
