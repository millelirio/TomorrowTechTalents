package aula01;

import java.util.Scanner;

public class new_car {
	public static final double DISTRIBUIDOR = 0.28;
	public static final double TAX = 0.45;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o custo de fábrica do carro:");
		float factory_cost = sc.nextFloat();
		System.out.printf("O custo ao consumidor final é de %.2f reais", (factory_cost + factory_cost * DISTRIBUIDOR + factory_cost* TAX));
		
		
	}

}
