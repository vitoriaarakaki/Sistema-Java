package Desafio_de_Codigo;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner leitorEntradas = new Scanner(System.in);
		float valorSalario = leitorEntradas.nextFloat();
		float valorBeneficios = leitorEntradas.nextFloat();
		
		float valorImposto = 0;
		if (valorSalario >= 0 && valorSalario <= 1100) {
			valorImposto = 0.5F * valorSalario;
		}else if (valorSalario >= 1000.01 && valorSalario <= 2500.00) {
			valorImposto = 0.10F * valorSalario;
		}else {
			valorImposto = 0.15F * valorSalario;
		}
		
		
		
		float saida = valorSalario - valorImposto + valorBeneficios;
		System.out.println(String.format("%.2f", saida));
	}

}
