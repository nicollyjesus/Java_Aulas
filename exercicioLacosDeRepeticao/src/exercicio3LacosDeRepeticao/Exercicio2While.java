package exercicio3LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio2While {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;              // variável para armazenar a idade digitada
        int menores21 = 0;      // contador de pessoas com menos de 21 anos
        int maiores50 = 0;      // contador de pessoas com mais de 50 anos

        // WHILE: laço de repetição que continua enquanto a condição for verdadeira
        // aqui usamos um laço infinito controlado pela idade negativa
        while (true) {

            System.out.print("Digite uma idade: ");
            idade = scanner.nextInt();

            // condição de parada: idade negativa
            if (idade < 0) {
                break;  // sai do laço
            }

            // verifica se a idade é menor que 21
            if (idade < 21) {
                menores21++;
            }

            // verifica se a idade é maior que 50
            if (idade > 50) {
                maiores50++;
            }
        }

        // Exibe os resultados finais
        System.out.println("\nTotal de pessoas menores de 21 anos: " + menores21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);

        scanner.close();
    }
}
