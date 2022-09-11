import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> ListElec = new ArrayList<Electrodomestico>();
		ArrayList<Float> ListPrecio = new ArrayList<Float>();
		Lavadora lavadora1 = new Lavadora();
		Lavadora lavadora2 = new Lavadora(100, 50);
		Lavadora lavadora3 = new Lavadora(250, 80);
		Lavadora lavadora4 = new Lavadora(250f, "azul", 100f, 'B', 45);
		Lavadora lavadora5 = new Lavadora(250f, "azul", 100f, 'B', 45);
		Television tele1 = new Television();
		Television tele2 = new Television(125, 50);
		Television tele3 = new Television(250, 50);
		Television tele4 = new Television(250f, "azul", 100f, 'B', 45, true);
		Television tele5 = new Television(350f, "azul", 375f, 'B', 45, false);
		ListElec.add(tele1);
		ListElec.add(tele2);
		ListElec.add(tele3);
		ListElec.add(tele4);
		ListElec.add(tele5);
		ListElec.add(lavadora1);
		ListElec.add(lavadora2);
		ListElec.add(lavadora3);
		ListElec.add(lavadora4);
		ListElec.add(lavadora5);
		for (int i = 0; i < ListElec.size(); i++) {
			ListElec.get(i).precioFinal();
			ListPrecio.add(ListElec.get(i).precioFinal());
		}
		toStringElectrodomestico(ListPrecio, ListElec);
	}

	private static void toStringElectrodomestico(ArrayList<Float> ListPrecio, ArrayList<Electrodomestico> ListElec) {
		float precio = 0;
		for (int i = 0; i < ListElec.size(); i++) {
			precio = precio + ListPrecio.get(i);
		}
		System.out.println("PRECIO TOTAL ---> " + precio);
		for (int i = 0; i < ListElec.size(); i++) {
			if (ListElec.get(i) instanceof Television) {
				System.out.println("Precio de la Television --->" + ListPrecio.get(i));
			} else if (ListElec.get(i) instanceof Lavadora) {
				System.out.println("Precio de la Lavadora --->" + ListPrecio.get(i));
			}
		}

	}

}
