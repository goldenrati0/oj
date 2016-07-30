//Status: TLE
import java.util.Scanner;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args){

		Scanner ana = new Scanner(System.in);

		int testCase = ana.nextInt();
		ana.nextLine();
		BigInteger x;
		BigInteger increment = new BigInteger("1");

		for(int testCase_i=0; testCase_i<testCase; testCase_i++){

			String num = ana.nextLine();

			x = new BigInteger(num);
			x = x.add(increment);

			while(!isPalindrome(x)){
				x = x.add(increment);
			}

			System.out.println(x);
		}
	}

	public static boolean isPalindrome(BigInteger x){

		String xToString = "" + x;

		return xToString.equals(new StringBuilder(xToString).reverse().toString());
	}
}