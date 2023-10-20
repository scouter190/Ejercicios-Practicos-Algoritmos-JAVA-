package clases;

public class Factura {
	
	private static int facturasCreadas;
	private static double sumaImportesFacturados;
	private static final String constante;
	
	static{
		constante = "SUNAT";
		facturasCreadas=0;
		sumaImportesFacturados=0.0;
	}	
	private String RUC;
	private String empresa;
	private int unidades;
	private double precioUnitario;
	public Factura(String RUC, String empresa, int unidades, double precioUnitario) {
		
		this.RUC = RUC;
		this.empresa = empresa;
		this.unidades = unidades;
		this.precioUnitario = precioUnitario;
		facturasCreadas++;
		sumaImportesFacturados+=getImporteFacturado();
	}
	
	public Factura(String RUC , String empresa){
		this(RUC ,empresa,10,50.0);
	}
	
	public Factura(){
		this("1111111", "MN-Global SRL" );
	}

	public static int getFacturasCreadas() {
		return facturasCreadas;
	}

	public static void setFacturasCreadas(int facturasCreadas) {
		Factura.facturasCreadas = facturasCreadas;
	}

	public static double getSumaImportesFacturados() {
		return sumaImportesFacturados;
	}

	public static void setSumaImportesFacturados(double sumaImportesFacturados) {
		Factura.sumaImportesFacturados = sumaImportesFacturados;
	}

	public String getRUC() {
		return RUC;
	}

	public void setRUC(String rUC) {
		RUC = rUC;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public static String getConstante() {
		return constante;
	}
	
	public double getImporteFacturado(){
		return precioUnitario * unidades;
	}
}
	
	
	