import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner ana = new Scanner(System.in);

		int a = ana.nextInt();
		int b = ana.nextInt();
		int c = a + b;

		String x = String.valueOf(a).replaceAll("0", "");
		String y = String.valueOf(b).replaceAll("0", "");
		String z = String.valueOf(c).replaceAll("0", "");

		int sum = Integer.parseInt(x) + Integer.parseInt(y);

		if(Integer.parseInt(z) == sum)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}