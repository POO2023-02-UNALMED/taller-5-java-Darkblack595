package gestion;

import zooAnimales.Animal;

import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private static ArrayList<Animal> animales;
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	public Zona() {
		this.zoo = new Zoologico();
		this.nombre = "";
	}
	
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Zoologico getZoo(){
		return this.zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public ArrayList<Animal> getAnimales(){
		return animales;
	}
	
	public void agregarAnimales(Animal nuevoAnimal) {
		animales.add(nuevoAnimal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}

}
 