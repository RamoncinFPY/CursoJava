package ejVehiculos;

public class Vehiculos{
	//Atributos
	private String marca;
	private String modelo;
	private float precio;
	
	//Constructor
	public Vehiculos(String marca, String modelo, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	//get and set del precio
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	//Método para mostrar los datos
	public String mostrarDatos() {
		return "Marca:\t "+marca+"\nModelo:\t "+
				modelo+ "\nPrecio:\t "+precio;
	}	
}