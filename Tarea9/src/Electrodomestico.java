/**
 * TAREA 8
 * 
 * @author Alvaro Benitez Carmona
 *
 */
public class Electrodomestico {
	protected float precioBase, peso;
	protected String color;
	protected char consumoEnergetico;
	static final String blanco = "Blanco";
	static final String negro = "Negro";
	static final String rojo = "Rojo";
	static final String azul = "Azuñ";
	static final String gris = "Gris";
	static final char consumoF = 'F';
	static final char consumoE = 'E';
	static final char consumoD = 'D';
	static final char consumoC = 'C';
	static final char consumoB = 'B';
	static final char consumoA = 'A';
	static final float precio = 100;
	static final float pesoIni = 5;

	/**
	 * Constructor por defecto.
	 */
	public Electrodomestico() {
		this.precioBase = precio;
		this.color = blanco;
		this.peso = pesoIni;
		this.consumoEnergetico = consumoF;
	}

	/**
	 * Constructor que se pasa por parametro el precio y el peso.
	 * 
	 * @param precio
	 * @param peso
	 */
	public Electrodomestico(Float precio, Float peso) {
		this.precioBase = precio;
		this.color = blanco;
		this.peso = peso;
		this.consumoEnergetico = consumoF;
	}

	/**
	 * Constructor con todo por parametro.
	 * 
	 * @param precio
	 * @param color
	 * @param peso
	 * @param consumo
	 */
	public Electrodomestico(Float precio, String color, Float peso, char consumo) {
		this.precioBase = precio;
		comprobarColor(color);
		this.peso = peso;
		comprobarConsumoEnergetico(consumo);
	}

	/**
	 * Metodo para comprabar si la letra del cosnumo es correcta.
	 * 
	 * @param consumo
	 */
	private void comprobarConsumoEnergetico(char consumo) {
		if (consumo == consumoA || consumo == consumoB || consumo == consumoC || consumo == consumoD
				|| consumo == consumoE || consumo == consumoF) {
			this.consumoEnergetico = consumo;
		} else {
			this.consumoEnergetico = consumoF;
		}
	}

	/**
	 * Metodo para comprabar si la letra del cosnumo es correcta.
	 * 
	 * @param consumo
	 */
	private void comprobarColor(String color) {
		if (color == blanco || color == negro || color == azul || color == gris || color == rojo) {
			this.color = color;
		} else {
			this.color = blanco;
		}
	}

	public float precioFinal() {
		int precioSegunConsumo = 0;
		int precioSegunTamaño = 0;
		switch (consumoEnergetico) {
		case consumoF:
			precioSegunConsumo = 10;
			break;
		case consumoE:
			precioSegunConsumo = 30;
			break;
		case consumoD:
			precioSegunConsumo = 50;
			break;
		case consumoC:
			precioSegunConsumo = 60;
			break;
		case consumoB:
			precioSegunConsumo = 80;
			break;
		case consumoA:
			precioSegunConsumo = 100;
			break;
		}
		if (peso > 0 && peso < 19) {
			precioSegunTamaño = 10;
		} else if (peso > 20 && peso < 49) {
			precioSegunTamaño = 50;
		} else if (peso > 50 && peso < 79) {
			precioSegunTamaño = 80;
		} else if (peso > 80) {
			precioSegunTamaño = 100;
		}
		return precioBase + precioSegunTamaño + precioSegunConsumo;
	}

	/**
	 * Metodo que devuelvo el precioBase.
	 * 
	 * @return Devuelve el valor de precioBase
	 */
	public float getPrecioBase() {
		return precioBase;
	}

	/**
	 * Metodo para modificar el precioBase.
	 * 
	 * @param precioBase
	 */
	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * Metodo que devuelve el peso.
	 * 
	 * @return Devuelve el valor de peso.
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * Metodo para modificar el peso.
	 * 
	 * @param peso
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	 * Metodo que devulve el color.
	 * 
	 * @return Devuelve el valor de color.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Metodo para modifcar el color.
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Metodo que devuelve el consumo energetico.
	 * 
	 * @return Devuelve el valor de consumo energetico.
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * Metodo que modifca el consumo energetico.
	 * 
	 * @param consumoEnergetico
	 */
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

}