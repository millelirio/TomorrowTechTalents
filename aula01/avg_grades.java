package aula01;

import java.util.Scanner;

public class avg_grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do aluno:");
		String name = sc.nextLine();
		System.out.println("Digite a primeira nota:");
		float grade1 = sc.nextFloat();
		System.out.println("Digite a segunda nota:");
		float grade2 = sc.nextFloat();
		System.out.println("Digite a terceira nota:");
		float grade3 = sc.nextFloat();
		
		System.out.printf("O aluno %s teve uma média de %.2f no semestre.", name,(float)(grade1+grade2+grade3)/3);
		
	}

}
