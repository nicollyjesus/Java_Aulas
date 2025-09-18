package exercicioColections;
import java.util.Scanner;

public class MediaParticipantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matriz 10x4 -> 10 alunos e 4 notas cada
        double[][] notas = new double[10][4];

        // Vetor para armazenar as médias
        double[] medias = new double[10];

        // Leitura das notas
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as 4 notas do participante " + (i + 1) + ":");
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
                soma += notas[i][j];
            }
            medias[i] = soma / 4.0;
        }

        // Exibe as médias
        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Participante %d: %.1f\n", (i + 1), medias[i]);
        }

        scanner.close();
    }
}