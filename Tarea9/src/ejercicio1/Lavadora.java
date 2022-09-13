package ejercicio1;
/**
 * TAREA 9 EJERCICIO 1
 * 
 * @author Alvaro Benitez Carmona
 *
 */
public class Lavadora extends Electrodomestico {

	private int carga;
	final static int cargaPorDefecto = 5;

	/**
	 * Constructor por defecto.
	 */
	public Lavadora() {
		super();
		this.carga = cargaPorDefecto;
	}

	/**
	 * Constructor pasando por parmetro el precio y el peso.
	 * 
	 * @param precio
	 * @param peso
	 */
	public Lavadora(float precio, float peso) {
		super(precio, peso);
		this.carga = cargaPorDefecto;
	}

	/**
	 * Constructor pasando todos lo atributos por parametros.
	 * 
	 * @param precio
	 * @param color
	 * @param peso
	 * @param consumo
	 * @param carga
	 */
	public Lavadora(Float precio, String color, Float peso, char consumo, int carga) {
		super(precio, color, peso, consumo);
		this.carga = carga;
	}

	/**
	 * Metodo que calcula el precio final.
	 * 
	 * @return Retorna el precio total.
	 */
	public float precioFinal() {
		float precio = super.precioFinal();
		if (30 > carga) {
			return precio + 50;
		}
		return precio;
	}

	/**
	 * Metodo getCarga
	 * 
	 * @return Devuelve el valor de carga.
	 */
	public int getCarga() {
		return carga;
	}
}
