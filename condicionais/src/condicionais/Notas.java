package condicionais;

import java.util.Scanner;

public class Notas { //Declara a classe principal chamada Notas.

	public static void main(String[] args) { //Método principal onde o programa começa.

		Scanner escreva = new Scanner(System.in); //Cria um objeto Scanner para ler as notas digitadas.
		float nota1, nota2, nota3, nota4, media; //Declara variáveis para armazenar as notas e a média.
		
		System.out.println("Digite a 1 nota: "); //Exibe mensagens pedindo para o usuário digitar cada nota.
		nota1 = escreva.nextFloat(); //Lê cada nota digitada pelo usuário colocando ela na variável declarada.
		
		System.out.println("Digite a 2 nota: ");
		nota2 = escreva.nextFloat();
		
		System.out.println("Digite a 3 nota: ");
		nota3 = escreva.nextFloat();
		
		System.out.println("Digite a 4 nota: ");
		nota4 = escreva.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4; //Calcula a média das quatro notas.
		
		if(media >= 7) {                                //Verifica se a média é maior ou igual a 7.
			System.out.println("Aluno foi Aprovado "); // Se for, executa o bloco e imprime "Aluno foi Aprovado"
		}else if(media >= 5&& media < 7 ){  // Só é avaliado se a condição anterior for falsa. verifica se a média é pelo menos 5, ou menos que 7. operador && significa "e", ou seja, as duas condições precisam ser verdadeiras ao mesmo tempo.
			System.out.println("Aluno em Recuperação");
		}
		else {                              //Executa se nenhuma das condições anteriores for verdadeira
			System.out.println("Aluno foi Reprovado");
		}
		
		escreva.close();	
	}
}
