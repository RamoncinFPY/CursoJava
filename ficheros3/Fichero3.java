package ficheros3;

public class Fichero3 {
    //Atributos.
    private String ruta = "C:\\Users\\Alumnos\\IdeaProjects\\ejercicio1Java\\src\\ficheros3\\FicheroEntrada3.txt";
    private String rutaS = "C:\\Users\\Alumnos\\IdeaProjects\\ejercicio1Java\\src\\ficheros3\\FicheroSalida3.txt";
    private String frase;

    //Constructor.
    public Fichero3() {    }

    //Getters setters.
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getRutaS() {
        return rutaS;
    }

    public void setRutaS(String rutaS) {
        this.rutaS = rutaS;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    //Método toString.
    @Override
    public String toString() {
        return "Fichero3{" +
                "ruta='" + ruta + '\'' +
                ", frase='" + frase + '\'' +
                '}';
    }
}
