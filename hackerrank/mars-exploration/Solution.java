//https://www.hackerrank.com/challenges/mars-exploration [AC]
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int counter = 0;

        char[] sArr = s.toCharArray();

        for(int i=0; i<sArr.length; i=i+3) {

        	int misMatchCount = misMatch(s.substring(i, i+3));
        	if(misMatchCount > 0)
        		counter += misMatchCount;
        }

        System.out.println(counter); 
    }

    public static int misMatch(String x){

    	int countMismatch = 0;

    	if(x.charAt(0) != 'S'){
    		countMismatch++;
    	}

    	if(x.charAt(1) != 'O')
    		countMismatch++;

    	if(x.charAt(2) != 'S')
    		countMismatch++;

    	return countMismatch;
    }
}