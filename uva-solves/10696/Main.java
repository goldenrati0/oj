import java.util.Scanner;

/**
 *
 * @author tahmid
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner ana = new Scanner(System.in);
        
        while(true) {
            
            int x = ana.nextInt();
            
            if(x == 0)
                break;
            
            int res = f91(x);
            
            System.out.println("f91(" + x + ") = " + res);
        }
    }
    
    private static int f91(int n) {
        
        if(n <= 100)
            return f91(f91(n+11));
        else
            return n - 10;
    }
}