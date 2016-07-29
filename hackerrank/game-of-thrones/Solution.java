/*
 * https://www.hackerrank.com/challenges/game-of-thrones
 * Status: Accepted
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        
        ArrayList<Character> poof = new ArrayList<Character>();

        for(char val : inputString.toCharArray()){

        	if(poof.contains(val)){

        		poof.remove(poof.indexOf(val));
        	}else{

        		poof.add(val);
        	}
        }

        if(poof.size() <= 1)
        	System.out.println("YES");
        else
        	System.out.println("NO");
    }
}
