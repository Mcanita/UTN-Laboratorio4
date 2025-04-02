package ejemplo2;

public class Messi {

	private String nacionalidad;
	//private Barcelona barcelona;
	private IEquipo equipo; //refactor -> rename
	
	//constructores
	
	public Messi()
	{
		
	}
	
	public Messi(String nacionalidad, IEquipo equipo)
	{
		super();
		this.nacionalidad = nacionalidad;
		this.equipo = equipo;
		
	}
	
	//set get

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public IEquipo getEquipo() {
		return equipo;
	}

	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Messi Nacionalidad = " + nacionalidad +  equipo.toString();
	}
	
	
	
	
	
}
