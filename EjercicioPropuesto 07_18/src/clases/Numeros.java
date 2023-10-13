package clases;
public class Numeros {
	public int numero1;
	public int numero2;
	public int numero3;
	
	public Numeros(int numero1, int numero2, int numero3) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
	}

	public int calcularNumeroMenor(){
		return Math.min(Math.min(numero1, numero2) , numero3);
	}
	
	public int calcularNumeroMayor(){
		return Math.max(Math.max(numero1, numero2), numero3);
	}
	
	public int calcularNumeroIntermedio(){
		int menor = calcularNumeroMenor();
		int mayor = calcularNumeroMayor();
		
		if( numero1 != menor && numero1 != mayor ){
			return numero1;
		}else if(numero2 != menor && numero2 !=mayor){
			return numero2;
		}else{
			return numero3;
		}
	}
}