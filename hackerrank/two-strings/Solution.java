/*
 * https://www.hackerrank.com/challenges/two-strings
 * Status: Accepted
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner ana = new Scanner(System.in);
        
        int testCase = ana.nextInt();
        ana.nextLine();
        
        String x = "";
        String y = "";
        boolean isOk = false;
        
        while(testCase >0 ){
            
            x = ana.nextLine();
            y = ana.nextLine();
            isOk = false;
            
            for(char val : "abcdefghijklmnopqrstuvwxyz".toCharArray()){

                if(x.indexOf(val)>-1 && y.indexOf(val)>-1){

                    isOk = true;
                }
            }
            
            if(isOk)
                System.out.println("YES");
            else
                System.out.println("NO");

            testCase--;
        }
    }
}