package ejercico2;

/**
 * TAREA 9
 * @author Alvaro Benitez Carmona
 *
 */
public class Videojuegos {


	private String titulo, horasEstimadas, genero, compañia;
	private boolean entregado=false;
	/**
	 * Constructor por defecto
	 */
	public Videojuegos() {
		this.titulo=null;
		this.horasEstimadas="10 horas";
		this.genero=null;
		this.compañia=null;
	}
	/**
	 * Constructor pasando por parametro el titulo y el creador, lo demas por defecto.
	 * @param titulo
	 * @param creador
	 */
	public Videojuegos(String titulo, String horasEstimadas) {
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
		this.genero=null;
		this.compañia=null;
	}
	/**
	 * Constructor pasando todo por parametro. 
	 * @param titulo
	 * @param creador
	 * @param numTemporadas
	 * @param genero
	 */
	public Videojuegos(String titulo, String horasEstimadas, String compañia, String genero) {
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
		this.genero=genero;
		this.compañia=compañia;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getHorasEstimadas() {
		return horasEstimadas;
	}
	
	public void setHorasEstimadas(String horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getCompañia() {
		return compañia;
	}
	
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
}
	