package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int searchingFor = 6;
		boolean check = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == searchingFor) {
				check = true;
				break;
			}
		}
		if (check) {
			System.out.println("The number found in array.");
		} else {
			System.out.println("The number not found in array.");
		}
	}
}
