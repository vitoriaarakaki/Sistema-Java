package Primeiros_Desafios_de_Codigo;

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
       double saldoFinal = saldoAtual + valorDeposito - valorRetirada;
       
     //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
     
      double saida = saldoFinal;
		  System.out.println("Saldo atualizado na conta: " + saida);
      
      
    }
}