package operadores;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		// Instanciar um objeto da classe Scanner (Entrada de dados)
		
		Scanner leia = new Scanner(System.in); // o Leia é o objeto da classe e o System.in é o teclado para o usuário
		
		// Definir as variáveis
		
		double numero1, numero2; // Declarando as variáveis 
		
		// Entrada de dados
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble(); 
		
		System.out.println("Digite o primeiro número: ");
		numero2 = leia.nextDouble();
		
		// Efetuar os cáuculos
		
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, numero1 + numero2); // Somando nossas variáveis 
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, numero1 - numero2); // %.2f é usado para sabermos quantas casas o valor irá aparecer, exemplo: se estiver %.1f o valor trazido será de 4.0, se for %.2f será 4.00
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, numero1 * numero2); // O %n no final serve para pular linha na soma
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, numero1 / numero2);
	
		// Operaço~es matématicas com a Classe Math
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, Math.pow(numero1, numero2)); //Ele eleva um número (a base) a uma potência (expoente). Exemplo: Math.pow(base, expoente)
		System.out.printf("Raiz Quadrada de %.2f = %.2f", numero1, Math.sqrt(numero1)); //sqrt vem de square root (raiz quadrada). Ele calcula a raiz quadrada de um número.
		
		
	}

}
