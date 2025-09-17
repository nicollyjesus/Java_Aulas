package exercicio3LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio3DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;          // variável para armazenar o número digitado
        int soma = 0;        // soma dos números múltiplos de 3
        int contador = 0;    // contador de números múltiplos de 3

        // DO WHILE: executa o bloco pelo menos uma vez, depois verifica a condição
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            // verifica se o número é múltiplo de 3
            if (numero % 3 == 0 && numero != 0) {  
                soma += numero;    // soma o número
                contador++;        // incrementa o contador
            }

        } while (numero != 0);  // enquanto o número digitado não for zero, continua pedindo

        // verifica se pelo menos um número múltiplo de 3 foi digitado
        if (contador > 0) {
            double media = (double) soma / contador;  // calcula a média
            System.out.println("\nA média de todos os números múltiplos de 3 é: " + media);
        } else {
            System.out.println("\nNenhum múltiplo de 3 foi digitado.");
        }

        scanner.close();
    }
}
