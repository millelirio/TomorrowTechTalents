package aula04;

import java.util.Scanner;

public class matriz_2x5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] matriz = new double[2][5];
		for(int i=0; i<2; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("Digite um valor para armazenar:"); 
				matriz[i][j] = sc.nextDouble();
				
			}
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(matriz[i][j]+ " "); 
				
			}
			System.out.println(" ");
			
		}
		

	}

}
