package zooAnimales;

public class Pez extends Animal {
	private Pez[] listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(Pez[] listado, int salmones, int bacalaos, String colorEscamas, int cantidadAletas) {
		this.listado = listado;
		this.salmones = salmones;
		this.bacalaos = bacalaos;
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
}
