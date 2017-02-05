import java.util.Scanner;

/**
 *
 * @author tahmid
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner ana = new Scanner(System.in);
        
        long k = ana.nextLong();
        long n = ana.nextLong();
        long w = ana.nextLong();
        long loan = 0;
        
        long totalCost = 0;
        
        for(long i = 1; i<=w; i++) {
            
            totalCost += i * k;
        }
        
        loan = totalCost - n;
        
        if(loan < 0)
            System.out.println(0);
        else
            System.out.println(loan);
    }
}