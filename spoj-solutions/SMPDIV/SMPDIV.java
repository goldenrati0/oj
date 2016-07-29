import java.util.*;
import java.lang.*;

class SMPDIV
{
 public static void main (String[] args) throws java.lang.Exception
 {
  
   Scanner ana = new Scanner(System.in);
   
   int testcase = ana.nextInt();
   int x,y;
   long n;
   
   for(int i=1; i<=testcase; i++){
     
     n = ana.nextLong();
     x = ana.nextInt();
     y = ana.nextInt();
     
     for(int j=1; j<n; j++){
       
       if(j%x == 0 && j%y != 0){
         
         System.out.println(j);
       }
     }
   }
 }
}