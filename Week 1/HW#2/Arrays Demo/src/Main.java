
public class Main {

	public static void main(String[] args) {
		String[] students = new String[4];
		students[0] = "Ayse";
		students[1] = "Fatma";
		students[2] = "Hayriye";
		students[3] = "Alper";
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println("-------------------------");
		for (String student : students) {
			System.out.println(student);
		}
	}
}
