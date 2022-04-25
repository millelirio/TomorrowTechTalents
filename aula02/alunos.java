package aula02;

import java.util.Scanner;

public class alunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] aluno = new String[4];
		float[] nota = new float[4];
		for(int i=0; i<4; i++) {
		System.out.printf("Digite o nome do aluno %d:", i+1);
		aluno[i]=sc.nextLine();	
        System.out.printf("Digite a nota do aluno %d:", i+1);
        nota[i]=sc.nextFloat();
        sc.nextLine();
	}
		System.out.println("Aluno \t \t Nota");
		System.out.println("========= \t ====");
		for(int i=0; i<4; i++){
			System.out.printf("%s \t\t %.1f \n", aluno[i], nota[i]);
		
}
}
	}