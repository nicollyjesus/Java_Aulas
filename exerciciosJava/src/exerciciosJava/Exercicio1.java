package exerciciosJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner escreva = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.printf("Escreva o valor do sálario :");
		salario = escreva.nextFloat();
		
		System.out.printf("Escreva o valor do Abono :");
		abono = escreva.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.print(novoSalario);

	}
}
