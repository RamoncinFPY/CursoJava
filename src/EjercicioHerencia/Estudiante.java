package EjercicioHerencia;

public class Estudiante extends Persona{
	private String codigoEstudiante;
	private float notaAcceso;
	private String carrera;
	
	public Estudiante(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String codigoEstudiante, float notaAcceso, String carrera) {
		super(dni,nombre,apellidoPaterno,apellidoMaterno,edad);
		this.codigoEstudiante = codigoEstudiante;
		this.notaAcceso = notaAcceso;
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Estudiante [dni= " +getDni()+ ", Nombre= "+getNombre()+ ", 1er Apellido= "+getApellidoPaterno()+ ", 2do Apellido= "
				+getApellidoMaterno()+ ", Edad= "+getEdad()+ ", codigoEstudiante= " + codigoEstudiante + ", notaAcceso= " 
				+ notaAcceso + ", carrera= "+ carrera + "]";
	}
	
	
}
