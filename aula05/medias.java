package aula05;

import java.util.Scanner;

public class medias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha = 0;
		do { 
			System.out.printf(" MENU \n 1.Média Aritimética \n 2.Média Ponderada \n 3.Sair \n");
			escolha = sc.nextInt();
			if( escolha <1 || escolha >3 ) {
				System.out.println("Opção invalida!!");	
			}
			else if(escolha == 1) {
				System.out.println("Insira a nota 1:");
				float nota1 = sc.nextFloat();
				System.out.println("Insira a nota 2: ");
				float nota2 = sc.nextFloat();
				float media_arit = nota1+nota2/2;
				System.out.printf("A média aritmética das notas foi: %.2f \n", media_arit);
			}
			else if(escolha ==2) {
				System.out.println("Insira a nota 1: ");
				float nota1 = sc.nextFloat();
				System.out.println("Insira o peso da nota 1: ");
				float peso1 = sc.nextFloat();
				System.out.println("Insira a nota 2: ");
				float nota2 = sc.nextFloat();
				System.out.println("Insira o peso da nota 2: ");
				float peso2 = sc.nextFloat();
				System.out.println("Insira a nota 3: ");
				float nota3 = sc.nextFloat();
				System.out.println("Insira o peso da nota 3: ");
				float peso3 = sc.nextFloat();
				float media_pond = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1+peso2+peso3);
				System.out.printf("A média ponderada das notas foi: %.2f \n", media_pond);
			}
		}
		while(escolha != 3);
	}

}
