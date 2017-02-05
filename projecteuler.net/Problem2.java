package archive;

public class Problem2 {

	public static void main(String[] args) {
		
		long totalSum = 0;

		long current = 1;
		long prev = 1;
		long prevPrev = 0;

		while (current <= 4000000) {
			
			if(current%2 == 0)
				totalSum += current;

			prevPrev = prev;
			prev = current;
			current = prev + prevPrev;
		}
		
		System.out.print(totalSum);
	}
}
