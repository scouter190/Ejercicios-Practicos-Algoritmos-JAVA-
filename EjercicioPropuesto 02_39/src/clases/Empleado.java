package clases;

public class Empleado {
	
	private static int cantidadEmpleados;
	private static double sumatoriaSueldosNetos;
	private static final double factorDescuento;
	
static{
	
	cantidadEmpleados=0;
	sumatoriaSueldosNetos=0;
	factorDescuento=0.15;
	
}

	private int codigo;
	private String nombre;
	private int categoria;
	private int nroCelular;
	
	public Empleado(int codigo, String nombre, int categoria, int nroCelular) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		this.nroCelular = nroCelular;
		cantidadEmpleados++;
		sumatoriaSueldosNetos+=getSueldoNeto();
	}
	
	public Empleado(int codigo, String nombre){
		
		this(codigo,nombre,2,9999999);
		
	}
	
	public Empleado(){
		
		this(4444,"Ninguno");
		
	}

	public static int getCantidadEmpleados() {
		
		return cantidadEmpleados;
		
	}

	public static void setCantidadEmpleados(int cantidadEmpleados) {
		
		Empleado.cantidadEmpleados = cantidadEmpleados;
		
	}

	public static double getSumatoriaSueldosNetos() {
		return sumatoriaSueldosNetos;
	}

	public static void setSumatoriaSueldosNetos(double sumatoriaSueldosNetos) {
		Empleado.sumatoriaSueldosNetos = sumatoriaSueldosNetos;
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

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getNroCelular() {
		return nroCelular;
	}

	public void setNroCelular(int nroCelular) {
		this.nroCelular = nroCelular;
	}

	public static double getFactordescuento() {
		return factorDescuento;
	}
	
	public double getSueldoBruto(){
		switch (categoria) {
		case 0:
			return 7200.0;
		case 1:
			return 6300.0;
		case 2:
			return 5100.0;
		}
		return 0.0;
	}
	
	
	public double getDescuento(){
		return getSueldoBruto()*getFactordescuento();
	}
	
	
	public double getSueldoNeto(){
		return getSueldoBruto()-getDescuento();
	}
}