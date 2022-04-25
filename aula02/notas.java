package aula02;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do aluno:");
		String nome = sc.nextLine();
		System.out.println("Digite a turma que o aluno é:");
		String turma =sc.nextLine();
		System.out.println("Digite a primeira nota:");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a segunda nota:");
		float nota2 = sc.nextFloat();
		System.out.println("Digite a terceira nota:");
		float nota3 = sc.nextFloat();
		float media = (nota1+nota2+nota3)/3;
		System.out.printf("A média do aluno %s da turma %s foi: %.2f", nome,turma,media);
	}

}
