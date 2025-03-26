package dominio;

public class Gato extends Animal{

	//constructor
	public Gato()
	{
		super();
	}
	
	public Gato(String nombre)
	{
		super(nombre);
	}

	@Override
	public String toString() {
		return "Es un gato, se llama: " + getNombre();
				
	}

	@Override
	public String habiidades() {
		
		return "los gatos tienen gran flexibilidad ";
	}
	
	
}
