package ejemplo2;

public class Juventos implements IEquipo{

	private int cantJugadores;

	//constructores
	
	public Juventos()
	{
		
	}
	
	public Juventos(int cantJugadores)
	{
		this.cantJugadores = cantJugadores;
	}
	
	//set y get
	public int getCantJugadores() {
		return cantJugadores;
	}

	public void setCantJugadores(int cantJugadores) {
		this.cantJugadores = cantJugadores;
	}

	@Override
	public String toString() {
		return "Juventos Cantidad de Jugadores = " + cantJugadores;
	}

	@Override
	public String devuelveInformacion() {
		
		return "Equipo juventos...";
	}
	
	
}
