import java.util.*;

public class Main{
  public static long a, b, c, d, e, f;
  
  public static long fn( long n ) {
    if( n == 0 ) return a;
    else if( n == 1 ) return b;
    else if( n == 2 ) return c;
    else if( n == 3 ) return d;
    else if( n == 4 ) return e;
    else if( n == 5 ) return f;
    return( fn(n-1) + fn(n-2) + fn(n-3) + fn(n-4) + fn(n-5) + fn(n-6) );
  }
  
  public static void main(String[] args) {
    long n, caseno = 0, cases;
    Scanner ana = new Scanner(System.in);
    cases = ana.nextInt();
    while( cases>caseno ) {
      a = ana.nextLong();
      b = ana.nextLong();
      c = ana.nextLong();
      d = ana.nextLong();
      e = ana.nextLong();
      f = ana.nextLong();
      n = ana.nextLong();
      System.out.printf("Case %d: %d\n", ++caseno, fn(n) % 10000007);
    }
  }
}