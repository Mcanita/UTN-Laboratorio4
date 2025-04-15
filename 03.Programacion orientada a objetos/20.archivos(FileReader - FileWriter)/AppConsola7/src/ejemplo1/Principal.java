package ejemplo1;

public class Principal {

	public static void main(String[] args) {
	
		
		Archivo archivo = new Archivo();
		archivo.setRuta("prueba.txt");
		
		if(archivo.existe())
		{
			System.out.println("Exciste el archivo");
		}
		else
		{
			System.out.println("No exciste el archivo, entonces lo creo");
			archivo.crearArchivo();
		}
		
		//ESCRITURA
		archivo.escribe_letra_x_letra(" Bienveninos a Lab IV ");
		
		//LECTURA
		
		System.out.println("\n A CONTINUACIÓN LEE LA INFORMACIÓN DEL ARCHIVO LETRA POR LETRA: ");
		archivo.lee_letra_x_letra();
		
		
		

	}

}
