package Tipos_e_Variaveis;

public class Exemplos {

	//************ DECLARAÇÃO DE VARIÁVEIS ***********
//A estrutura padrão para se declarar uma variável sempre é:
		<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
		
//Exemplos
		int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
		int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
		double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
		
//Atenção: existe algumas peculiaridades a trabalhar com alguns tipos específicos. Observe no exemplo abaixo:
		public class TipoDados {
			public static void main(String[] args) {
				byte idade = 123;
				short ano = 2021;
				int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
				long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
				float pi = 3.14F;
				double salario = 1275.33;
			}
		}
		
// TiposEVariaveis.java
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;		
		
		
	//************ VARIÁVEIS E CONSTANTES **************	
		public class ExemploVariavel {
			public static void main(String[] args) {
				/*
				 * esta linha é considerada como declaração de variável iniciamos a existência
				 * variavel numero com valor 5 regra: tipo + nome + valor
				 */
				int numero = 5;

				/*
				 * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
				 * não é mais necessário, pois a variável já foi declarada anteriormente
				 */
				numero = 10;

				System.out.print(numero);
				
				/*
				 * ao usar a palavra reservada final, você determina que jamais
				 * esta variavel poderá obter outro valor;
				 * logo a linha 25 vai apresentar um erro de compilação
				 * isso é considerado uma CONSTANTE na linguagem Java
				 */
				final double VALOR_DE_PI = 3.14;
				
				VALOR_DE_PI = 3.15; //Esta linha vai apresentar erro de compilação!
			}
		}		
		
		
		
}
