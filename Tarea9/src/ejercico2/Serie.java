package ejercico2;

/**
 * TAREA 9
 * 
 * @author Alvaro Benitez Carmona
 *
 */
public class Serie implements Entregable {

	private String titulo, genero, creador;
	private int numTemporadas;
	private boolean entregado = false;

	/**
	 * Constructor por defecto
	 */
	public Serie() {
		this.titulo = null;
		this.numTemporadas = 3;
		this.genero = null;
		this.creador = null;
	}

	/**
	 * Constructor pasando por parametro el titulo y el creador, lo demas por
	 * defecto.
	 * 
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = 3;
		this.genero = null;
		this.creador = creador;
	}

	/**
	 * Constructor pasando todo por parametro.
	 * 
	 * @param titulo
	 * @param creador
	 * @param numTemporadas
	 * @param genero
	 */
	public Serie(String titulo, String creador, int numTemporadas, String genero) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	/**
	 * Metodo getTitulo
	 * @return Devuelve el valor de titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Metodo que modifca el valor de titulo
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Metodo getGenero
	 * @return Devuelve el valor de geneto
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * Metodo que modifica el valor de genero 
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * Metodo getCreadro
	 * @return Metodo que devuelve el valor de creador
	 */
	public String getCreador() {
		return creador;
	}
	/**
	 * Metodo que modifica el valor de creador
	 * @param creador
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}
	/**
	 * Metodoq getNumTemporadas
	 * @return Devuelve el valor de numTemporadas.
	 */
	public int getNumTemporadas() {
		return numTemporadas;
	}
	/**
	 * Metodo que modifica el valor de numTemporadas.
	 * @param numTemporadas
	 */
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}
	/**
	 * Metodo toString()
	 * @return Devuelve un String con todos los valores de los atributos de la clase
	 */
	public String ToString() {
		return "Classe Serie=>  Titulo: " + titulo + " Creador: " + creador + " Numero de temporadas: " + numTemporadas
				+ " Genero: " + genero + " Entregado :" + entregado + ".\n";
	}
	/**
	 * Metodo que modifica el valor a true de entregado
	 */
	@Override
	public void entregar() {
		entregado = true;

	}
	/**
	 * Metodo que modifca el valor a false de entregado
	 */
	@Override
	public void devolver() {
		entregado = false;

	}
	/**
	 * Metodo que devuelve el valor de entregado
	 */
	@Override
	public boolean isEntregado() {
		return entregado;
	}

	/**
	 * Metodo que comapara los valores de numTemporadas entre dos objetos. Devuelve el valor de mas alto.
	 *@param Object
	 *@return Devuelve el titulo de la serie com mas temporadas.
	 */
	public String compareTo(Object a) {
		Serie p = new Serie();
		p = (Serie) a;
		if ((p.getNumTemporadas() < numTemporadas)) {
			return titulo;
		}
		return p.getTitulo();

	}

}
