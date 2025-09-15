package helloworld1; //define o pacote onde o codigo está
import java.util.Scanner; //está importanto a classe scanner

public class variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //
		
		System.out.println("Digite um peso: ");
		int peso = leia.nextInt();
		
		System.out.println("Digite uma opção: ");
		char opcao = leia.next().charAt(0);
		
		System.out.println("Digite o valor: ");
		float valor = leia.nextFloat();
		
		System.out.println("O valor da variável peso é: " + peso);	
		System.out.println("O valor da variável opcão é: " + opcao);
		System.out.printf("O valor da variável valor é: %.2f", valor);
	
		leia.close();
	}
}
