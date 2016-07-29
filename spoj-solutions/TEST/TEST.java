import java.util.*;
import java.lang.*;

class TEST
{
 public static void main (String[] args) throws java.lang.Exception
 {
  
   Scanner ana = new Scanner(System.in);
   
   int x = ana.nextInt();
   
   if(x!=42){
     System.out.println(x);
   }else{
     System.exit(0);
   }
 }
}