import java.util.Scanner;

/**
 *
 * @author tahmid
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner ana = new Scanner(System.in);
        
        int n = ana.nextInt();
        boolean luckySts = false;
        
        int[] allLuckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        
        for(int i=0; i<allLuckyNumbers.length; i++) {
            
            if(n%allLuckyNumbers[i] == 0) {
                luckySts = true;
                break;
            }
        }
        
        if(luckySts)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}