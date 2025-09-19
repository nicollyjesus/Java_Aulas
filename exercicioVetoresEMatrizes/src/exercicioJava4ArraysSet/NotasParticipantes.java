package exercicioJava4ArraysSet;

import java.util.Scanner;

public class NotasParticipantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[10][4]; // matriz 10x4
        double[] medias = new double[10];     // vetor para médias

        // Leitura das notas e cálculo da média
        for (int i = 0; i < 10; i++) {
            double soma = 0;
            System.out.println("Digite as 4 notas do participante " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                notas[i][j] = sc.nextDouble();
                soma += notas[i][j];
            }
            medias[i] = soma / 4;
        }

        // Exibindo médias
        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Participante %d: %.1f%n", (i + 1), medias[i]);
        }

        sc.close();
    }
}
