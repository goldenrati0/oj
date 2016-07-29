import java.util.*;
import java.lang.*;

class DIVSUM
{
  public static void main (String[] args) throws java.lang.Exception
  {
    
    Scanner ana = new Scanner(System.in);
    
    int testCase = ana.nextInt();
    long total = 0;
    long x;
    
    for(int j=1; j<=testCase; j++){
      
      total = 0;
      x = ana.nextLong();
      for(int i=1; i<x; i++){
        
        if(x%i == 0){
          
          total = total + i;
        }
      }
      
      System.out.println(total);
    }
  }
}