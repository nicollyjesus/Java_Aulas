package exercicio3LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio1For {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro número do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        int fim = scanner.nextInt();

        // Validação do intervalo
        if (inicio >= fim) {
            System.out.println("\nIntervalo inválido!");
        } else {
            System.out.println("\nNo Intervalo entre " + inicio + " e " + fim + ":");

            // Laço de repetição FOR para percorrer o intervalo
            for (int i = inicio; i <= fim; i++) {
                // Verificação se é múltiplo de 3 e 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é múltiplo de 3 e 5");
                }
            }
        }
        scanner.close();
    }
}
