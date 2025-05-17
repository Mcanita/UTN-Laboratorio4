package dominio;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UsuarioDao {
	
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "dbregistro";
	
	public UsuarioDao ()
	{}
	
	public int agregarUsuario(Usuario usuario)
	{
		String query = "Insert into usuario(nombre, apellido) values ('"+usuario.getNombre()+" ', '"+usuario.getApellido()+"') ";
		Connection cn = null;
		int filas = 0;
		
		try 
		{
			cn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(query);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
	    }
		return filas;
	}
	

}
