package exerciciosJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner escreva = new Scanner(System.in);
		
		Double salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.printf("Escreva seu sálario bruto: ");
		salarioBruto = escreva.nextDouble();
		
		System.out.printf("Escreva seu Adicional Noturno: ");
		adicionalNoturno = escreva.nextDouble();
		
		System.out.printf("Escreva suas horas extras: ");
		horasExtras = escreva.nextDouble();
		
		System.out.printf("Escreva seus descontos nota: ");
		descontos = escreva.nextDouble();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.print(salarioLiquido);
		
		escreva.close();
	}
}
