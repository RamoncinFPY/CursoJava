package ficheros2;

public class Fichero2 {
    //Atributos.
    private String ruta = "C:\\Users\\Alumnos\\IdeaProjects\\ejercicio1Java\\src\\ficheros2\\Fichero2.txt";
    String rutaSalida = "C:\\Users\\Alumnos\\IdeaProjects\\ejercicio1Java\\src\\ficheros2\\fichero2Salida";
    private double numeroIngresado;
    private double numeroFichero;
    private double suma;

    public Fichero2() {    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getNumeroIngresado() {
        return numeroIngresado;
    }

    public void setNumeroIngresado(double numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
    }

    public double getNumeroFichero() {
        return numeroFichero;
    }

    public void setNumeroFichero(double numeroFichero) {
        this.numeroFichero = numeroFichero;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getRutaSalida() {
        return rutaSalida;
    }

    public void setRutaSalida(String rutaSalida) {
        this.rutaSalida = rutaSalida;
    }

    @Override
    public String toString() {
        return "Fichero2{" +
                "ruta='" + ruta + '\'' +
                ", numeroIngresado=" + numeroIngresado +
                ", numeroFichero=" + numeroFichero +
                ", suma=" + suma +
                '}';
    }
}
