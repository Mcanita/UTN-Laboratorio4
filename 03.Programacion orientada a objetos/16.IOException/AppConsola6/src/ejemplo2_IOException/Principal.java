package ejemplo2_IOException;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;



public class Principal {

	public static void main(String[] args) {
	
		//IOException siempre van a estar dentro de un bloque try y catch
		
		
		
		try {
			Image imagen = ImageIO.read( new File("src/imagen-gif"));
			
		} catch (IOException e) {
			e.printStackTrace(); // ME DA INFORMACIÓN SOBRE LA EXCEPCIÓN
			System.out.println("No se pudo acceder a la imagen");
			
		}finally {
			//SIEMPRE SE VA A EJECUTAR
		}
		
		
		
		
		
		
		

	}

}
