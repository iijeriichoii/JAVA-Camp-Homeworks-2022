
public class Main {

	public static void main(String[] args) {
		int number1 = 58;
		int number2 = 25;
		int number3 = 2;
		int gretaerNumber = number1;

		if (gretaerNumber < number2) {
			gretaerNumber = number2;
		} else if (gretaerNumber < number3) {
			gretaerNumber = number3;
		}
		System.out.println("The greater number is:" + gretaerNumber);
	}

}
