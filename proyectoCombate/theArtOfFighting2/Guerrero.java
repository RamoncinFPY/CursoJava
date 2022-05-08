package proyectoCombate.theArtOfFighting2;

public class Guerrero {
    //Atributos.
    private int id;
    private String nombre;
    private String tipo;
    private int fuerza;
    private int vida;
    public static int ultimoId;

    //Los constructores sin y con parámetros.
    public Guerrero() {
    }

    public Guerrero(String nombre, String tipo, int fuerza, int vida) {
        this.id = ++ultimoId;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fuerza = fuerza;
        this.vida = vida;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Guerrero.ultimoId = ultimoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVida() {
        return vida;
    }

    public int setVida(int vida) {
        this.vida = vida;
        return vida;
    }

    //Para mostrar los atributos de los guerreros.
    @Override
    public String toString() {
        return "Guerrero{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fuerza=" + fuerza +
                ", vida=" + vida +
                '}';
    }
}