package EjercicioVehiculos;

public class Vehiculos {
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected String cilindrada;
	
	public Vehiculos(String matricula, String marca, String modelo, String cilindrada, int numPuertas, String circuito) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Vehiculos [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada="
				+ cilindrada + "]";
	}


}
