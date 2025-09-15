package exerciciosJava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner escreva = new Scanner(System.in);
		
		Double n1, n2, n3, n4, diferenca;
		
		System.out.printf("Escreva o valor do n1: ");
		n1 = escreva.nextDouble();
		
		System.out.printf("Escreva o valor do n2: ");
		n2 = escreva.nextDouble();
		
		System.out.printf("Escreva o valor do n3: ");
		n3 = escreva.nextDouble();
		
		System.out.printf("Escreva o valor do n4: ");
		n4 = escreva.nextDouble();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.print(diferenca);
		
		escreva.close();
	}
}

