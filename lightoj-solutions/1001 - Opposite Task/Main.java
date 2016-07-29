import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner ana = new Scanner(System.in);
    Random randGen = new Random();
    
    int caseNum = ana.nextInt();
    
    if(caseNum <=25){
      for(int i=1; i<=caseNum; i++){
        
        int totalProblem = ana.nextInt();
        
        if(totalProblem<=20 && totalProblem>=0){
          
          if(totalProblem<=10){
            int first = randGen.nextInt((totalProblem+1) - 0) + 0;
            int second = totalProblem - first;
            
            System.out.println(first+" "+second);
          }else{
            
            int first = totalProblem/2;
            int second = totalProblem - first;
            
            System.out.println(first+" "+second);
          }
        }
      }
    }
  }
}