//Status: RE
import java.util.*;
import java.lang.*;

class TEST{
 public static void main (String[] args) throws java.lang.Exception{
  
   Scanner ana = new Scanner(System.in);
   int x = 0;
   
   while((x = ana.nextInt()) != 42){

   	System.out.println(x);
   }

   while(true){
   	ana.nextInt();
   }
 }
}