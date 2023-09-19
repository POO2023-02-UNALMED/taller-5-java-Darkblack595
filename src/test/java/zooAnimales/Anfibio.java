package zooAnimales;

public class Anfibio extends Animal {
	private Anfibio[] listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(Anfibio[] listado, int ranas, int salamandras, String colorPiel, boolean venenoso) {
		this.listado = listado;
		this.ranas = ranas;
		this.salamandras = salamandras;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	public Anfibio() {}
	
	public String getColorPiel() {
		return this.colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public boolean getVenenoso() {
		return this.venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}
