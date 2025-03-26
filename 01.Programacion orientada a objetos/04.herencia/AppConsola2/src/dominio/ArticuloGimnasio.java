package dominio;

public class ArticuloGimnasio extends Articulo {
	
	private int peso;
	
	//constructor
	public ArticuloGimnasio() 
	{
		super();
	}
	
	public ArticuloGimnasio(String nombre, int peso) 
	{
		super(nombre);
		this.peso = peso;
		
	}

	
	//get Y set
	public int getPeso() 
	{
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return super.toString() + " , Peso = " + peso  ;
	}
	
	//método toString
	

}
