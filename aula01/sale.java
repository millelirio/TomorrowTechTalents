package aula01;

import java.util.Scanner;

public class sale {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor total da compra:");
		float value_total = sc.nextFloat();
		System.out.printf("A compra pode ser paga em 5 x %.2f reais", value_total/5);

	}

}
