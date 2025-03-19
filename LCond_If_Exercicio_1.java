package java_5;

import java.util.Scanner;

public class LCond_If_Exercicio_1 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		int numA, numB, numC, soma;
		
		System.out.println("Digite o número de A: ");
		numA = lerScanner.nextInt();
		
		System.out.println("Digite o número de B: ");
		numB = lerScanner.nextInt();
		
		System.out.println("Digite o número de C: ");
		numC = lerScanner.nextInt();
		
		soma = numA + numB;
		
		if (soma > numC ) {
			System.out.println("A soma de A + B é Maior do que C. ");
		}else if (soma < numC) {
			System.out.println("A soma de A + B é Menor do que C. ");
		}else {
			System.out.println("A soma de A + B é Igual do que C. ");
		}
		
		lerScanner.close();
	}
}
