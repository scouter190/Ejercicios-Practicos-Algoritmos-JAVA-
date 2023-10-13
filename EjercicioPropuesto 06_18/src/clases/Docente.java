package clases;

public class Docente {
	public int codigo;
	public String nombre;
	public int horasTrabajadas;
	public double tarifaHora;
	
	public Docente(int codigo, String nombre, int horasTrabajadas, double tarifaHora) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
	}
	
	public double calcularSueldo(){
		return horasTrabajadas*tarifaHora;
	}	
}