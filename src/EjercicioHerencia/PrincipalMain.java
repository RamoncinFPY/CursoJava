package EjercicioHerencia;

public class PrincipalMain {
	public static void main(String [] args) {
		Estudiante estudiante1 = new Estudiante("48744744D","Ram�n","Portalanza","Yerovi",48,"00001",9.70f,"Inform�tica");
		Persona persona1 = new Persona("26000000F","Francisco","Port","Yer",49);
		
		System.out.println(estudiante1.toString());
		System.out.println(persona1.toString());

	}

}
