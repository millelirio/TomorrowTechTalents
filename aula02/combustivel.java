package aula02;

import java.util.Scanner;

public class combustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o tempo gasto na viagem em hrs: ");
		float tempo = sc.nextFloat();
		System.out.println("Insira a velocidade m�dia que ser� utilizada na viagem em km/h: ");
		float veloc_med = sc.nextFloat();
		float distancia = tempo*veloc_med;
		System.out.printf("A viagem tem uma dist�ncia de %.2f km e assim ser� gasto %.2f litros de gasolina", distancia, distancia/12);
				
	}

}
