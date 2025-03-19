package java_5;

import java.util.Scanner;

public class LCond_Switch_Exercicio_6 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		String nome;
		int cargo;
		float salario;
		
		System.out.println("Digite seu Nome:");
		lerScanner.skip("\\R?");
		nome = lerScanner.nextLine();
			
		System.out.println("Digite qual seu Salário:");
		salario = lerScanner.nextFloat();
		
		System.out.println("*** Consulta de Novo Sálario ***");
		System.out.println("\nDigite 1 para o cargo de Gerente.");
		System.out.println("Digite 2 para o cargo de Vendedor.");
		System.out.println("Digite 3 para o cargo de Supervisor.");
		System.out.println("Digite 4 para o cargo de Motorista.");
		System.out.println("Digite 5 para o cargo de Estoquista.");
		System.out.println("Digite 6 para o cargo de Técnico de TI.");
		cargo = lerScanner.nextInt();
		
		switch (cargo) {
		
		case 1: 
			System.out.printf("Nome do Colaborador: %s. ", nome);
			System.out.println("\nCargo: Gerente.");
			System.out.printf("Salário: %.2f \n", salario * 1.1);
		break;
			
		case 2: 
			System.out.printf("Nome do Colaborador: %s. ", nome);
			System.out.println("\nCargo: Vendedor.");
			System.out.printf("Salário: %.2f \n", salario * 1.07 );
		break;
		case 3: 
			System.out.printf("Nome do Colaborador: %s. ", nome);
			System.out.println("\nCargo: Supervisor.");
			System.out.printf("Salário: %.2f \n", salario * 1.09);
		break;
			
		case 4: 
			System.out.printf("Nome do Colaborador: %s. ", nome);
			System.out.println("\nCargo: Motorista.");
			System.out.printf("Salário: %.2f \n", salario * 1.06);
		break;
			
		case 5: 
			System.out.printf("Nome do Colaborador: %s. ", nome);
			System.out.printf("\nCargo: Estoquista");
			System.out.printf("\nSalário: %.2f ", salario * 1.05);
		break;
			
		case 6: 
			System.out.printf("Nome do Colaborador: %s. ", nome);
			System.out.println("\nCargo: Técnico de TI.");
			System.out.printf("Salário: %.2f \n", salario * 1.08);
		break;
			
		default:
			System.out.println("Opção Inválida!");
		break;
		}
         lerScanner.close();
	}

}
