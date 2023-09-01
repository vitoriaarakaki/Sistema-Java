package Java.Anatomia.Classes;

public class Exemplos {
	
//Variáveis com letras maiusculas não podem sobrer alterações futuras
	String BR = "Brasil";
	double PI = 3.14;
	int ESTADOS_BRASILEIRO = 27;
	int ANO_2000 = 2000;
	
//Declaração Inválida de Variáveis 
	int numero&um = 1; //Os únicos símbolos permitidos são _ e $;
	int 1numero = 1;   //Uma variável não pode começar com númerico;
	int numero um = 1; //Não pode ter espaçamentos no nome da variável;
	int long = 1;      //LONG faz parte das palavras reservadas da linguagem.
	
//Declaração Válida de Variáveis
	int numero$um = 1;
	int numero1 = 1;
	int numeroUm = 1;
	int longo = 1;
	
//Estrutura --> Variável
	Tipo NomeBemDefinifo = Atribuicao (opcional em alguns casos);
	
//Exemplo 
	int idade = 23;
	double altura = 1.62;
	Dog spike; //classe --> referencia a outra classe (sem valor)
	
//Estrutura --> Métodos
	TipoRetorno NomeObjetivoNoInfinitivo Parametro(s);
	
//Exemplo
	int somar (int numeroUm, int numeroDois); //Tem que ter no minimo dois parametros.
	//Exemplo 
	public static void main(String[] args) {
		String primeiroNome = "Vitoria";
		String segundoNome = "Arakaki";
		
		String nomeCompleto = nomeCompleto (primeiroNome, segundoNome); 
		System.out.println(nomeCompleto);
	}
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
	}
	
//Fim do sistema
}

//Código com Identação 

public class BoletimEstudantil {
	public static void main(String[] args) {
		int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA DE RECUPERAÇÂO");
		else
			System.out.println("APROVADO");
		
	}
}


//Java Beans
//***VARIÁVEIS***
//Não recomendado
	double salMedio = 1500.00; //variável abreviada, o que dificulta a compreenção;
	String emails = "aluno@escola.com"; //cofuso se a variável seria um array ou único e-mail;
	String myName = "John"; //se o idioma pt-BR, o valor pode ser de outro idioma, mas o nome da variável não.
	
//Recomendado	
	double salarioMedio = 1500.23;
	String email = "aluno@escola.com";
	String [] emails = {"aluno@escola.com","professor@escola.com"};
	String meuNome = "JOSEPH";

//***MÉTODOS***
	somar(int n1, int n2){}

	abrirConexao(){}

	concluirProcessamento() {}

	findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada

	calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade
















