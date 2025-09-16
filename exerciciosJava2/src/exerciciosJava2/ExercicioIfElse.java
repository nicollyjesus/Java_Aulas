package exerciciosJava2;

import java.util.Scanner;

public class ExercicioIfElse {

	//algoritmo em Java que leia 3 valores inteiros A, B e C 
	//e imprima na tela se a soma de A + B é maior, menor ou igual a C
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valorA, valorB, valorC;
		
		System.out.println("Digite o valor do A: ");
		valorA = scanner.nextInt();
		
		System.out.println("Digite o valor do B: ");
		valorB = scanner.nextInt();
		
		System.out.println("Digite o valor do C: ");
		valorC = scanner.nextInt();
		
		int soma = valorA + valorB; //Declarando primeiro o valorA e B
		System.out.println(valorA + valorB + soma); //Mostrando na tela a conta de A + B + C
		
		if(soma > valorC) { //Fazendo a conta da soma(a+B) menos C
			System.out.println(" > " + valorC); //Se o valor A e B forem maiores que C, então será imprimido na tela a mensagem
			System.out.println("A + B é maior do que C!");
		}
		else if(soma < valorC ) {
			System.out.println(" < " + valorC);
			System.out.println("A soma de A+B é menor do que C!");
		}
		else {
			System.out.println(" = " + valorC);
			System.out.println("C é maior do que A e B");
		}
		scanner.close();
	}
}
