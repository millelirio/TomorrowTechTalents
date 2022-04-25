package aula01;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int number1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int number2 = sc.nextInt();
		System.out.printf("%d + %d = %d \n", number1, number2, number1+number2);
		System.out.printf("%d - %d = %d \n", number1, number2, number1-number2);
		System.out.printf("%d * %d = %d \n", number1, number2, number1*number2);
		if(number2 == 0) {
			System.out.println("Não é possível dividir um número por 0");
		}
		else {
			System.out.printf("%d / %d = %.2f", number1, number2, (float)number1/number2);
			
		}
		
	}

}
