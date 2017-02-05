import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner ana = new Scanner(System.in);

		int test = ana.nextInt();

		for(int tc=0; tc<test; tc++) {

			int n = ana.nextInt();
			n = n-1;
			int count = (n*(n+1))/2;

			System.out.println(count);
		}
	}
}