package aula05;

import java.util.Scanner;

public class cigarettes_spending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de anos desde que voc� comecou a fumar: ");
		float years = sc.nextFloat();
		System.out.println("Digite o n�mero de cigarros fumados por dia: ");
		int cigarettes_per_day = sc.nextInt();
		System.out.println("Digite o pre�o de uma carteira com 20 cigarros: ");
		float price_cigarettes = sc.nextFloat();
		float spending = 365*years*cigarettes_per_day*price_cigarettes; 
		System.out.printf("Uma pessoa que fuma h� %.1f anos uma quantidade de %d cigarros por dia j� gastou %.2f reais.", years, cigarettes_per_day,spending);
	}

}
