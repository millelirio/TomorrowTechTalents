package aula04;

import java.util.Scanner;

public class discagem_interurbana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o DDD que deseja procurar: ");
		int DDD = sc.nextInt();
		switch(DDD) {
		case 61:
			System.out.println("Bras�lia");
			break;
		case 71:
			System.out.println("Salvador");
			break;
		case 11:
			System.out.println("S�o Paulo");
			break;
		case 21:
			System.out.println("Rio de Janeiro");
			break;
		case 32:
			System.out.println("Juiz de Fora");
			break;
		case 19:
			System.out.println("Campinas");
			break;
		case 27:
			System.out.println("Vit�ria");
			break;
		case 31:
			System.out.println("Belo Horizonte");
			break;
		default:
			System.out.println("DDD n�o cadastrado!");
			break;
		}
	}

}
