//http://www.spoj.com/problems/PRINT/
// Status: TLE
import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner ana = new Scanner(System.in);

		int testCase = ana.nextInt();

		for(int testCase_i=0; testCase_i<testCase; testCase_i++){

			int from = ana.nextInt();
			int to = ana.nextInt();

			for(int i=from; i<=to; i++){

				if(isPrime(i))
					System.out.println(i);
			}

		}
	}

	public static boolean isPrime(int x){

		if(x<=1)
			return true;

		for(int i=2; i*i<=x; i++){

			if(x%i == 0)
				return false;
		}

		return true;
	}
}