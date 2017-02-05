import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Scanner ana = new Scanner(System.in);

		boolean[] primes = new boolean[3001];
		sieve(primes);

		int num = ana.nextInt();
		int count = 0;

		for(int i=2; i<=num; i++) {

			if(numberOfDivisor(i, primes)) {
				count++;
			}
		}

		System.out.println(count);

	}

	private static void sieve(boolean[] primes) {

		Arrays.fill(primes, true);

		for(int i=2; i*i<=primes.length; i++) {

			if(primes[i]) {

				for(int j=i*2; j<=primes.length; j+=i) {
					primes[j] = false;
				}
			}
		}
	}

	private static boolean numberOfDivisor(int num, boolean[] primes) {

		int count = 0;

		for(int i=2; i<=num/2; i++) {

			if(num%i == 0 && primes[i])
				count++;
		}

		if(count==2)
			return true;
		else
			return false;
	}
}