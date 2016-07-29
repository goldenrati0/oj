//https://www.hackerrank.com/challenges/diagonal-difference
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner ana = new Scanner(System.in);

        int len = ana.nextInt();
        ana.nextLine();

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int l = len-1;
        for(int k=0; k<len; k++) {

        	String[] x = ana.nextLine().split(" ");

        	primaryDiagonal += Integer.parseInt(x[k]);
        	secondaryDiagonal += Integer.parseInt(x[l]);
        	l--;
        }

        System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
    }
}