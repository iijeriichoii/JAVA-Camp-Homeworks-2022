package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int searchingFor = 2;
		boolean check = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == searchingFor) {
				check = true;
				break;
			}
		}
		if (check) {
			mesajVer("Sayı mevcuttur:" + searchingFor);
		} else {
			mesajVer("Sayı mevcut değildir:" + searchingFor);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
