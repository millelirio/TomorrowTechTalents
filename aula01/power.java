package aula01;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa para determinar a quantidade de cavalos!!");
		System.out.println("Digite a massa m em kg que ser� levantada: ");
		float m = sc.nextFloat();
		System.out.println("Digite a altura h em m que ser� levantada: ");
		float h = sc.nextFloat();
		System.out.println("Digite o tempo em s que ser� levantada: ");
		float t = sc.nextFloat();
		
		System.out.printf("A quantidade de cavalos precisos ser� de: %.0f cv ", (((m*h)/t)/745.6999));
	}

}
