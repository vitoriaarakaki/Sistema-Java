package ControleFluxo;

public class Repeticao {

	public static void main(String[] args) {

		// Comando FOR
		for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}

		// Outras estruturas

		// estrutura 1
		for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}

		// estrutura 2
		// o que importa é somente o bloco condicional
		int carneirinhos = 1;
		for (; carneirinhos <= 20;) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
			carneirinhos++;
		}
	}


// for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da
// execução ) { }

// Comando FOR EACH
public class ExemploFor {
	public static void main(String[] args) {
		String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

		// Forma abreviada
		for (String aluno : alunos) {
			System.out.println(alunos);
		}

	}

}

// Comando Break
public class ExemploBreakContinue {
	public static void main(String[] args) {

		for (int numero = 1; numero <= 5; numero++) {
			if (numero == 3)
				break;

			System.out.println(numero);

		}
		// Qual a saída no console ?

	}
}

// Comando WHILE
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
		public static void main(String[] args) {
			double mesada = 50.0;
		        while(mesada>0) {
		            Double valorDoce = valorAleatorio();
		            if(valorDoce > mesada)
		                valorDoce = mesada;

		            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
		            mesada = mesada - valorDoce;
		        }
		        System.out.println("Mesada:" + mesada);
		        System.out.println("Joãozinho gastou toda a sua mesada em doces");
		        
		   }
		   private static double valorAleatorio() {
			return ThreadLocalRandom.current().nextDouble(2, 8);
		   }
		}

// Comando Do While
import java.util.Random;

public class ExemploDoWhile {
	public static void main(String[] args) {
		System.out.println("Discando...");

		do {
			// excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");

		} while (tocando());

		System.out.println("Alô !!!");
	}

	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3) == 1;
		System.out.println("Atendeu? " + atendeu);
		// negando o ato de continuar tocando
		return !atendeu;
		}
	}

}
