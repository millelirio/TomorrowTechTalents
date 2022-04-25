package aula01;
import java.lang.Math. *;
import java.util.Scanner;

public class circle_area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do raio do circulo em cm: ");
		float raio = sc.nextFloat();
		System.out.printf("A área desse circulo é: %.2f cm^2 ", Math.PI*raio*raio );

	}

}
