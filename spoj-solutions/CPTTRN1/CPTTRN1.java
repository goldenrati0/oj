import java.util.*;
import java.lang.*;

class CPTTRN1
{
 public static void main (String[] args) throws java.lang.Exception
 {
  
   Scanner ana = new Scanner(System.in);
   
   int testcase = ana.nextInt();
   int line, column;
   
   for(int i=1; i<=testcase; i++){
     
     line = ana.nextInt();
     column = ana.nextInt();
     
     if(column==1){
       
       for(int j=1; j<=line; j++){
         
         if(j%2 != 0){
           System.out.println("*");
         }else if(j%2 == 0){
           System.out.println(".");
         }
       }
     }else{
       
       for(int j=1; j<=line; j++){
         
         for(int k=1; k<=column; k++){
           
           if(j%2 != 0){
             
             if(k%2 != 0){
               
               System.out.print("*");
             }else{
               
               System.out.print(".");
             }
           }else if(j%2 == 0){
             
             if(k%2 != 0){
               
               System.out.print(".");
             }else{
               
               System.out.print("*");
             }
           }
         }
         System.out.println();
       }
     }
   }
 }
}