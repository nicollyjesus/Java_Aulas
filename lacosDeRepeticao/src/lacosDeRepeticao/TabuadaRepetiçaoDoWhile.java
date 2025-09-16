package lacosDeRepeticao;

import java.util.Scanner;

public class TabuadaRepetiçaoDoWhile {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); 

		 int numero; 
// INT NUMERO => Variável que vai guardar o número digitado pelo usuário (a tabuada será desse número).

		 int contador = 1;		
// INT CONTADOR = 1 => Variável de controle do laço. Começa em 1 porque a tabuada sempre inicia no “1 x número”.

		 System.out.println("Digite um numero inteiro: "); 

		 numero = scanner.nextInt(); 
// SCANNER.NEXTINT => Captura o número digitado e guarda na variável "numero".

// ------------------- AQUI COMEÇA O LAÇO DO WHILE -------------------

		 do {
// DO => Significa “faça”. Ou seja, o código dentro das chaves será executado pelo menos uma vez, SEM checar a condição antes.
			 
			 System.out.printf("%d x %d = %d%n", numero, contador, numero * contador);
// SYSTEM.OUT.PRINTF => Imprime a multiplicação formatada.
// "%d x %d = %d%n" => É a string de formatação (o molde).
//  1º %d → será substituído por "numero".
//  2º %d → será substituído por "contador".
//  3º %d → será substituído por "numero * contador".
// %n → quebra de linha (pula para a próxima).
// Exemplo: Se numero=7 e contador=3, a saída será "7 x 3 = 21"

			 contador ++;
// CONTADOR++ => Soma +1 ao contador. Faz a tabuada ir avançando (1, 2, 3...) até chegar em 10.

		 } while (contador <= 10);
// WHILE (CONTADOR <= 10) => Essa é a condição de parada. O laço continua enquanto o contador for menor ou igual a 10.
// DIFERENÇA IMPORTANTE: Aqui a condição é verificada **depois** de rodar o bloco. 
// Isso garante que o código dentro do "do { ... }" será executado ao menos UMA vez, mesmo que a condição já esteja falsa.

		 scanner.close(); 
// Fecha o Scanner (boa prática para liberar memória).
	}
}


//                      COMO FUNCIONA NA PRÁTICA
// Se numero = 5, o que acontece passo a passo:
// contador = 1 → entra no DO direto (sem checar condição) → imprime 5 x 1 = 5 → contador vira 2
// contador = 2 → verifica condição (2 <= 10 = true) → volta para o DO → imprime 5 x 2 = 10 → contador vira 3
// contador = 3 → condição (3 <= 10 = true) → imprime 5 x 3 = 15 → contador vira 4
// contador = 10 → condição (10 <= 10 = true) → imprime 5 x 10 = 50 → contador vira 11
// contador = 11 → condição (11 <= 10 = false) → sai do laço

//                      Resultado no console:
//                          5 x 1 = 5
//                          5 x 2 = 10
//                          5 x 3 = 15
//                             ...
//                          5 x 10 = 50

//                          RESUMINDO
// DO WHILE → executa o bloco pelo menos uma vez, mesmo que a condição seja falsa logo no início.
// Diferença pro WHILE normal → no DO WHILE a condição só é verificada DEPOIS da execução do bloco.
// Uso comum → quando precisamos garantir que o código rode ao menos uma vez (ex.: menus interativos, pedir senha, etc.).
// Aqui → usamos DO WHILE para repetir a tabuada de 1 até 10, mas com a certeza de que será impressa pelo menos 1 vez. 

//                       PASSOS PRINCIPAIS
// Criar variável de controle (contador = 1).
// Executar bloco (imprimir linha da tabuada).
// Atualizar variável (contador++).
// Verificar condição (contador <= 10).
// Se for verdadeira → repetir o bloco.
// Se for falsa → encerrar laço.
