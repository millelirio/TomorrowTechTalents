package aula01;

public class days_of_life {

	public static void main(String[] args) {
		int age_year = 24; // idade da pessoa em anos
		int age_month = 5; //idade da pessoa em meses
		int age_days = 8; //idade da pessoa em dias
		int days_of_life = age_year*365 + age_month*30 + age_days; 
		System.out.printf("Uma pessoa com %d anos %d meses e %d dias já viveu %d dias,",age_year, age_month, age_days, days_of_life);
	}

}
