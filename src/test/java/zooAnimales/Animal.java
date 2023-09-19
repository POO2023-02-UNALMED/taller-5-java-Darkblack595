package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales = 0;
	private String nombre;
	private int edad = 0;
	private String habitat;
	private String genero;
	private static Zona zona;
	
	public Animal() {}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	public int getTotalAnimales(){
		return totalAnimales;
	}

	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public int getEdad(){
		return this.edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public String getHabitat(){
		return this.habitat;
	}
	public void setHabitat(String habitat){
		this.habitat = habitat;
	}
	
	public String getGenero(){
		return this.genero;
	}
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	public Zona getZona(){
		return zona;
	}
	
	public static String totalPorTipo() {
		return "Mamiferos:" + Mamifero.cantidadMamiferos()+"\n"+"Aves:"+Ave.cantidadAves()+"\n"+"Reptiles:"+Reptil.cantidadReptiles()+
				"\n"+"Peces:"+Pez.cantidadPeces()+"\n"+"Anfibios:"+Anfibio.cantidadAnfibios();
	}

	public String toString() {
		return "Mi nombre es "+this.getNombre()+", tengo una edad de "+this.getEdad()+", habito en "+this.getHabitat()+ " y mi genero es "+
				this.getGenero();
	}
	
	public String movimiento() {
		return "desplazarse";
	}
}