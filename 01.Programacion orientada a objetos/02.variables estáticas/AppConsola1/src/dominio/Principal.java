package dominio;

public class Principal {

	public static void main(String[] args) {
		
		Articulo art1 = new Articulo();
		//art1.setId(1);
		art1.setNombre("Articulo 1 ");
		System.out.println(art1.toString());
		
		Articulo art2 = new Articulo();
		//art2.setId(2);
		art2.setNombre("Articulo 2 ");
		System.out.println(art2.toString());
		
		Articulo art3 = new Articulo();
		//art3.setId(3);
		art3.setNombre("Articulo 3 ");
		System.out.println(art3.toString());
		
	}

}
