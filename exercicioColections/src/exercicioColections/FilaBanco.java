package exercicioColections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando a fila (Queue) para armazenar os clientes
        Queue<String> fila = new LinkedList<>();

        int opcao;

        do {
            // Exibindo o menu
            System.out.println("\n********* MENU *********");
            System.out.println("1 - Adicionar Cliente na Fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da Fila");
            System.out.println("0 - Sair");
            System.out.print("Entre com a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    // Adicionar cliente
                    System.out.print("Digite o nome do Cliente: ");
                    String nome = scanner.nextLine();
                    fila.add(nome);
                    System.out.println("Cliente \"" + nome + "\" adicionado à fila!");
                    break;

                case 2:
                    // Listar clientes
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        System.out.println("Clientes na fila:");
                        for (String cliente : fila) {
                            System.out.println("- " + cliente);
                        }
                    }
                    break;

                case 3:
                    // Retirar cliente
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia! Ninguém para retirar.");
                    } else {
                        String chamado = fila.poll(); // retira o primeiro da fila
                        System.out.println("Cliente \"" + chamado + "\" foi chamado e retirado da fila.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
