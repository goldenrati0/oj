import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner ana = new Scanner(System.in);

		String string = ana.nextLine();
		// String duplicate = string.toString();

		string = string.replaceAll("144", "A");
		string = string.replaceAll("14", "B");
		string = string.replaceAll("1", "C");

		if(blankCheck(string)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private static boolean blankCheck(String str) {

		for(int i=0; i<str.length(); i++) {

			if(str.charAt(i) != 'A' && str.charAt(i) != 'B' && str.charAt(i) != 'C')
				return false;
		}

		return true;
	}
}