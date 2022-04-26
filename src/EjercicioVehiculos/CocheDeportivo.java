package EjercicioVehiculos;

public class CocheDeportivo extends Vehiculos{
	private int numPuertas;
	private String circuito;
	public CocheDeportivo(String matricula, String marca, String modelo, String cilindrada, int numPuertas, String circuito) {
		super(matricula, marca, modelo, cilindrada, numPuertas, circuito);
		this.numPuertas = numPuertas;
		this.circuito = circuito;
	}
		
}
