package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Por favor, digite o número da conta: ");
	Integer numeroConta = scanner.nextInt();
	
	System.out.println("Por favor, digite a Agência:  ");
	String agencia = scanner.nextLine();
	
	System.out.println("Por favor, digite o nome do cliente: ");
	String nomeCliente = scanner.nextLine();
	
	System.out.println("Por favor, digite o valor do saldo:  ");
	Double saldo = scanner.nextDouble();
	
	System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uam conta em nosso banco, ");
	System.out.println("sua agência é " + agencia + ", conta " + numeroConta + "e seu saldo é de R$" + saldo + " já está disponível para saque.");
	
	scanner.close();
	
		

	}

}
