package ejercicio3;

/**
 * TAREA 9 EJERCICIO 3
 * 
 * @author Alvaro Benitez Carmona
 *
 */
public class Libro {

	private String ISBN, titulo, autor;
	private int numPaginas;

	/**
	 * Constructor pasando por parametro ISBN, titulo, autor, numPaginas.
	 * 
	 * @param ISBN
	 * @param titulo
	 * @param autor
	 * @param numPaginas
	 */
	public Libro(String ISBN, String titulo, String autor, int numPaginas) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	/**
	 * Metodo que nos devuelve el libro con mas paginas.
	 * 
	 * @param p
	 * @return Devuelve el libro con mas paginas.
	 */
	public String masPaginas(Libro p) {
		if (p.getNumPaginas() > numPaginas) {
			return p.getTitulo();
		}
		return titulo;
	}

	/**
	 * Metodo getISBN.
	 * 
	 * @return Devuelve el valor de ISBN.
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Metodo que modifica el valor de ISBN.
	 * 
	 * @param iSBN.
	 */
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	/**
	 * Metodo getTitulo.
	 * 
	 * @return Devuelve el valor de titulo.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Metodo que modifica el valor de titulo.
	 * 
	 * @param titulo.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Metodo getAutor.
	 * 
	 * @return Devuelve el valor de autor.
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Metodo que modifica el valor de autor.
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Metodo getNumPaginas.
	 * 
	 * @return Devuelve el valor de numPaginas.
	 */
	public int getNumPaginas() {
		return numPaginas;
	}

	/**
	 * Metodo que modifica el valor de numPaginas
	 * 
	 * @param numPaginas
	 */
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	/**
	 * Metodo toString.
	 * 
	 * @return Devuelve un string con todos los datos de libro.
	 */
	public String toString() {
		return "El libro " + titulo + " con " + ISBN + " creado por el autor " + autor + " tiene " + numPaginas
				+ " paginas";
	}

}
