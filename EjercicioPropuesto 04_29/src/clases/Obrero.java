package clases;
import gui.*;
public class Obrero {
	private int codigo;
	private String nombre;
	private int horasTrabajadas;
	private double tarifaHora;
	
	public Obrero(int codigo, String nombre, int horasTrabajadas, double tarifaHora) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
	}

	public Obrero(){
		
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

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getTarifaHora() {
		return tarifaHora;
	}

	public void setTarifaHora(double tarifaHora) {
		this.tarifaHora = tarifaHora;
	}
	
	public double getSueldoBruto(){
		return horasTrabajadas*tarifaHora;
	}
	
	public double getDescuentoAFP(){
		return getSueldoBruto()*0.10;
	}
	
	public double getDescuentoEPS(){
		return getSueldoBruto()*0.05;
	}
	
	public double getSueldoNeto(){
		return getSueldoBruto()-getDescuentoAFP()-getDescuentoEPS();
	}
	
	public String listado(){
		
		return "Código: " + codigo + "\n" +
                "Nombre: " + nombre + "\n" +
                "Horas Trabajadas: " + getHorasTrabajadas() + "\n" +
                "Tarifa por Hora: " + getTarifaHora() + "\n" +
                "Sueldo Bruto: " + getSueldoBruto() + "\n" +
                "Descuento AFP: " + getDescuentoAFP() + "\n" +
                "Descuento EPS: " + getDescuentoEPS() + "\n" +
                "Sueldo Neto: " + getSueldoNeto() + "\n";
	}
	
}
