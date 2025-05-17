package dominio;

public class Principal {

	public static void main(String[] args) {
		
		UsuarioDao usuarioDao = new UsuarioDao();
		
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("Josefina");
		usuario1.setApellido("Josifino");
		
		int filas = usuarioDao.agregarUsuario(usuario1);
		
		if(filas ==1)
			System.out.println("Usuario agregado");
		else
			System.out.println("Usuario no agregado");

	}

}
