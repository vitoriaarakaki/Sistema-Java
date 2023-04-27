package Validacao;

import java.util.Scanner;
import Validacao.ValidacaoCPF;

@SuppressWarnings("unused")
public class Teste extends ValidacaoCPF{

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String CPF;

			System.out.printf("Informe seu CPF: ");
			CPF = sc.next();

			System.out.printf("\nResultado: ");

			if (ValidacaoCPF.isCPF(CPF) == true) {
				System.out.printf("%s\n", ValidacaoCPF.imprimeCPF(CPF));
			} else {
				System.out.printf("Erro, CPF informado é invalido !!!\n");
			}
		}
	}
}
