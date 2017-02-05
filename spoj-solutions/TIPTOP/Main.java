import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner ana = new Scanner(System.in);

		long test = ana.nextLong();

		for(long testC=1; testC<=test; testC++) {

			long x = ana.nextLong();

			long sqrt = (long) (Math.floor(Math.sqrt(x)));

			if(sqrt*sqrt == x)
				System.out.println("Case " + testC + ": " + "Yes");
			else
				System.out.println("Case " + testC + ": " + "No");
		}
	}
}