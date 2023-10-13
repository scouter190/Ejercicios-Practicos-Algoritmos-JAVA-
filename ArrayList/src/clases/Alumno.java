package clases;

public class Alumno {
	private int nota1;
	private int nota2;
	private int codigo;
	private String nombre;
	
	public Alumno(){
		
	}

	public Alumno(int codigo , String nombre , int nota1, int nota2 ) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
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
	
	public double promedio(){
		return (nota1+nota2)/3;
	}
	
	
	
	
}
