package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {}
	
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUbicacion(){
		return this.ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public ArrayList<Zona> getZona(){
		return zonas;
	}
	
	public void agregarZonas(Zona nuevaZona) {
		zonas.add(nuevaZona);
	}
	
	public int cantidadTotalAnimales() {
		int zoototal = 0;
		for(Zona zona: zonas) {
			if(zona.getZoo().getNombre()==this.getNombre()){
				zoototal = zoototal + zona.cantidadAnimales();
			}
		}
		return zoototal;
	}
	
}
