package aula01;
import java.util.Scanner;

public class avg_consumption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Consumo m�dio de um autom�vel!!");
		System.out.println("Digite a dist�ncia total percorrida pelo autom�vel em km:");
		float distance = sc.nextFloat();
		System.out.println("Digite o total de combust�vel gasto em litros: ");
		float spent_fuel = sc.nextFloat();
		System.out.printf("Este autom�vel tem o consumo m�dio de %.2f km/l", distance/spent_fuel);

	}

}
