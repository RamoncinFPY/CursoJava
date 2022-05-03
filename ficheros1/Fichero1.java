package ficheros1;

public class Fichero1 {
    //Atributos.
    private String ruta = "C:\\Users\\Alumnos\\IdeaProjects\\ejercicio1Java\\src\\ficheros1\\Fichero2.txt";
    private String frase;

    public Fichero1() {    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public String toString() {
        return "Fichero1{" +
                "ruta='" + ruta + '\'' +
                ", frase='" + frase + '\'' +
                '}';
    }
}
