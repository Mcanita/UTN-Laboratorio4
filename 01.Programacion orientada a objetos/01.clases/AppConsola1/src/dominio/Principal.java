package dominio;

public class Principal {

	public static void main(String[] args) {
		
		Articulo art = new Articulo();
		art.setId(2);
		art.setNombre("Articulo2");
		
		//System.out.println("ID: "+art.getId()+" - NOMBRE: "+ art.getNombre());
		System.out.println(art.toString());
	}

}
