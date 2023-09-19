package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado;
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;
	private static int cantidadAnfibios = 0;
	
	public Anfibio(String nombre,int edad,String habitat,String genero, String colorPiel, boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		cantidadAnfibios++;
	}
	public Anfibio(String colorPiel, boolean venenoso, String habitat) {
		
	}
	public Anfibio() {}
	
	public String getColorPiel() {
		return this.colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public boolean isVenenoso() {
		return this.venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public static Anfibio crearRana(String nombre,int edad,String genero) {
		Anfibio rana = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
		listado.add(rana);
		return rana;
	}
	public static Anfibio crearSalamandra(String nombre,int edad,String genero) {
		Anfibio salamandra = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
		listado.add(salamandra);
		return salamandra;
	}
	
	public static int cantidadAnfibios() {
		return cantidadAnfibios;
	}
	
	public String movimiento() {
		return "saltar";
	}
}
