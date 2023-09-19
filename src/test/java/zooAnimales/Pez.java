package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado;
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas = 0;
	private static int cantidadPeces = 0;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		cantidadPeces++;
	}
	public Pez(String colorEscamas, int cantidadAletas, String habitat) {
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	public Pez() {}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre,edad,"oceano",genero,"rojo",6);
		salmones++;
		listado.add(salmon);
		return salmon;
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez(nombre,edad,"oceano",genero,"gris",6);
		salmones++;
		listado.add(bacalao);
		return bacalao;
	}
	
	public static int cantidadPeces() {
		return cantidadPeces;
	}
	
	public String movimiento() {
		return "nadar";
	}
}
