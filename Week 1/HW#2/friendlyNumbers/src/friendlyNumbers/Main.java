package friendlyNumbers;

public class Main {

	public static void main(String[] args) {
		int number_1 = 220;
		int number_2 = 284;
		int total_1 = 0;
		int total_2 = 0;
		for (int i = 1; i < number_1; i++) {
			if (number_1 % i == 0) {
				total_1 += i;
			}
		}
		for (int i = 1; i < number_2; i++) {
			if (number_2 % i == 0) {
				total_2 += i;
			}
		}
		if (total_2 == number_1 && total_1 == number_2) { // && and || or
			System.out.println("Friendly Numbers");
		} else {
			System.out.println("Not Frieandly Numbers");
		}
	}

}
