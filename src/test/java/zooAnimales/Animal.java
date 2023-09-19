package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona  = new Zona[1];
	
	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
	public Animal() {}
	
	public int getTotalAnimales(){
		return this.totalAnimales;
	}
	public void setTotalAnimales(int totalAnimales){
		this.totalAnimales = totalAnimales;
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
	
	public Zona[] getZona(){
		return this.zona;
	}
	public void setZona(Zona[] zona) {
		this.zona = zona;
	}
	
	public String toString() {
		return "Mi nombre es " + this.getNombre() + " tengo una edad de"+ this.getEdad() +", habito en"+ this.getHabitat() + " y mi genero es "+
				this.getGenero();
	}
	
	public String movimiento() {
		return "desplazarse";
	}
}