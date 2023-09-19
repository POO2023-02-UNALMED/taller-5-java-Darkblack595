package zooAnimales;

public class Mamifero extends Animal{
	private Mamifero[] listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(Mamifero[] listado, int caballos, int leones, boolean pelaje, int patas) {
		this.listado = listado;
		this.caballos = caballos;
		this.leones = leones;
		this.pelaje = pelaje;
		this.patas = patas;
	}
	public Mamifero() {}
	
	public boolean getPelaje() {
		return this.pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public int getPatas() {
		return this.patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public 
}
