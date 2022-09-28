package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "The weather is very nice today.";
		String newMessage = message.substring(0, 2); // Void sonuç vermez
		System.out.println(newMessage);
		String newMessage2 = giveCity(); // Int kabul etmez string kabul eder.
		int number = addition(5, 7);
		int sum = addition2(2, 3, 4, 6);
		System.out.println(sum);
	}

	public static void add() {
		System.out.println("Added");
	}

	public static void delete() {
		System.out.println("Deleted");
	}

	public static void update() {
		System.out.println("Updated");
	}

	public static int addition(int number1, int number2) {
		return number1 + number2;
	}

	public static int addition2(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

	public static String giveCity() {
		return "Ankara";
	}
}
