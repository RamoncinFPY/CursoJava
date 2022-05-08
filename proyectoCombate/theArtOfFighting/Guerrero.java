package proyectoCombate.theArtOfFighting;

public class Guerrero {
    //Atributos.
    private String nombre;
    private String tipo;
    private int fuerza;
    private int vida;

    //Los constructores sin y con parámetros.
    public Guerrero() {    }

    public Guerrero(String nombre, String tipo, int fuerza, int vida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fuerza = fuerza;
        this.vida = vida;
    }

    //Creo un objeto Interfaz para poder setter los guerreros con los datos introducidos por el usuario.
    Interfaz entrada = new Interfaz();

    //Getters y setters  del guerrero.
    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = entrada.ingresaNombre();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo() {

        this.tipo = entrada.ingresaTipo();
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza() {
        this.fuerza = entrada.ingresaFuerza();
    }

    public int getVida() {
        return vida;
    }

    public void setVida() {
        this.vida = entrada.ingresVida();
    }

    //Para mostrar los atributos de los guerreros.
    @Override
    public String toString() {
        return "Guerrero{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fuerza=" + fuerza +
                ", vida=" + vida +
                '}';
    }
}
