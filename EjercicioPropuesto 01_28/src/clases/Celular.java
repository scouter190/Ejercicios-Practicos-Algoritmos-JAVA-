package clases;

public class Celular {
	private int numero;
	private String usuario;
	private int segundosConsumidos;
	private double precioPorSegundo;
	
	public Celular(int numero, String usuario, int segundosConsumidos, double precioPorSegundo) {
		this.numero = numero;
		this.usuario = usuario;
		this.segundosConsumidos = segundosConsumidos;
		this.precioPorSegundo = precioPorSegundo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getSegundosConsumidos() {
		return segundosConsumidos;
	}

	public void setSegundosConsumidos(int segundosConsumidos) {
		this.segundosConsumidos = segundosConsumidos;
	}

	public double getPrecioPorSegundo() {
		return precioPorSegundo;
	}

	public void setPrecioPorSegundo(double precioPorSegundo) {
		this.precioPorSegundo = precioPorSegundo;
	}
	
	public double getCostoPorConsumo(){
		return segundosConsumidos*precioPorSegundo;
	}
	
	public double getImpuestoIGV(){
		return getCostoPorConsumo()*0.18;
	}
	
	public double getTotalPagar(){
		return getCostoPorConsumo()+getImpuestoIGV();
	}
}
