import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner ana = new Scanner(System.in);

		int test = ana.nextInt();

		for(int testCase=1; testCase<=test; testCase++) {

			float a = ana.nextInt();
			float b = ana.nextInt();
			float c = ana.nextInt();
			float r = c/(a+b);
			float e = 0;
			
			if(a>b) {
				e = a-b;

			System.out.println((int)((a+e)*r));
			}
			if(b>a) {
				e = b-a;
				System.out.println((int)((a-e)*r));
			}
			if(b==a) {
				System.out.println((int)(a*r));
			}
			
					}
	}
}