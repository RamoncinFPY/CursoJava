package viernes2204EjDroides;

public class Droide {
    private int potencia = 0;
    private int tiempo = 0;
    private Boolean activado = false;

    public Droide(int potencia, int tiempo, Boolean activado) {
        this.potencia = potencia;
        this.tiempo = tiempo;
        this.activado = activado;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Boolean getActivado() {
        return activado;
    }

    public void setE(Boolean activado) {
        this.activado = activado;
    }

    @Override
    public String toString() {
        return "\nPotencia = " + potencia +
                "\nActivado = " + activado +
                "\nTiempo = " + tiempo +"\n";
    }
}
