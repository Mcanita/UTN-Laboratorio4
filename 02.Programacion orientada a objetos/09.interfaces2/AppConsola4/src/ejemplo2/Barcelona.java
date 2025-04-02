package ejemplo2;

public class Barcelona implements IEquipo{

	
	private String fechaClub;
	
	//constructor
	public Barcelona()
	{
		
	}
	public Barcelona (String fechaClub)
	{
		this.fechaClub = fechaClub;
	}
	
	//set y get
	public String getFechaClub() {
		return fechaClub;
	}
	public void setFechaClub(String fechaClub) {
		this.fechaClub = fechaClub;
	}
	@Override
	public String toString() {
		return " Barcelona FechaClub = " + fechaClub;
	}
	@Override
	public String devuelveInformacion() {
		
		return "Equipo Barcelona...";
	}
	
	
	
	
	
}
