package aula01;

import java.util.Scanner;

public class sale_value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o  preço de custo do produto: ");
		float cost_price = sc.nextFloat();
		System.out.println("Digite o taxa de acréssimo na venda:");
		float tax = sc.nextFloat();
		System.out.printf("O produto com o preço de custo de %.2f reais e taxa de %.2f %%"
				+ " tem seu valor de venda de %.2f reais ", cost_price, tax, cost_price + cost_price*tax);
	}

}
