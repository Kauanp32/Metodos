package Metodos;

public class MetodoSemRetorno {
	
	// public = deixa o metodo visivel a todos as classes do pacote e a outros classe que não pertençem ao pacote
	
	// private = ele é o maior nivel de restriçao deixa o metodo ou atributo visivel somente para propia classe.
	
	// private = é  um niveol de abstrcacao intermediario a pacote e classe que pertence ao mesmo pacote da clase.
	
	/* Sinta para escrever um metodo 
	 * 
	 * qualificador -- tipo de retorno -- nome do metodo
	 * 
	 */

	
	public static void escrevaAlgo() {
		System.out.println("Aprendendo metodos em java.");
		
	}
	public void somaNumerosInteiros(int numero1, int numero2) {
		  System.out.print("A soma dos numeros e " + numero1 + numero2);
	}
	 public static  void  imprimePalavra(String palavra ) {
		   System.out.println("A palavra e: " + palavra);
	}
	   
	 public static void main(String [] args ) {
		   
		   escrevaAlgo();
		   imprimePalavra("palavra");
	   }
	   
}