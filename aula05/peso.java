package aula05;

import java.util.Scanner;

public class peso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        float[] peso = new float[7];
        int i = 0;
        for(i =0; i<7 ; i++) {
        	System.out.printf("Digite o peso da pessoa %d:",i+1);
        	peso[i] = sc.nextFloat();
        }
        int count = 0;
        float soma_pesos = 0;
        for ( i=0; i < 7 ; i++) {
        	if(peso[i] > 90) {
        		count++;
        	}
        	soma_pesos =+ peso[i];
        }
        float media_pesos = soma_pesos/7;
        System.out.printf(" %d pessoas tem mais que 90 kgs \n A media dos pesos é %.2f", count, media_pesos);
	}

}
