import java.util.*;
import java.lang.*;

class PRIME1
{
  public static void main (String[] args) throws java.lang.Exception
  {
    
    Scanner ana = new Scanner(System.in);
    
    int testCase = ana.nextInt();
    long m,n;
    
    for(int i=1; i<=testCase; i++){
      
      m = ana.nextLong();
      n = ana.nextLong();
      boolean isPrime;
      
      for(long j=m; j<=n; j++){
        
        isPrime = true;
        
        for(long k=2; k<=j-1; k++){
          
          if(k == j){
            
            continue;
          }else if(j%k == 0){
            
            isPrime = false;
          }
        }
        
        if(isPrime){
          
          System.out.println(j);
        }
      }
    }
  }
}