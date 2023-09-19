package zooAnimales;

public class Ave extends Animal {
	private Ave[] listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave(Ave[] listado, int halcones, int aguilas, String colorPlumas) {
		this.listado = listado;
		this.halcones = halcones;
		this.aguilas = aguilas;
		this.colorPlumas = colorPlumas;
	}
	public Ave() {}
	
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}
