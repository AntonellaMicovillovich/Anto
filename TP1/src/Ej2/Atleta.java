package Ej2;

public class Atleta {

	
	private String nombre;
	private double segundos;
	
	public Atleta(String nombre, double segundos) {
		this.nombre = nombre;
		this.segundos = segundos;
	}

	public double getSegundos() {
		return segundos;
	}

	@Override
	public String toString() {
		return "Atleta [Nombre=" + nombre + ", segundos=" + segundos + "]";
	}

	
}
