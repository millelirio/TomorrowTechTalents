package aula04;

import java.util.Scanner;

public class soma_matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas da matriz:");
		int NumeroLinhas = sc.nextInt();
		System.out.println("Digite a quantidade de colunas da matriz:");
		int NumeroColunas = sc.nextInt();
		int [][] matriz = new int[NumeroLinhas][NumeroColunas];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.printf("Digite um valor para armazenar em [%d][%d]:",i,j); 
				matriz[i][j] = sc.nextInt();	
			}
		}
		int somador = 0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				somador = somador + matriz[i][j];
			}
		}
		System.out.printf("A soma dos valores da matriz é: %d",somador);
			}
		
		
	}


