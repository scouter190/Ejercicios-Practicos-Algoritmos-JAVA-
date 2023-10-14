package clases;

public class Computadora {
	private int codigo;
	private String marca;
	private String color;
	private double precioDolares;
	
	public Computadora(int codigo, String marca, String color, double precioDolares) {
		this.codigo = codigo;
		this.marca = marca;
		this.color = color;
		this.precioDolares = precioDolares;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecioDolares() {
		return precioDolares;
	}

	public void setPrecioDolares(double precioDolares) {
		this.precioDolares = precioDolares;
	}
	
	public double getPrecioSoles(){
		return getPrecioDolares()*3.25;
	}
	
	public double getPrecioEuros(){
		return getPrecioDolares()*1.20;
	}
	
	
}
