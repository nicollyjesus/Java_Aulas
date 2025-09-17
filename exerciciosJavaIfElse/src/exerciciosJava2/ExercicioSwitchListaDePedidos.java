package exerciciosJava2;

import java.util.Scanner;

public class ExercicioSwitchListaDePedidos {
	
	// algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) 
	// e a quantidade comprada deste item (número inteiro). A seguir, mostre na tela 
	//o valor total da conta e o nome do produto que foi comprado.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Código do Produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        String produto = "";   // Vai guardar o nome do produto
        double precoUnitario = 0;  // Vai guardar o preço do produto

        // Estrutura switch para determinar o produto e o preço
        switch (codigo) {
            case 1:
                produto = "Cachorro Quente";
                precoUnitario = 10.00;
                break;
            case 2:
                produto = "X-Salada";
                precoUnitario = 15.00;
                break;
            case 3:
                produto = "X-Bacon";
                precoUnitario = 18.00;
                break;
            case 4:
                produto = "Bauru";
                precoUnitario = 12.00;
                break;
            case 5:
                produto = "Refrigerante";
                precoUnitario = 8.00;
                break;
            case 6:
                produto = "Suco de laranja";
                precoUnitario = 13.00;
                break;
            default:
                System.out.println("Código de produto inválido!");
                scanner.close();
        }

        // Cálculo do valor total
        double valorTotal = quantidade * precoUnitario;

        // Saída de dados
        System.out.println("Produto: " + produto);
        System.out.printf("Valor total: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
