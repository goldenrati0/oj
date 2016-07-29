import java.util.Scanner;

public class LightOJ_GreetingsFromLightOJ_1000{
  public static void main(String[] args){
    
    Scanner ana = new Scanner(System.in);
    
    int caseNum = ana.nextInt();
    
    for(int i=1; i<=caseNum; i++){
      
      int a = ana.nextInt();
      int b = ana.nextInt();
      
      System.out.println("Case "+i+": "+(a+b));
    }
  }
}