package clases;

public class Expositor {
	public int codigo;
	public String nombre;
	public int horasTrabajadas;
	public double tarifaHora;
	
	
	public Expositor(int codigo, String nombre, int horasTrabajadas, double tarifaHora) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
	}
	
	
	public double calcularSueldoBruto(){
		return horasTrabajadas*tarifaHora;
	}
	
	public double calcularDescuentoAFP(){
		return calcularSueldoBruto()*0.10;
	}
	
	public double calcularDescuentoEPS(){
		return calcularSueldoBruto() * 0.05;
	}
	
	public double calcularSueldoNeto(){
		return (calcularSueldoBruto()-calcularDescuentoAFP()-calcularDescuentoEPS());
	}
	
	
	
}
