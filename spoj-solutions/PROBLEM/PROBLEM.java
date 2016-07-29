import java.util.*;
import java.lang.*;

class PROBLEM
{
  public static void main (String[] args) throws java.lang.Exception
  {
    
    Scanner ana = new Scanner(System.in);
    
    int testCase = ana.nextInt();
    String blank = ana.nextLine();
    
    int[] numberOfCircle = { 1, 0, 0, 0, 0, 0, 1, 0, 2, 1 };
    String x = "";
    
    for(int i=1; i<=testCase; i++){
      
      x = ana.nextLine();
      int totalCircle = 0;
      
      for(int j=0; j<x.length(); j++){
        
        int instant = Integer.parseInt(String.valueOf(x.charAt(j)));
        totalCircle = totalCircle + numberOfCircle[instant];
      }
      
      System.out.println(totalCircle);
    }
  }
}