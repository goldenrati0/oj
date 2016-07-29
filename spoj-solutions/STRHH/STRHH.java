import java.util.*;
import java.lang.*;

class STRHH
{
  public static void main (String[] args) throws java.lang.Exception
  {
    
    Scanner ana = new Scanner(System.in);
    
    int testcase = ana.nextInt();
    String blank =ana.nextLine();
    
    for(int i=1; i<=testcase; i++){
      
      String x = ana.nextLine();
      String fOut = "";
      
      char[] firstHalf = x.toCharArray();
      
      for(int j=0; j<x.length()/2; j=j+2){
        
        fOut = fOut + firstHalf[j];
      }
      System.out.println(fOut);
    }
  }
}