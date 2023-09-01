package Escopo;

public class Exemplo {
	
	//Variável da classe conta
	double saldo = 10.0;
	
	public void sacar(Double valor) {
		//Variável local do método
		double novoSaldo = saldo - valor;
	}
	
	public void imprimirSaldo() {
		//disponivelk em toda classe
		System.out.println(saldo);
		//somente o método sacar connhece essa variável
		System.out.println(novoSaldo);
		
	}
	
	public double calcularDividaExponencial() {
		//variável local do método
		double valorParcela = 50.0;
		double valorMontante = 0.0; //começando a variável com  zero
		for(int x = 1; x <= 5; x++) { //x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
			
		}
		
		//escopo de fluxo
		//x e valorCalculado nunca estarão fisponiveis fora do for
		
		return valorMontante;
	}

}
