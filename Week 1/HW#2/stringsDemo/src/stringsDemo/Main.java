package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "      Bugün hava çok güzel.";

		System.out.println(mesaj);

		System.out.println("Eleman Sayısı : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!")); // Sonuna Ekleme
		System.out.println(mesaj.startsWith("A")); // Baş harf kontrol - boolean
		System.out.println(mesaj.endsWith("l")); // Son harf kontrol - boolean
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); // Baştan kaçıncı index
		System.out.println(mesaj.lastIndexOf('e')); // Sondan kaçıncı index

		String yeniMesaj = mesaj.replace(' ', '-'); // Replacing
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5)); // 2-5 index arası bulma
		for (String kelime : mesaj.split(" ")) { // belirli bir ifadeye göre ayırma
			System.out.println(kelime);

		}

		System.out.println(mesaj.toLowerCase()); // to lowercase
		System.out.println(mesaj.toUpperCase()); // to upper case
		System.out.println(mesaj.trim()); // baştan sondan boşluk kesme
	}

}
