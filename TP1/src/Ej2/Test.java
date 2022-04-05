package Ej2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Juegos juegos = new Juegos();
		ArrayList<Atleta> atletas = new ArrayList<>();
		
		atletas.add(new Atleta("A1", 8.22));
		atletas.add(new Atleta("A2", 9.22));
		atletas.add(new Atleta("A3", 8.1));
		atletas.add(new Atleta("A4", 9.22));
		atletas.add(new Atleta("A5", 10));
		atletas.add(new Atleta("A6", 8.1));

		System.out.println(juegos.listarGanadores(atletas));
		
		
	}

}
