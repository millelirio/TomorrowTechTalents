package aula01;
import java.util.Scanner;

public class avg_consumption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Consumo médio de um automóvel!!");
		System.out.println("Digite a distância total percorrida pelo automóvel em km:");
		float distance = sc.nextFloat();
		System.out.println("Digite o total de combustível gasto em litros: ");
		float spent_fuel = sc.nextFloat();
		System.out.printf("Este automóvel tem o consumo médio de %.2f km/l", distance/spent_fuel);

	}

}
