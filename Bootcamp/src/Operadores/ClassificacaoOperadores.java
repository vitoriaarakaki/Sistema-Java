package Operadores;

public class ClassificacaoOperadores {

//Atribuição
	
//classe Operadores.java
	String nome = "GLEYSON";
	int idade = 22;
	double peso = 68.5;
	char sexo = 'M';
	boolean doadorOrgao = false;
	Date dataNascimento = new Date();
	
	
//Aritméticos
	double soma = 10.5 + 15.7;
	int subtração = 113 - 25;
	int multiplicacao = 20 * 7;
	int divisao = 15 / 3;
	int modulo = 18 % 3;
	double resultado = (10 * 7) + (20/4);

//Exemplos
//classe Operadores.java
	String nomeCompleto = "LINGUAGEM" + "JAVA";
			
//qual o resultado das expressoes abaixo?
	String concatenacao = "?"; 

	concatenacao = 1+1+1+"1";

	concatenacao = 1+"1"+1+1;

	concatenacao = 1+"1"+1+"1";

	concatenacao = "1"+1+1+1;

	concatenacao = "1"+(1+1+1);

	
//Unários
//classe Operadores.java
	int numero = 5;
			
//Imprimindo o numero negativo
	System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
	numero ++;
	System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7
	System.out.println(numero ++);// ops algo de errado não está certo

	System.out.println(numero);// agora sim, numero virou 7

//ordem de precedencia conta aqui
	System.out.println(++ numero);

	boolean verdadeiro = true;

	System.out.println("Inverteu " + !verdadeiro);
	
//Ternário
	
	<Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
	
// classe Operadores.java
	int a, b;

	a = 5;
	b = 6;

	/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
	if(a==b)
	   resultado = "verdadeiro";
	else
	   resultado = "falso";
	*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
	String resultado = (a==b) ? "verdadeiro" : "false";

	System.out.println(valor);
	
//Relacionais
	
	int numero1 = 1;
	int numero2 = 2;

	if(numero1 > numero2)
		System.out.print("Numero 1 maior que numero 2");

	if(numero1 < numero2)
		System.out.print("Numero 1 menor que numero 2");

	if(numero1 >= numero2)
		System.out.print("Numero 1 maior ou igual que numero 2");

	if(numero1 <= numero2)
		System.out.print("Numero 1 menor ou igual que numero 2");

	if(numero1 != numero2)
		System.out.print("Numero 1 é diferente de numero 2");
	
	
//Comparações Avançadas
	public static void main(String[] args) {

	        String nome1 = "JAVA";
	        String nome2 = "JAVA";
	        
	        System.out.println(nome1 == nome2); //true

	        String nome3 = new String("JAVA");
	        
	        System.out.println(nome1 == nome3); //false

	        String nome4 = nome3;

	        System.out.println(nome3 == nome4); //true
	        
	        //equals na parada
	        System.out.println(nome1.equals(nome2)); //??
	        System.out.println(nome2.equals(nome3)); //??
	        System.out.println(nome3.equals(nome4)); //??

	    }
	
	//Equals ==
	 public static void main(String[] args) {
	        
	        int numero1 = 130;
	        int numero2 = 130;
	        System.out.println(numero1 == numero2); //true
	        
	        Integer numero1 = 130;
	        Integer numero2 = 130;

	        System.out.println(numero1 == numero2); //false
	        
	        // A razão pela qual o resultado é false, é devido o Java tratar os valores
	        // Como objetos a partir de agora.
	        // Qual a solução ?
	        // Quando queremos comparar objetos, usamos o método equals
	        
	         System.out.println(numero1.equals(numero2)); 
	 }	

	 
//Lógicos
	 boolean condicao1=true;

	 boolean condicao2=false;

	 /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
	 expressões. 
	 É como se estivesse escrito:
	  "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
	 */

	 if(condicao1 && condicao2)
	 	System.out.print("Os dois valores precisam ser verdadeiros");;

	 //Se condicao1 OU condicao2 for verdadeira, executar código.
	 if(condicao1 || condicao2)
	 	System.out.print("Um dos valores precisa ser verdadeiro");
	
//Expressões lógicas avançadas
	 int numero1 = 1;
	 int numero2 = 1;

	 if(numero1== 2 & numero2 ++ == 2 )
	     System.out.println("As 2 condições são verdadeiras");

	 System.out.println("O numero 1 agora é " + numero1);
	 System.out.println("O numero 2 agora é " + numero2);

	 // Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
