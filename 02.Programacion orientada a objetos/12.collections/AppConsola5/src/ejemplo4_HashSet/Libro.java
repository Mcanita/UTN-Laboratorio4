package ejemplo4_HashSet;

import java.util.Objects;

public class Libro {
	
	private String autor;
	private String titulo;
	private int ISBN;
	
	//constructor
	public Libro() {}
	
	public Libro(String autor, String titulo, int ISBN)
	{
		this.autor = autor;
		this.titulo = titulo;
		this.ISBN = ISBN;
		
	}

	
	//set y get 
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	
	
	

	@Override
	public String toString() {
		return "Libro Autor = " + autor + ", Titulo = " + titulo + ", ISBN = " + ISBN ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ISBN, autor, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return ISBN == other.ISBN && Objects.equals(autor, other.autor) && Objects.equals(titulo, other.titulo);
	}
	

	
	

}
