import java.util.Scanner;

/**
* Got help from various Online Sources
* and
* Implemented one of those Algorithms
**/

public class LightOJ_HexaBonacci_1006 {
 public static void main(String[] args) {

  int a, b, c, d, e, f, x;
  int[] dp = new int[10_001];
  int n, caseno = 0, cases;
  
  cases = STDIN_SCANNER.nextInt();
  
  while(cases-- != 0) {
  
   a = STDIN_SCANNER.nextInt();
   b = STDIN_SCANNER.nextInt();
   c = STDIN_SCANNER.nextInt();
   d = STDIN_SCANNER.nextInt();
   e = STDIN_SCANNER.nextInt();
   f = STDIN_SCANNER.nextInt();
   n = STDIN_SCANNER.nextInt();
  
   dp[0] = a % 10_000_007;
   dp[1] = b % 10_000_007;
   dp[2] = c % 10_000_007;
   dp[3] = d % 10_000_007;
   dp[4] = e % 10_000_007;
   dp[5] = f % 10_000_007;
  
   x = dp[0] + dp[1] + dp[2] + dp[3] + dp[4];
  
   for(int i = 6; i <= n; i++) {
    x = x + dp[i - 1];
    dp[i] = x % 10_000_007;
    x = x - dp[i - 6];
   }
  
   System.out.println("Case " + ++caseno + ": " + dp[n]);
  }
 }

 public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}