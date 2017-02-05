import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner ana = new Scanner(System.in);

		int testCase = ana.nextInt();
		
		StringBuilder x = new StringBuilder("");
		StringBuilder y = new StringBuilder("");

		for(int test=0; test<testCase; test++) {

			int a = ana.nextInt();
			int b = ana.nextInt();

			x = new StringBuilder("" + a);
			y = new StringBuilder("" + b);

			x = removeLeadingZeroes(x);
			y = removeLeadingZeroes(y);

			x = x.reverse();
			y = y.reverse();

			a = Integer.parseInt(x.toString());
			b = Integer.parseInt(y.toString());

			int sum = a+b;

			StringBuilder res = new StringBuilder("" + sum);
			res = res.reverse();
			res = removeLeadingZeroes(res);

			System.out.println(res);

		}
	}

	private static StringBuilder removeLeadingZeroes(StringBuilder stb) {

		while(stb.charAt(0) == '0') {

			stb = new StringBuilder( stb.substring(1) );
		}

		return stb;
	}
}