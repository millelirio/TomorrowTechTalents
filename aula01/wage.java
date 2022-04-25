package aula01;

import java.util.Scanner;

public class wage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cálculo de um salário com reajuste de 7%!!");
		System.out.println("Digite o valor do salário base: ");
		float wage = sc.nextFloat();
		System.out.printf("O salário sem reajuste: %.2f reais. \nO salário com reajuste de 7%%: %.2f reais.", wage, wage + wage*0.7);

	}

}
