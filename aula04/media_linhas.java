package aula04;

import java.util.Scanner;

public class media_linhas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas da matriz:");
		int NumeroLinhas = sc.nextInt();
		System.out.println("Digite a quantidade de colunas da matriz:");
		int NumeroColunas = sc.nextInt();
		int[][] matriz = new int[NumeroLinhas][NumeroColunas];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.printf("Digite um valor para armazenar na matriz[%d][%d]:",i,j); 
				matriz[i][j] = sc.nextInt();
				
			
		}
			}
		System.out.println("Digite o número da linha que você deseja tirar a média:");
		int linha_media= sc.nextInt();
		float media =0;
		for(int j=0; j <NumeroColunas; j++) {
			media = media + matriz[linha_media][j];
			
		}
		System.out.printf("A média da linha %d é %.2f", linha_media,media/NumeroColunas);
	}

}
