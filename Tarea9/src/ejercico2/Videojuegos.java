package ejercico2;

/**
 * TAREA 9
 * 
 * @author Alvaro Benitez Carmona
 *
 */
public class Videojuegos implements Entregable {

	private String titulo, genero, compa�ia;
	private boolean entregado = false;
	private int horasEstimadas;

	/**
	 * Constructor por defecto
	 */
	public Videojuegos() {
		this.titulo = null;
		this.horasEstimadas = 10;
		this.genero = null;
		this.compa�ia = null;
	}

	/**
	 * Constructor pasando por parametro el titulo y el creador, lo demas por
	 * defecto.
	 * 
	 * @param titulo
	 * @param creador
	 */
	public Videojuegos(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = null;
		this.compa�ia = null;
	}

	/**
	 * Constructor pasando todo por parametro.
	 * 
	 * @param titulo
	 * @param creador
	 * @param numTemporadas
	 * @param genero
	 */
	public Videojuegos(String titulo, int horasEstimadas, String compa�ia, String genero) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;
	}
	/**
	 * Metodo getTitulo
	 * @return Devuelve el valor de titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Metodo que modifica el valor de titulo
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Metodo getHorasEstimadas
	 * @return Devuelve el valor de horasEstimadas
	 */
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	/**
	 * Metodo que modifica el valor de horasEstimadas
	 * @param horasEstimadas
	 */
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	/**
	 * Metodo getGenero
	 * @return Devuelve el valor de genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * Metodo que modifca el valor de genero 
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * Metodo getCompa�ia
	 * @return Devuelve el valor de compa�ia
	 */
	public String getCompa�ia() {
		return compa�ia;
	}
	/**
	 * Metodo que modifica el valor de compa�ia
	 * @param compa�ia
	 */
	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
	/**
	 * Metodo toString
	 * @return Devuelve un String con todos los valores de los atributos de la clase 
	 */
	public String ToString() {
		return "Classe videojuegos=>  Titulo: " + titulo + " Compa�ia: " + compa�ia + " Horas estimadas: "
				+ horasEstimadas + " Genero: " + genero + " Entregado :" + entregado + ".\n";
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
	 * Metodo que comapara los valores de horasEstimadas entre dos objetos. Devuelve el valor de mas alto.
	 *@param Object
	 *@return Devuelve el titulo con las hora mas alta.
	 */
	@Override
	public String compareTo(Object a) {
		Videojuegos p = new Videojuegos();
		p = (Videojuegos) a;
		if ((p.getHorasEstimadas() < horasEstimadas)) {
			return titulo;
		}
		return p.getTitulo();

	}
}
