import java.util.Scanner;

/**
 *
 * @author tahmid
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner ana = new Scanner(System.in);
        
        int x = ana.nextInt();
        int totalSteps = 0;
        int divisor = 5;
        
        while(x>0) {
            
            totalSteps = totalSteps + (x/divisor);
            x = x%divisor;
            --divisor;
        }
        
        System.out.println(totalSteps);
    }
    
}