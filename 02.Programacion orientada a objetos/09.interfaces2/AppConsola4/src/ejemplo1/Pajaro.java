package ejemplo1;

public class Pajaro implements ICantar{
	
	private int edad;
	
	
	//constructores
	public Pajaro()
	{
		
	}
	
	public Pajaro(int edad) {
		super();
		this.edad = edad; 
	}

	//interface
	public void cantar() {
		System.out.println("PIPIPI....PIOPIO");
	}
	
	//set y get 
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pajaro EDAD =" + edad;
	}
	
	
	
	

}
