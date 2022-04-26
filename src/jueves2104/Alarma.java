/*Crea un programa en java, Este gestionará los estados de alerta, estos estados tienen
un valor numérico. El valor cuando la amenaza aumenta se incrementa en uno, cuando la
amenaza se reduce en 1. Crea una clase, con los dos métodos, uno que aumente la
amenaza y otro que la reduzca, Identifica la identidad, el comportamiento y el estado.
Una vez creado, crea una clase que aumente 2 veces el nivel de alerta y que luego lo reduzca,
mostrando en cada caso el valor de la alarma.*/

package jueves2104;

public class Alarma {
    private int nivel;

    public Alarma(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void aumentarPeligro(){
        this.nivel += 1;
    }

    public void disminuyePeligro(){
        this.nivel -= 1;
    }

    public void aumentar2Peligro(){
        this.nivel += 2;
    }

    public void disminuye2Peligro(){
        this.nivel -= 2;
    }

    public String mostrar() {
        return  "\nAlarma:" +
                "\nnivel = " + nivel +
                "\nestado = ALARMA AUMENTADA!";
    }

    public String mostrar1() {
        return "\nAlarma:" +
                "\nnivel = " + nivel +
                "\nestado = ALARMA disminuye!";
    }
}
