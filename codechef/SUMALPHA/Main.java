import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner ana = new Scanner(System.in);

		int test = ana.nextInt();
		ana.nextLine();

		for(int tc = 1; tc<=test; tc++) {

			String word = ana.nextLine();

			int sum = 0;

			for(int i=0; i<word.length(); i++) {

				sum += ((word.codePointAt(i)-97)%5);
			}

			System.out.println(sum);
		}
	}
}