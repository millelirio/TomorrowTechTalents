package aula02;

import java.util.Scanner;

public class cadastro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo:");
		String nome = sc.nextLine();
		System.out.println("Digite seu endereço:");
		String endereco = sc.nextLine();
		System.out.println("Digite seu CEP:");
		String CEP = sc.nextLine();
		System.out.println("Digite seu telefone");
		String telefone = sc.nextLine();
		System.out.printf("Nome: %s \n Endereço: %s \n CEP: %s Telefone: %s",nome, endereco,CEP,telefone);
		
	}

}
