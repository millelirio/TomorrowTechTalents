package aula01;

import java.util.Scanner;

public class currency_conversion {
	public static final double COTA_EM_DOLAR =  0.21;
	public static final double COTA_EM_EURO = 0.20;
	public static final double COTA_EM_LIBRA = 0.16;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor em reais que deseja converter: ");
		double real = sc.nextDouble();
		System.out.printf("Conversão de moedas \n %.2f reais equivale à: \n %.2f dolares \n %.2f euros  \n %.2f libras", real, real*COTA_EM_DOLAR, real*COTA_EM_EURO, real*COTA_EM_LIBRA);
		
	}

}
