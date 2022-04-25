package aula04;

import java.util.Scanner;

public class existe_ou_não {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] conjunto = new int[10];
		for(int i=0; i <10;i++) {
			System.out.println("Digite um número de 0 a 100 para adicionar ao conjunto: ");
			conjunto[i] = sc.nextInt();
		}
		System.out.println("Digite um número para verificar se está no conjunto ou não: ");
		int verificador = sc.nextInt();
		int existe =0;
		for(int i =0; i<10; i++) {
			if(verificador == conjunto[i]) {
				existe++;
			}
		}
		if(existe > 0) {
			System.out.println("O valor existe no conjunto.");
		}
		else {
			System.out.println("O valor não existe no conjunto.");
		}
		}

	}


