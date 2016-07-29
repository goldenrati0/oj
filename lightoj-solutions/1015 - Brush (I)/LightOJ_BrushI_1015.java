import java.util.Scanner;
public class LightOJ_BrushI_1015{
  public static void main(String[] args){    
    int c, i, j, s, d;
    long t = 0;   
    Scanner a = new Scanner(System.in);  
    c = a.nextInt();
    i=1;
    while(i<=c){     
      t = 0;      
      s = a.nextInt();      
      for(j=0; j<s; j++){        
        d = a.nextInt();
        if(d>=0)
          t = t + d;        
      }      
      System.out.println("Case " + i +": " + t);
      i++;
    }
  }
}