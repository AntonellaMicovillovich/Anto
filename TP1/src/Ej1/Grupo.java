package Ej1;

import java.util.ArrayList;

public class Grupo {

	private String nombre;
	private ArrayList<String> integrantes;
	private int cantidadIntegrantes;
	
	public Grupo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadIntegrantes() {
		return cantidadIntegrantes;
	}

	
	//METODOS
	
	public void agregarIntegrante(String nombreIntegrante) {
		String nombreBuscado = buscarNombre(nombreIntegrante);
		
		if(nombreBuscado == null) {
			integrantes.add(nombreIntegrante);
		}
		
	}

	private String buscarNombre(String nombreIntegrante) {
		String nombreBuscado = null;
		int i = 0;
		
		while (i < integrantes.size() && nombreBuscado == null) {
			if(integrantes.get(i).equals(nombreIntegrante)) {
				nombreBuscado = integrantes.get(i);
			} else i++;
		}
		
		return nombreBuscado;
	}
	
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int posicion = buscarPosicion(nombreIntegrante);
		
		return posicion;
	}
	
	private int buscarPosicion(String nombreIntegrante) {
		int posicionBuscada = -1;
		int i = 0;
		
		while (i < integrantes.size() && posicionBuscada == -1) {
			if(integrantes.get(i).equals(nombreIntegrante)) {
				posicionBuscada = i + 1;
			} else i++;
		}
		
		return posicionBuscada;
	}
	
	public String obtenerIntegrante(int posicion) {
		
	}
	
}
