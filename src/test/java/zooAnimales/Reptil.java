package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado;
	public static int iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas;
	private int largoCola = 0;
	private static int cantidadReptiles = 0;
	static {
		listado = new ArrayList<Reptil>();
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
		cantidadReptiles++;
	}
	public Reptil() {
		super("",0,"","");
		listado.add(this);
		cantidadReptiles++;
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public int getLargoCola() {
		return this.largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas++;
		listado.add(iguana);
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		iguanas++;
		listado.add(serpiente);
		return serpiente;
	}
	
	public static int cantidadReptiles() {
		return cantidadReptiles;
	}
	
	public String movimiento() {
		return "reptar";
	}
}
