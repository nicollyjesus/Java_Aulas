package exercicioJava4ArraysSet;

import java.util.Scanner;

public class PesquisaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vetor já definido no exemplo
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        System.out.print("Digite o número que você deseja encontrar: ");
        int numero = sc.nextInt();

        boolean encontrado = false;

        // Percorrendo o vetor para procurar o número
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("O número " + numero + " está localizado na posição: " + i);
                encontrado = true;
                break; // Para sair do laço quando encontrar
            }
        }

        if (!encontrado) {
            System.out.println("O número " + numero + " não foi encontrado!");
        }

        sc.close();
    }
}
