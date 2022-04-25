package aula04;
import java.util.Random;

public class random_numbers {
	
	public static void main(String[] args) {
		Random random = new Random();
		double[] number = new double[10];
		for(int i=0; i <10; i++) {
			number[i] = random.nextDouble(100);
		}
		for(int i=0; i <10; i++) {
			System.out.println(number[i]);
		}
		
		
	}

}
