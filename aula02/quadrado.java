package aula02;

import java.util.Scanner;

public class quadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numero = new int[4];
		for( int i=0; i<4; i++) {
			System.out.printf("Insira o %d número:", i+1);
			numero[i]= sc.nextInt();
		}
		int[] quadrado = new int[4];
		int soma_quadrados = 0;
		for( int i=0; i<4; i++) {
			quadrado[i] =numero[i]*numero[i];
			soma_quadrados = soma_quadrados + quadrado[i];
		}
		System.out.println("O quadrado dos números fornecidos é:");
		for( int i=0; i<4; i++) {
			System.out.print(quadrado[i]+" ");
		}
		System.out.println("");
		System.out.printf("A soma dos quadrados é: %d", soma_quadrados);
	}

}
