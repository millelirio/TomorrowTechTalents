package aula01;

import java.util.Scanner;

public class horses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de cavalos comprados: ");
		int horses = sc.nextInt();
		System.out.printf("A quantidade de ferradura precisas é de %d ferraduras para os %d cavalos", horses*4, horses);
	}

}
