package exercicio3LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		int primeiroNumero;
		int segundoNumero;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		primeiroNumero = scanner.nextInt();
		
		System.out.println("Digite o promeiro número do intervalo: ");
		segundoNumero = scanner.nextInt();
		
		if (primeiroNumero <= segundoNumero){
			for (int multiplos = 0; multiplos <= 100; multiplos++) {
				System.out.println("O primeiro é maior que o segundo!");
				System.out.printf("%d x %d = %d%n", primeiroNumero, segundoNumero, multiplos, primeiroNumero * segundoNumero * multiplos);	
			}
		} else {
			System.out.println("o intervalo é inválido! ");
			
		}
		
		

	}
}
