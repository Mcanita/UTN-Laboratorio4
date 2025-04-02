package ejemplo2;

public class Principal {

	public static void main(String[] args) {
	
		Barcelona b = new Barcelona();
		b.setFechaClub("01/01/89");
		
		Juventos j = new Juventos();
		j.setCantJugadores(15);
		
		IEquipo x = b; // la interface permite guardar un objeto de ambas clases
		IEquipo y = j;
		
		Messi messi = new Messi();
		messi.setEquipo(b);
		messi.setNacionalidad("Argentina");
		
		System.out.println(messi.toString());
	}

}
