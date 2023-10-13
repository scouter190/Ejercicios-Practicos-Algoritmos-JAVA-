package clases;

public class Coordinador {
	public int codigo;
	public String nombre;
	public int categoria;
	public int celular;
	public Coordinador(int codigo, String nombre, int categoria, int celular) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		this.celular = celular;
	}
	
	public double calcularSueldo(){
		switch (categoria) {
		case 0:
			return 8500;
		case 1:
			return 6850;
		case 2:
			return 5500;
			
		default:
			return 0.0;
			
		}
	}
		
}
