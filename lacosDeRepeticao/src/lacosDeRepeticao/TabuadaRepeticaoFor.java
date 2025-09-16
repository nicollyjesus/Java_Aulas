package lacosDeRepeticao;

import java.util.Scanner;

public class TabuadaRepeticaoFor {

//=============================================================================================================================================================
//  FOR: quando sabemos de antemão quantas vezes o laço deve ser executado. LAÇO CONTROLADO POR CONTADOR
//  While: quando NÃO sabemos quantas vezes o codigo vai ser repetido A CONDIÇÃO É VERIFICADA ANTES DA EXECUÇÃO
//  DO WHILE: quando queremos que o bloco seja executado ao menos uma vez, mesmo que a conidição ja esteja falsa. A CONDIÇÃO É  VVERIFICADA APÓS A EXECUÇÃO
//=============================================================================================================================================================
	
	public static void main(String[] args) {
		
		int numero;
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Digite um numero inteiro: ");
		numero = scanner.nextInt();
		
//   System.out.printf("%d x %d = %d%n", numero, 1, numero * 1); Essa seria a forma sem o for, mas teriamos que repetir 10 vezes
		
		for (int contador = 1; contador <= 10; contador ++) {
//   FOR => Indica que vamos criar um laço de repetição. CONTADOR <= 10: Essa é a condição de parada. Enquanto CONTADOR for menor ou igual a 10, o laço continua.| 
//   INT  CONTADOR = 1 => Aqui criamos a variável de controle chamada CONTADOR e indica que vamos criar um laço de repetição.
//   CONTADOR  ++ => Significa incrementar 1 no contador a cada repetição. É o mesmo que escrever contador = contador + 1;. Está na última parte porque o Java executa isso depois que o bloco do laço roda 
			
			System.out.printf("%d x %d = %d%n", numero, contador, numero * contador);
//   SYSTEM.OUT => O System é uma classe do Java que já vem pronta. O out é um objeto dessa classe que representa a saída padrão (geralmente a tela/console).
//   .PRINTF  =>  Diferente de println, aqui você pode usar marcadores (%d, %s, etc.) que serão substituídos pelos valores das variáveis. O f vem de “formatted” (formatado)
//   "%d x %d = %d%n" => Essa é a string de formatação, o “molde” da frase. %D → é um espaço reservado para um número inteiro (d = decimal). PRIMEIRO %D → vai ser trocado pelo valor de numero. SEGUNDO %D → vai ser trocado pelo valor de contador. TERCEIRO %D → vai ser trocado pelo resultado de numero * contador. %N → é um comando para pular para a próxima linha (quebra de linha, tipo “Enter”).
//   NUMERO, CONTADOR, NUMERO * CONTADOR => Esses são os valores que entram nos lugares dos %D. Ordem importa: O PRIMEIRO %D recebe numero. O SEGUNDO %D recebe contador. O TERCEIRO %D recebe numero * contador.

		}
		scanner.close();
	}	
}

//                    COMO FUNCIONA NA PRÁTICA
//  Se numero = 5 e contador = 3, então:
//  Primeiro %d → 5
//  Segundo %d → 3
//  Terceiro %d → 5 * 3 = 15

//=====================================================================
//               O QUE VAI APARECER NO CONSOLE É =>  5 x 3 = 15
//  E graças ao %n, depois dessa linha ele já pula para a próxima.
//=====================================================================

//                            RESUMINDO
// System.out → mostra algo na tela.
// .printf → mostra algo formatado.
// "%d x %d = %d%n" → molde com 3 números inteiros e quebra de linha.
// numero, contador, numero * contador → valores que preenchem o molde.

