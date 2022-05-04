package aula05;

import java.util.Scanner;

public class pesquisa_sastifacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] idade = new int[5];
		int[] opiniao = new int[5];
		int i = 0;
		for(i=0; i<5; i++) {
			System.out.println("Insira sua idade: ");
			idade[i] = sc.nextInt();
			System.out.printf("Opinião sobre o filme: \n 1.Regular \n 2.Bom \n 3.Ótimo \n");
			opiniao[i] = sc.nextInt();
		}
		float soma_idade_otimo =0;
		int contador_pessoas_regular =0;
		int contador_pessoas_bom =0;
		int contador_pessoas_otimo =0;
		
		
		for(i=0; i<5; i++) {
			if(opiniao[i]==1) {
				contador_pessoas_regular++;
			}
			if(opiniao[i]==2) {
				contador_pessoas_bom++;
			}
			if(opiniao[i]==1) {
				soma_idade_otimo =+ idade[i];
				contador_pessoas_otimo++;
			}
			
		}
		float media_otimo = soma_idade_otimo/contador_pessoas_otimo;
		float percent_bom = (contador_pessoas_bom*100)/5;
		System.out.printf("A média da idade das pessoas que responderam otimo foi de %.2f \n A quantidade de pessoas que responderam regular foi: %d \n A percentagem de pessoas que responderam bom foi de %.2f", media_otimo, contador_pessoas_regular, percent_bom);
	}

}
