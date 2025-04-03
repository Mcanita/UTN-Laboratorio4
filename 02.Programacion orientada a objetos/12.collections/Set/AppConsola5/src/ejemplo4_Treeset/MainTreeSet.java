package ejemplo4_Treeset;

import java.util.TreeSet;

public class MainTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Persona> listaPersonas = new TreeSet<Persona>();
        Persona p1 = new Persona ("Belen", "Sanchez", 1111);
        Persona p3 = new Persona ("Alberto", "Rodriguez", 2222);
        Persona p4 = new Persona ("Rodrigo", "Fernandez", 3333);
        Persona p2 = new Persona ("Pedro", "Ibañez", 4444);
        Persona p5 = new Persona ("Belen", "Sanchez", 1111);
        
        
        listaPersonas.add(p1);
        listaPersonas.add(p1);
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        listaPersonas.add(p4);
        listaPersonas.add(p5);
        
        
        System.out.println("\n Listado de personas for each ordenado \n");
        
        for(Persona x : listaPersonas)
        {
        	System.out.println(x.toString());
        }
        
        
        
        
	}

}
