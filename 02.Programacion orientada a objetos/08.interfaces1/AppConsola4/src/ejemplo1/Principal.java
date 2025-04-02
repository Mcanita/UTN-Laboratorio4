package ejemplo1;

public class Principal {

	
	public static void main(String[] args) {
		
		Cantante c = new Cantante("Luis", "gonzales", true);
		c.cantar();
		
		Pajaro p = new Pajaro(1);
		p.cantar();
		
		
		ICantar x= c;
		ICantar y = new Cantante();
		ICantar z = p;
		
		
	}
}
