package ControleFluxo;

public class Condicionais {

	public static void main(String[] args) {
		
//Condicional Simples:
		double saldo = 25.0;
	       double valorSolicitado = 17.0;

	       if(valorSolicitado < saldo)
	        saldo = saldo - valorSolicitado;

	        System.out.println(saldo);
	        
//Condional composta:
	        
	        int nota = 6;
	        
	        if(nota >= 7)
	         System.out.println("Aprovado");

	        else
	         System.out.println("Reprovado");
	        
//Condicional Encadeada:
	        int nota1 = 6;

	    	if (nota1 >= 7)
	    		System.out.println("Aprovado");
	    	else if (nota1 >= 5 && nota1 < 7)
	    		System.out.println("Recuperação");
	    	else
	    		System.out.println("Reprovado");
	    	
//Condicional Ternária:
	    	int nota2 = 7;
			String resultado1 = nota2 >=7 ? "Aprovado" : "Reprovado";
			System.out.println(resultado1);
			
			//ou
			
			int nota3 = 6;
			String resultado2 = nota3 >=7 ? "Aprovado" : nota3 >=5 && nota3 <7 ? "Recuperação" : "Reprovado";
			System.out.println(resultado2);
			
//Switch Case:
			String sigla = "M";

			switch (sigla) {
			case "P":{
				System.out.println("PEQUENO");
				break;
			}
			case "M":{
				System.out.println("MÉDIO");
				break;
			}
			case "G":{
				System.out.println("GRANDE");
				break;
			}
			default:
				System.out.println("INDEFINIDO");
			}
			
	     }
		
	}


