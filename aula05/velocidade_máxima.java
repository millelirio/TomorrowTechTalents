package aula05;

import java.util.Scanner;

public class velocidade_máxima {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a velocidade máxima permitida na avenida: ");
		float veloc_max = sc.nextFloat();
		System.out.println("Digite a velocidade em que o motorista estava: ");
		float veloc_motor = sc.nextFloat();
		float veloc_multa = veloc_motor - veloc_max;
		if(veloc_multa <= 10) {
			System.out.println("O motorista deve pagar 50 reais de multa!");
		}
		else if(veloc_multa >=11 && veloc_multa<=30) {
			System.out.println("O motorista deve pagar 100 reais de multa!");
		}
		else{
			System.out.println("O motorsita deve pagar 200 reais de multa!");
		}
	}

}
