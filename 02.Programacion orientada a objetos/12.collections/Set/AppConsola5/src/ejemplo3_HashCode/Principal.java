package ejemplo3_HashCode;

public class Principal {

	public static void main(String[] args) {
		String nombre1 = "Pepe";
		String nombre2 = "Pepe";
		
		System.out.println(nombre1.hashCode());
		System.out.println(nombre2.hashCode());
		
		Persona x = new Persona();
		x.setNombre("Maria");
		System.out.println(x.hashCode());
		
		Persona y = new Persona();
		y.setNombre("Maria");
		System.out.println(y.hashCode());
		
		
		
	}

}
