package java_5;

import java.util.Scanner;

public class LCond_Switch_Exercico_7 {

	public static void main(String[] args) {
	Scanner lerScanner = new Scanner(System.in);
	
	int operacao; 
	float num1, num2, resul;
	
	System.out.println("Digite o 1º número: ");
	num1 = lerScanner.nextFloat();
	
	System.out.println("Digite o 2º número");
	num2 = lerScanner.nextFloat();
	
	System.out.println("*** Calculadora ***");
	System.out.println("Digite 1 para Soma (+).");
	System.out.println("Digite 2 para Subtração (-).");
	System.out.println("Digite 3 para Multiplicação (*).");
	System.out.println("Digite 4 para Divisão (/).");
	operacao = lerScanner.nextInt();
	
	switch (operacao) {
	case 1: {
	  System.out.printf("Resultado da Soma: %.1f", num1 + num2  );
	break;	
	}
    case 2: {
	   System.out.printf("Resultado da Subtração: %.1f ", num1 - num2);
	break;	
	}
    case 3: {
	   System.out.printf("Resultado da Multiplicação: %.1f ", num1 * num2);
	break;
    }
   case 4: {
	   System.out.printf("Resultado da Divisão: %.1f ", num1 / num2);
   break;
   }
   default:
	  System.out.println("Opção Inválida!");
   break;
	}
   lerScanner.close();
	}

}
