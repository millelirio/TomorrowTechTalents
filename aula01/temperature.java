package aula01;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em graus celsius que deseja converter: ");
		float temperature = sc.nextFloat();
		System.out.printf(" %.2f �C convertido para escala Kelvin �: %.2f K \n", temperature, temperature+273.15);
		System.out.printf(" %.2f �C convertido para escala Fahrenheit �: %.2f F \n", temperature, (temperature*1.8)+32);
		System.out.printf(" %.2f �C convertido para escala Rankine �: %.2f Ra \n", temperature, (temperature*1.8)+32+459.67);
		System.out.printf(" %.2f �C convertido para escala R�aumur �: %.2f Re \n", temperature, temperature*0.8);
		
		
		

	}

}
