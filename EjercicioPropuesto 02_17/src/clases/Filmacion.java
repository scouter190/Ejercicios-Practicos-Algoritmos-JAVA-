package clases;

public class Filmacion {
	public int codigo;
	public String titulo;
	public int duracionMinutos;
	public int precioSoles;
	
	
	
	public Filmacion(int codigo, String titulo, int duracionMinutos, int precioSoles) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.duracionMinutos = duracionMinutos;
		this.precioSoles = precioSoles;
	}



	public double precioDolares(){
		return (duracionMinutos * precioSoles) * 3.38; 
	}
	
}
