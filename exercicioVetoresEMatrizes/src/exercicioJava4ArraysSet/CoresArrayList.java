package exercicioJava4ArraysSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CoresArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<>();

        // Solicita ao usuário que digite 5 cores
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a cor " + i + ": ");
            String cor = scanner.nextLine();
            cores.add(cor);
        }

        // Mostra todas as cores adicionadas
        System.out.println("\nListar todas as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Ordena as cores em ordem crescente
        Collections.sort(cores);

        // Mostra as cores ordenadas
        System.out.println("\nOrdenar as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        scanner.close();
    }
}
