package exercicioJava4ArraysSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NumerosSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        System.out.println("Digite 10 valores inteiros (não repetidos):");

        while (numeros.size() < 10) {
            System.out.print("Digite um número: ");
            int valor = scanner.nextInt();

            if (numeros.contains(valor)) {
                System.out.println("Número já digitado! Tente outro.");
            } else {
                numeros.add(valor);
            }
        }

        // Mostrando os elementos usando Iterator
        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}
