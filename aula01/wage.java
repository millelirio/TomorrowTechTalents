package aula01;

import java.util.Scanner;

public class wage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("C�lculo de um sal�rio com reajuste de 7%!!");
		System.out.println("Digite o valor do sal�rio base: ");
		float wage = sc.nextFloat();
		System.out.printf("O sal�rio sem reajuste: %.2f reais. \nO sal�rio com reajuste de 7%%: %.2f reais.", wage, wage + wage*0.7);

	}

}
