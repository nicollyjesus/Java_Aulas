package exerciciosJava2;

import java.util.Scanner;

public class ExercicioIfElsePositivoNegativo {

	//Algoritmo em Java, que leia um número inteiro via teclado e mostre na tela 
	//uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Variáveis auxiliares para guardar as descrições
		String parOuImpar;
		String positivoOuNegativo;
		
		// Entrada de Dados
		System.out.println("Digite seu número: ");
		int numero = scanner.nextInt();
		
		
		// Verificando se é Par ou Ímpar
		if (numero % 2 == 0) { // resto da divisão por 2 igual a 0 → número par
			parOuImpar = "par";
		} else {  // Verificando se o número é Par ou Ímpar
			parOuImpar = "Ímpar";
		}
		
		// Verificando se é Positivo ou Negativo
		if (numero > 0) { // maior que zero → positivo
			positivoOuNegativo = "positivo";
		} else if (numero < 0) { // menor que zero → negativo
			positivoOuNegativo = "negativo";
		} else {
			positivoOuNegativo = "Zero";
		}
		
		//Saída de Dados
		if (numero != 0) { // Se o número for diferente de zero → imprime a mensagem completa
			System.out.println("O número " + numero + " é " + parOuImpar + " e " + positivoOuNegativo + "!");
		} else { // Caso o número seja zero → imprime uma frase específica
			System.out.println("O numero digitado é zero");
		}
		
		scanner.close();
	}
}
