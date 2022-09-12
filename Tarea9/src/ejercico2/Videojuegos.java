package ejercico2;

/**
 * TAREA 9
 * @author Alvaro Benitez Carmona
 *
 */
public class Videojuegos implements Entregable{


	private String titulo, genero, compa�ia;
	private boolean entregado=false;
	private int horasEstimadas;
	/**
	 * Constructor por defecto
	 */
	public Videojuegos() {
		this.titulo=null;
		this.horasEstimadas=10;
		this.genero=null;
		this.compa�ia=null;
	}
	/**
	 * Constructor pasando por parametro el titulo y el creador, lo demas por defecto.
	 * @param titulo
	 * @param creador
	 */
	public Videojuegos(String titulo, int horasEstimadas) {
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
		this.genero=null;
		this.compa�ia=null;
	}
	/**
	 * Constructor pasando todo por parametro. 
	 * @param titulo
	 * @param creador
	 * @param numTemporadas
	 * @param genero
	 */
	public Videojuegos(String titulo, int horasEstimadas, String compa�ia, String genero) {
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
		this.genero=genero;
		this.compa�ia=compa�ia;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getCompa�ia() {
		return compa�ia;
	}
	
	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
	public String ToString() {
		return "Classe videojuegos=>  Titulo: "+titulo+" Compa�ia: "+compa�ia+ " Horas estimadas: "+ horasEstimadas+" Genero: "+genero+ " Entregado :"+entregado+".\n";
	}
	
	@Override
	public void entregar() {
		entregado=true;
		
	}
	@Override
	public void devolver() {
		entregado=false;
		
	}
	@Override
	public boolean isEntregado() {
		return entregado;
	}
	
	@Override
	public String compareTo(Object a) {
		Videojuegos p=new Videojuegos();
		p=(Videojuegos)a;
		if((p.getHorasEstimadas()<horasEstimadas)) {
			return "El videojuego "+ horasEstimadas+ " tiene mas horas.";
		}
		return "El videojuego  "+ p.getTitulo()+ " tiene mas horas.";
		
	}
}
	