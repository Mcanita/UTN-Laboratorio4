package dominio;

public class Principal {

	public static void main(String[] args) {
		
		//Animal animal = new Animal("Animal");
		Gato gato = new Gato("Pepita");
		Perro perro = new Perro("Huesos", "Galgo");
		
		//System.out.println(animal.toString());
		System.out.println(gato.toString() + gato.habiidades());
		System.out.println(perro.toString() + perro.habiidades());
		
		
		
		
	}

}
