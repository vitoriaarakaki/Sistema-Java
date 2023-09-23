package Primeiros_Desafios_de_Codigo;

import java.util.Scanner;

public class BancoApp {
    public static double calcularJuros(double valorInicial, double taxaJurosAnual, int periodoAnos) {
        double valorFinal = valorInicial * Math.pow(1 + taxaJurosAnual, periodoAnos);
        //Math.round <3
        valorFinal = Math.round(valorFinal * 100.0) / 100.0;

        return valorFinal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double taxaJurosAnual = scanner.nextDouble();
        int periodoAnos = scanner.nextInt();

        double valorFinal = calcularJuros(valorInicial, taxaJurosAnual, periodoAnos);
        System.out.println("Valor final do investimento: R$" + valorFinal);
    }
}