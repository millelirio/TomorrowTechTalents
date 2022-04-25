package aula04;

import java.util.Scanner;

public class maior_valor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas da matriz:");
		int NumeroLinhas = sc.nextInt();
		System.out.println("Digite a quantidade de colunas da matriz:");
		int NumeroColunas = sc.nextInt();
		double[][] matriz = new double[NumeroLinhas][NumeroColunas];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.println("Digite um valor para armazenar:"); 
				matriz[i][j] = sc.nextDouble();
				
			}
		}
		double maiorvalor = 0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(maiorvalor < matriz[i][j]){
					maiorvalor = matriz[i][j];
				}
				
				
			}
		
		}
			System.out.printf("O maior valor armazenado foi: %.2f", maiorvalor);

	}

}
