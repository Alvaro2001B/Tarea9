package ejercico2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Videojuegos> ArrayVideojuegos=new ArrayList<Videojuegos>();
		ArrayList<Serie> ArraySerie=new ArrayList<Serie>();
		Videojuegos v1=new Videojuegos("LOL",15,"Riot","MOBA");
		Videojuegos v2=new Videojuegos("Valorant",27);
		Videojuegos v3=new Videojuegos("Call of Dutty",20,"Activision","Disparos");
		Videojuegos v4=new Videojuegos("Pokemon Go",35);
		Videojuegos v5=new Videojuegos("Destiny",25);
		ArrayVideojuegos.add(v5);
		ArrayVideojuegos.add(v4);
		ArrayVideojuegos.add(v3);
		ArrayVideojuegos.add(v2);
		ArrayVideojuegos.add(v1);
		ArrayVideojuegos.get(1).entregar();
		ArrayVideojuegos.get(0).entregar();
		ArrayVideojuegos.get(4).entregar();
		Serie s1=new Serie("Jujutsu Kaisen", "Pikachu",5,"Anime");
		Serie s2=new Serie("Shingeki no kyogin", "Toshiba",10,"Anime");
		Serie s3=new Serie("Piratas del caribe", "Jonny");
		Serie s4=new Serie("Fire Force", "Estopa",15,"Anime");
		Serie s5=new Serie("Neverland", "Estopa",12,"Anime");
		ArraySerie.add(s5);
		ArraySerie.add(s4);
		ArraySerie.add(s3);
		ArraySerie.add(s2);
		ArraySerie.add(s1);
		ArraySerie.get(2).entregar();
		ArraySerie.get(1).entregar();
		entregado(ArrayVideojuegos,ArraySerie);
		compareToVideojuegos(ArrayVideojuegos);
		compareToSerie(ArraySerie);
	}

	private static void entregado(ArrayList<Videojuegos> ArrayVideojuegos,ArrayList<Serie> ArraySerie) {
		int total=0;
		for(int i=0; i<ArrayVideojuegos.size();i++) {
			if(ArrayVideojuegos.get(i).isEntregado()==true) {
				total++;
			}
		}
		System.out.println("Hay "+total+" videojuegos entregados");
		total=0;
		for(int i=0; i<ArraySerie.size();i++) {
			if(ArraySerie.get(i).isEntregado()==true) {
				total++;
			}
		}
		System.out.println("Hay "+total+" serie entregados");
	}
	
	private static void compareToVideojuegos(ArrayList<Videojuegos> ArrayVideojuegos) {
		Videojuegos p=new Videojuegos();
		boolean first=true;
		String nombre="";
		for(int i=0; i<ArrayVideojuegos.size();i++) {
			if(first) {
				p=ArrayVideojuegos.get(i);
				first=false;
			}
			
			if(!nombre.equalsIgnoreCase(ArrayVideojuegos.get(i).compareTo(p))){
				nombre=ArrayVideojuegos.get(i).compareTo(p);
				p=ArrayVideojuegos.get(i);
			}
		}
		System.out.println("El videojuego mas jugado es:\n"+p.ToString());
		
	}
	
	private static void compareToSerie(ArrayList<Serie> ArraySerie) {
		Serie p=new Serie();
		boolean first=true;
		String nombre="";
		for(int i=0; i<ArraySerie.size();i++) {
			if(first) {
				p=ArraySerie.get(i);
				first=false;
			}
			
			if(!nombre.equalsIgnoreCase(ArraySerie.get(i).compareTo(p))){
				nombre=ArraySerie.get(i).compareTo(p);
				p=ArraySerie.get(i);
			}
		}
		System.out.println("La serie mas larga es:\n"+p.ToString());
	}
	
	
}
