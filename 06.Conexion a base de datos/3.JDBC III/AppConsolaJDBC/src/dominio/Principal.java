package dominio;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		UsuarioDao usuarioDao = new UsuarioDao();
		/*
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("Josefina");
		usuario1.setApellido("Josifino");
		
		int filas = usuarioDao.agregarUsuario(usuario1);
		
		if(filas ==1)
			System.out.println("Usuario agregado");
		else
			System.out.println("Usuario no agregado");
			*/
		/*Usuario usuario2 = usuarioDao.obtenerUsuario(1);
		System.out.println(usuario2.toString());
		
		ArrayList<Usuario> lUsuario = usuarioDao.obtenerTodosLosUsuarios();
		for (Usuario user: lUsuario)
		{
			System.out.println(user.toString());
		}
			*/
		Usuario usuario2 = usuarioDao.obtenerUsuario2(1);
		System.out.println(usuario2.toString());

	}

}
