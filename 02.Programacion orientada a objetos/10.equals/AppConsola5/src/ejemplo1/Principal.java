package ejemplo1;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		p1.setNombre("Jose");
		p1.setApellido("Diaz");
		p1.setDni("12345678");
		
		Persona p2 = new Persona();
		p2.setNombre("Jose");
		p2.setApellido("Diaz");
		p2.setDni("12345678");
		
		
		if( p1.equals(p2))  //tambien compara la direccion de memoria hay que desarrollarlo
		{
			System.out.println("son la misma persona");
		}
		else {
			System.out.println("no son la misma persona ");
		}
		
		
		
		
		
		
	}
	

}
