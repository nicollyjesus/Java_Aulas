package exerciciosJava2;

import java.util.Scanner;

public class ExercicioSwitchListadePessoas {

	//algoritmo em Java que leia o Nome do Colaborador (String), 
	// o Código do Cargo do Colaborador (número inteiro de 1 a 6) e 
	// o Salário (número float). A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		int codigoColaborador;
		float salario;
		
		
		System.out.println("Qual o seu nome? ");
		nome = scanner.next();
		
		System.out.println("Qual o seu código? (1 a 6) ");
		codigoColaborador = scanner.nextInt();
		
		System.out.println("Qual o valor do seu salário? ");
		salario = scanner.nextFloat();
		
		String cargo = "";
		float reajuste = 0;
        
		
		switch (codigoColaborador) {
        case 1:
			cargo = "Gerente";
			reajuste = 0.10f;
			break;
			
        case 2:
        	cargo = "Vendedor";
        	reajuste = 0.07f;
        	break;
        	
        case 3:
        	cargo = "Supervidor";
        	reajuste = 0.09f;
        	break;
        	
        case 4:
        	cargo = "Motorista";
        	reajuste = 0.06f;
        	break;
        	
        case 5:
        	cargo = "Estoquista";
        	reajuste = 0.05f;
        	break;
        	
        case 6:
        	cargo = "Técnico de T.I";
        	reajuste = 0.08f;
        	break;
        default:
            System.out.println("Código inválido!");		
		}
		 float novoSalario = salario + (salario * reajuste);
		 
		 System.out.println("Nome do colaborador: " + nome);
	     System.out.println("Cargo: " + cargo);
	     System.out.printf("Salário: R$ %.2f%n", novoSalario);

	     scanner.close();
	}

}
