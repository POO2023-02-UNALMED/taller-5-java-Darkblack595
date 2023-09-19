package zooAnimales;

public class Reptil extends Animal {
	private Reptil[] listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(Reptil[] listado, int iguanas, int serpientes, String colorEscamas, int largoCola) {
		this.listado = listado;
		this.iguanas = iguanas;
		this.serpientes = serpientes;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	public Reptil() {}
	
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
}
