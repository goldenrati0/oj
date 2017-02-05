import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner ana = new Scanner(System.in);
 
		int test = ana.nextInt();
 
		for(int tc=1; tc<=test; tc++) {
 
			long s = ana.nextLong();
			long e = ana.nextLong();
			int n = ana.nextInt();
			boolean[] flags = new boolean[n];
			Arrays.fill(flags, false);
 
			for(int i=0; i<n; i++) {
 
				long x = ana.nextLong();
				long y = ana.nextLong();
 
				if(x<=s) {
 
					if(y<=e)
						flags[i] = true;
					else
						flags[i] = false;
				} else if(x>=e) {
 
					flags[i] = true;
				}
			}
 
			if(check(flags))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
 
	private static boolean check(boolean[] flags) {
 
		for(int i=0; i<flags.length; i++) {
 
			if(!flags[i])
				return false;
		}
 
		return true;
	}
} 