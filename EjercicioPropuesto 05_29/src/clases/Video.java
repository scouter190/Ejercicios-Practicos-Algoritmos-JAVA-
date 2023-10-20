package clases;

public class Video {
	private int codigo;
	private String nombre;
	private double duracion;
	private double precioSoles;
	private double tipoCambio;
	
	public Video(int codigo, String nombre, double duracion, double precioSoles, double tipoCambio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.duracion = duracion;
		this.precioSoles = precioSoles;
		this.tipoCambio = tipoCambio;
	}
	
	public Video(){
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public double getPrecioSoles() {
		return precioSoles;
	}

	public void setPrecioSoles(double precioSoles) {
		this.precioSoles = precioSoles;
	}

	public double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	
	
	
}	
