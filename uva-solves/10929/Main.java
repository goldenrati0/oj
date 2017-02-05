import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author tahmid
 */
public class Main {

    public static void main(String[] args) {

        Scanner ana = new Scanner(System.in);
        BigInteger x;
        String s;
        
        while(true) {
            
            s = ana.nextLine();
            s = s.trim();
            System.out.print(s);
            if(s.equals("0"))
                break;
            
            while(s.charAt(0) == '0')
                s = s.substring(1);
            
            x = new BigInteger(s);
            
            if(x.remainder(new BigInteger("11")).equals(BigInteger.ZERO))
                System.out.println(" is a multiple of 11.");
            else
                System.out.println(" is not a multiple of 11.");
        }
    }
}