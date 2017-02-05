import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner ana = new Scanner(System.in);

		int test = ana.nextInt();

		for(int testCase=1; testCase<=test; testCase++) {

			int n = ana.nextInt();
			int k = ana.nextInt();
			int s = 0;

			for(int i=0; i<n; i++) {

				s += ana.nextInt();
			}

			int totalMarks = k*(n+1);

			System.out.println("Case " + testCase + ": " + (totalMarks - s));
		}
	}
}