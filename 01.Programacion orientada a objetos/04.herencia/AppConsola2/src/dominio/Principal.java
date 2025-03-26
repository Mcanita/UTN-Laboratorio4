package dominio;

public class Principal {

	public static void main(String[] args) {
		
		ArticuloGimnasio artG = new ArticuloGimnasio();
		
		artG.setNombre(" Articulo GYM 1 ");
		artG.setPeso(10);
		System.out.println(artG.toString());
		
		ArticuloGimnasio artG2 = new ArticuloGimnasio (" Articulo GYM 2 ", 20);
		System.out.println(artG2.toString());
		
	}

}
