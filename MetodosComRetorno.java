package Metodos;

public class MetodosComRetorno {

	
	public static int  somaNumeros(int numero, int numero2) {
		
		return (numero + numero2);
		
	}

	public static int multiplicNumeros (int numero, int numero2) {
		return (numero * numero2);
	}

	  
	
	
	public static int subtraiNumeros (int numero, int numero2) {
		return(numero - numero2);
	}

	
	
	public static void main(String[] args) {
		
		int numero = 2;
		int numero2 = 5;
		
		somaNumeros(numero, numero2);
		
		System.out.println(somaNumeros(numero, numero2));
		
		
	}

	
	
}
