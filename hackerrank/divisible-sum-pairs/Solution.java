//https://www.hackerrank.com/challenges/divisible-sum-pairs [AC]
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner ana = new Scanner(System.in);
        
        int n = ana.nextInt();
        int k = ana.nextInt();
        int ar[] = new int[n];
        
        for(int i=0; i < n; i++){
            ar[i] = ana.nextInt();
        }

        int counter = 0;

        for(int i=0; i<ar.length; i++){

        	for(int j=i+1; j<ar.length; j++){

        		if(i == j)
        			continue;
        		else{

        			if((ar[i] + ar[j]) % k == 0){

        				counter += 1;
        			}
        		}
        	}
        }

        System.out.println(counter);
    }
}
