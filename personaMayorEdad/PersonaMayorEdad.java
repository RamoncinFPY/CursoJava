package personaMayorEdad;

public class PersonaMayorEdad {
    private String nombre;
    private int edad;
    //Estos son los constructores, con y sin parámetros.
    public PersonaMayorEdad() {
    }

    //Estos son los setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Esta es la salida de datos.

    @Override
    public String toString() {
        PersonaMayorEdadInterfaz entrada = new PersonaMayorEdadInterfaz();
        nombre = entrada.ingresaNombre();
        edad = entrada.ingresaEdad();
        String resultado = (edad > 18) ? "Es mayor de edad." : "You are a baby!";
        String imprimirDatos = "La persona:" +
                                "\nNombre= " + nombre +
                                "\nEdad= " + edad +
                                "\nEvaluación= " + resultado ;
        entrada.mostrarSalida(imprimirDatos);
        return imprimirDatos;
    }
}
