package ejemplo1_errores;

public class Principal {

	public static void main(String[] args) {
		
		// Errores en tiempo de compilación (Errores de sintaxis)
		
		String nombre;
		nombre = "Alejandro";
		// nombre = 888 ERROR 
		
		
		//Errores en tiempo de ejecución
		
		int num1 = 9;
		int num2 = 0;
		
		int resultado = num1 / num2; // ERROR, no se puede dividir por 0
		
		//EXCEPCIONES SON ERRORES EN TIEMPO DE EJECUCIÓN

	}

}
