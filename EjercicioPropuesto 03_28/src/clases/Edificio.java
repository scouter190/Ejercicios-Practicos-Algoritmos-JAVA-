package clases;

public class Edificio {
	private int codigo;
	private int cantidadDepartamentos;
	private int cantidadPisos;
	private double precioDepartamentoDolares;
	
	public Edificio(int codigo, int cantidadDepartamentos, int cantidadPisos, double precioDepartamentoDolares) {
		this.codigo = codigo;
		this.cantidadDepartamentos = cantidadDepartamentos;
		this.cantidadPisos = cantidadPisos;
		this.precioDepartamentoDolares = precioDepartamentoDolares;
	}
	public Edificio(){
		
	};

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidadDepartamentos() {
		return cantidadDepartamentos;
	}

	public void setCantidadDepartamentos(int cantidadDepartamentos) {
		this.cantidadDepartamentos = cantidadDepartamentos;
	}

	public int getCantidadPisos() {
		return cantidadPisos;
	}

	public void setCantidadPisos(int cantidadPisos) {
		this.cantidadPisos = cantidadPisos;
	}

	public double getPrecioDepartamentoDolares() {
		return precioDepartamentoDolares;
	}

	public void setPrecioDepartamentoDolares(double precioDepartamentoDolares) {
		this.precioDepartamentoDolares = precioDepartamentoDolares;
	}
	
	public double getPrecioEdificioDolares(){
		return getCantidadDepartamentos()*getPrecioDepartamentoDolares();
	}
}
