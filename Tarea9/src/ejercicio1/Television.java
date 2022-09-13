package ejercicio1;
/**
 * TAREA 9 EJERCICIO 1
 * 
 * @author Alvaro Benitez Carmona
 *
 */
public class Television extends Electrodomestico {
	private int resolucion;
	private boolean TDT;

	/**
	 * Constructor por defecto.
	 */
	public Television() {
		super();
		this.resolucion = 20;
		this.TDT = false;
	}

	/**
	 * Constructor pasando por parmetro el precio y el peso.
	 * 
	 * @param precio
	 * @param peso
	 */
	public Television(float precio, float peso) {
		super(precio, peso);
		this.resolucion = 20;
		this.TDT = false;
	}

	/**
	 * Constructor pasando todos lo atributos por parametros.
	 * 
	 * @param precio
	 * @param color
	 * @param peso
	 * @param consumo
	 * @param resolucion
	 * @param TDT
	 */
	public Television(Float precio, String color, Float peso, char consumo, int resolucion, boolean TDT) {
		super(precio, color, peso, consumo);
		this.resolucion = resolucion;
		this.TDT = TDT;
	}

	/**
	 * Metodo que calcula el precio final.
	 * 
	 * @return Retorna el precio total.
	 */
	public float precioFinal() {
		float precio = super.precioFinal();
		float precioSegunResolucion = 0;
		float precioSegunTDT = 0;
		if (40 > resolucion) {
			precioSegunResolucion = (float) ((precio * 0.30) + precio);
		}
		if (TDT = true) {
			precioSegunTDT = 50;
		}
		return precio + precioSegunResolucion + precioSegunTDT;
	}

	/**
	 * Metodo getResoluicon.
	 * 
	 * @return Devuelve el valor de resolucion.
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * Metodo getTDT.
	 * 
	 * @return Devuelve el valor de TDT.
	 */
	public boolean getTDT() {
		return TDT;
	}
}
