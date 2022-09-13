package ejercicio3;

/**
 * TAREA 9 EJERCICIO 3
 * 
 * @author Alvaro Benitez Carmona
 *
 */
public class MainLibro {

	public static void main(String[] args) {
		Libro Hobbit = new Libro("7895462", "El Hobbit", "J.K. Rowlling", 250);
		Libro JuegosDelHambre = new Libro("4589423", "Los juegos del hambre", "Suzanne Collins", 350);

		System.out.println(Hobbit.toString() + "\n" + JuegosDelHambre.toString());

		System.out.println("El libro com mas paginas es " + Hobbit.masPaginas(JuegosDelHambre));

	}

}
