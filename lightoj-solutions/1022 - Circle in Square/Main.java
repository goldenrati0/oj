import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner ana = new Scanner(System.in);
    
    int testCase = ana.nextInt();
    
    for(int i=1; i<=testCase; i++){
      
      calculateAll(i);
    }
  }
  
  static void calculateAll(int i){
    
    Scanner ana2 = new Scanner(System.in);
    double r = ana2.nextDouble();
    double diameter = 2*r;
    double pi = 3.1415926535897932384626433832795;
    
    double areaOfSquare = Math.pow(diameter, 2);
    double areaOfCircle = (pi * (Math.pow(r, 2)));
    double areaOfShadedRegion = areaOfSquare - areaOfCircle;
    areaOfShadedRegion = areaOfShadedRegion + Math.pow(10, -9);
    
    System.out.printf("Case " + i + ": " + "%.2f\n", areaOfShadedRegion);
  }
}
