package aula02;

import java.util.Scanner;

public class praias_distancia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] praia = new String[5];
		float[] distancia = new float[5];
		for(int i=0; i<5; i++) {
			System.out.printf("Digite o nome da praia %d",i+1);
			praia[i]= sc.nextLine();
			System.out.printf("Digite a dist�ncia da praia %d at� o hotel em km:", i+1);
			distancia[i] = sc.nextFloat();
			sc.nextLine();
	}
		int praia_mais_de_10km_menos_de_15km= 0;
		String maisdistante = "";
		int distancia_maior = 0;
		float soma_distancia= 0;
		for(int i=0; i<5; i++) {
			if(distancia[i] > 10 && distancia[i] <15 ) {
				praia_mais_de_10km_menos_de_15km++;	
		}
			if(distancia[i]>distancia_maior) {
				maisdistante = praia[i];
			}
			soma_distancia =+ distancia[i];
		}
		System.out.printf("A praia mais distante �: %s \n %d praias est�o a mais de 10km e a menos de 15 km de dist�ncia do hotel \n A dist�ncia m�dia das praias � de: %.2f km",maisdistante,praia_mais_de_10km_menos_de_15km,soma_distancia/5 );
	}

}
