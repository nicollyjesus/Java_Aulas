package exerciciosJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner escreva = new Scanner(System.in);
		
		Double nota1, nota2, nota3, nota4;
		
		System.out.printf("Escreva sua primeira nota: ");
		nota1 = escreva.nextDouble();
		
		System.out.printf("Escreva sua segunda nota: ");
		nota2 = escreva.nextDouble();
		
		System.out.printf("Escreva sua terceira nota: ");
		nota3 = escreva.nextDouble();
		
		System.out.printf("Escreva sua quarta nota: ");
		nota4 = escreva.nextDouble();
		
		System.out.printf("%.1f + %.1f + %.1f + %.1f = %.1f", nota1, nota2, nota3, nota4, (nota1 + nota2 + nota3 + nota4)/4);
		
		escreva.close();
	
		
		
	}
}
