package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado;
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	private static int cantidadAves = 0;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas = colorPlumas;
		cantidadAves++;
	}
	public Ave() {}
	
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		halcones++;
		listado.add(halcon);
		return halcon;
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		aguilas++;
		listado.add(aguila);
		return aguila;
	}
	
	public static int cantidadAves() {
		return cantidadAves;
	}
	
	public String movimiento() {
		return "volar";
	}
}
