package aula04;

import java.util.Scanner;

public class operacoes_matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[3][5];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.printf("Digite um valor para preencher [%d][%d]", i,j);
				matriz[i][j] = sc.nextInt();
			}
		}
			int[] soma_linhas = new int[3];
			int[] soma_colunas = new int[5];
			for(int i=0; i<matriz.length; i++) {
				for(int j=0; j<matriz[i].length; j++) {
					soma_linhas[i]= soma_linhas[i] + matriz[i][j];
					soma_colunas[j] = soma_colunas[j]+ matriz[i][j];
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println(" ");
		}	
			System.out.println("A soma das linhas é:");
			for(int i=0; i<matriz.length; i++) {
					System.out.println(soma_linhas[i]);
	}
			System.out.println("A soma das colunas é:");
			for(int j=0; j<5; j++) {
				System.out.print(soma_colunas[j] +" ");
			}
			
			}
}
