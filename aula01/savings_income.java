package aula01;

import java.util.Scanner;

public class savings_income {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor depositado:");
		float deposited_amount = sc.nextFloat();
		System.out.printf("O valor com rendimento após um mês foi: %.2f", deposited_amount + deposited_amount*0.7);

	}

}
