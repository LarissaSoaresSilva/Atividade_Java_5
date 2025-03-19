package java_5;

import java.util.Scanner;

public class LCon_If_Exercico_2 {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		int num,resul;
		
		System.out.println("Digite um número: ");
		num = lerScanner.nextInt();
		
		resul = num % 2;
		
		if (resul == 0) {
		 if(num > 0) {
			System.out.printf("O número %d é par e positivo. ", num);
		}else if (num == 0) {
			System.out.printf("O número %d é par e neutro. ", num);
		}else {
			System.out.printf("O número %d é par e negativo. ", num);
		}
		}else if (num >0 ){
			System.out.printf("O número %d é ímpar e positivo. ", num);
		}else {
			System.out.printf("O número %d é ímpar e negativo. ", num);
		}
		 
		lerScanner.close();
	}
}
