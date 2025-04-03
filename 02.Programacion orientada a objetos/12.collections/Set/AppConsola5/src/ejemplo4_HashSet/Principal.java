package ejemplo4_HashSet;

import java.util.HashSet;

public class Principal {

	public static void main(String[] args) {
		
		
		Libro p1 = new Libro("Autor1", "Libro1", 1111);
		Libro p2 = new Libro("Autor2", "Libro2", 2222);
		Libro p3 = new Libro("Autor3", "Libro3", 3333);
		Libro p4 = new Libro("Autor4", "Libro4", 4444);
		Libro p5 = new Libro("Autor1", "Libro1", 1111);
		
		
		HashSet<Libro> listalibros = new HashSet<Libro>();
		//NO TIENE ORDEN, NO ADMITE REPETIDOS
		listalibros.add(p1);
		listalibros.add(p1);
		listalibros.add(p1);
		listalibros.add(p1);
		listalibros.add(p1); //SOLO AGREGA EL PRIMERO
		
		listalibros.add(p2);
		listalibros.add(p3);
		listalibros.add(p4);
		listalibros.add(p5);// NO LO AGREGA PORQUE CONTIENE LO MISMO QUE P1
		
		
		System.out.println("\n Lista de libros \n");
		System.out.println(listalibros );
		
		
		
		

	}

}
