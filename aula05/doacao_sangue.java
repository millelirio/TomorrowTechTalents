package aula05;

import java.util.Scanner;

public class doacao_sangue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira sua idade:");
		int idade = sc.nextInt();
		if( idade >=18 && idade <=67) {
			System.out.println("Voc� pode doar sangue!!");
		}
		else {
			System.out.println("Voc� n�o pode doar sangue!!");
		}
	}

}
