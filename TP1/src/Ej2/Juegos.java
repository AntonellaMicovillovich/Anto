package Ej2;

import java.util.ArrayList;

public class Juegos {

	private ArrayList<Atleta> atletas;


	public Juegos() {
		this.atletas = atletas;
	}
	
	public ArrayList<Atleta> listarGanadores(ArrayList<Atleta>atletas) {
		ArrayList<Atleta> ganadores = new ArrayList<>();
		double tiempoMenor = Integer.MAX_VALUE;
		
		for (Atleta atleta : atletas) {
			double segundosAtleta = atleta.getSegundos();
			
			if(segundosAtleta < tiempoMenor) {
				ganadores.clear();
				ganadores.add(atleta);
				tiempoMenor = segundosAtleta;
			} else if (segundosAtleta == tiempoMenor) {
				ganadores.add(atleta);
			}
		}
		
		
		return ganadores;
	}
	
}



