package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Jose", 33);
		Empleado empleado2 = new Empleado("Marta", 25);
		Empleado empleado3 = new Empleado();
		Empleado empleado4 = new Empleado("Juan", 59);
		Empleado empleado5 = new Empleado("Sofia", 16);

		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		System.out.println(empleado3.toString());
		System.out.println(empleado4.toString());
		System.out.println(empleado5.toString());
	}

}
