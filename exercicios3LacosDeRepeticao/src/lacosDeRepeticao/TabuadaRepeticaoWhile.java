package lacosDeRepeticao;

import java.util.Scanner;

public class TabuadaRepeticaoWhile {

	public static void main(String[] args) {	
//  WHILE: É um laço de repetição que executa um bloco de código ENQUANTO a condição for verdadeira.
//  A condição é verificada ANTES da execução do bloco. 
//  Diferente do FOR, o WHILE não coloca inicialização, condição e incremento no cabeçalho.
//  → Ele só recebe a condição. Inicialização e incremento precisam ser feitos separadamente.
//  → É útil quando não sabemos exatamente quantas vezes vamos repetir, mas sabemos a CONDIÇÃO para continuar.
		
		int numero; 	
//  INT NUMERO → Declara a variável que vai armazenar o número que o usuário digitar.
//  Não recebe valor aqui ainda, só reserva o espaço na memória.

		int contador = 1;		
//  INT CONTADOR = 1 → Cria a variável que controla o laço de repetição.
//  Ela começa valendo 1, pois a tabuada deve iniciar com "número x 1".
//  DIFERENÇA IMPORTANTE PRO FOR: aqui precisamos declarar e inicializar ANTES do laço,
//  já que o WHILE só aceita a condição dentro de seus parênteses.

		Scanner scanner = new Scanner(System.in); 
//  CRIA UM OBJETO DO TIPO SCANNER → usado para capturar dados digitados no console pelo usuário.
//  System.in → indica que a leitura será feita a partir do teclado.

		System.out.println("Digite um numero inteiro: ");
//  MOSTRA MENSAGEM NA TELA → pedindo para o usuário digitar um número.

		numero = scanner.nextInt();
//  LÊ O VALOR DIGITADO PELO USUÁRIO e armazena na variável NUMERO.
//  .nextInt() → significa que o programa espera um valor do tipo inteiro.

		while (contador <= 10) {
//  WHILE (contador <= 10) → A condição que controla o laço.
//  Enquanto o valor de CONTADOR for menor ou igual a 10, o bloco dentro do WHILE será executado.
//  → Quando CONTADOR for 11, a condição ficará falsa e o laço será interrompido.
//  IMPORTANTE: Se esquecer de atualizar o CONTADOR dentro do bloco, teremos um LOOP INFINITO.

			System.out.printf("%d x %d = %d%n", numero, contador, numero * contador);
//  SYSTEM.OUT → envia informação para a saída padrão (tela/console).
//  .PRINTF → imprime texto formatado, substituindo os marcadores (%d) por valores.
//  "%d x %d = %d%n" → é a STRING DE FORMATAÇÃO, o molde da frase:
//      1º %d → substituído pelo valor de NUMERO.
//      2º %d → substituído pelo valor de CONTADOR.
//      3º %d → substituído pelo resultado de NUMERO * CONTADOR.
//      %n → quebra de linha (ENTER).
//  NUMERO, CONTADOR, NUMERO * CONTADOR → valores que vão preencher os %d, na ordem correta.

			 contador ++;
//  CONTADOR++ → incrementa o valor da variável CONTADOR em +1.
//  MESMA COISA QUE: contador = contador + 1.
//  ESSENCIAL no WHILE → sem isso, CONTADOR nunca aumentaria, a condição seria sempre verdadeira
//  e o programa entraria em loop infinito (rodando para sempre).
		}

		scanner.close();
	}
}


//                     COMO FUNCIONA NA PRÁTICA
// Se numero = 5, o que acontece passo a passo:
// contador = 1 → verifica condição (1 <= 10 = true) → imprime 5 x 1 = 5 → contador vira 2
// contador = 2 → condição (2 <= 10 = true) → imprime 5 x 2 = 10 → contador vira 3
// contador = 3 → condição (3 <= 10 = true) → imprime 5 x 3 = 15 → contador vira 4
// contador = 10 → condição (10 <= 10 = true) → imprime 5 x 10 = 50 → contador vira 11
// contador = 11 → condição (11 <= 10 = false) → sai do laço

//                      Resultado no console:
//                          5 x 1 = 5
//                          5 x 2 = 10
//                          5 x 3 = 15
//                             ...
//                          5 x 10 = 50

//                           RESUMINDO
//WHILE → repete enquanto a condição for verdadeira.
//Diferença pro FOR → inicialização e incremento ficam fora do cabeçalho.
//Uso comum → quando não sabemos quantas repetições vamos precisar (ex.: ler dados até o usuário digitar "0").
//Aqui → usamos WHILE para repetir a tabuada de 1 até 10.

//                      PASSOS PRINCIPAIS
//Criar variável de controle (contador = 1).
//Definir condição (contador <= 10).
//Executar bloco (imprimir linha da tabuada).
//Atualizar variável (contador++).
//Repetir até condição ser falsa.   
