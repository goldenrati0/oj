//https://www.hackerrank.com/contests/world-codesprint-5/challenges/string-construction

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static boolean[] isPresent = new boolean[128];
    
    public static void main(String[] args) {
        
        Scanner ana = new Scanner(System.in);
        int n = ana.nextInt();
        ana.nextLine();
        
        int totalCost = 0;
        
        
        for(int a0 = 0; a0 < n; a0++){
            
            String x = ana.nextLine();
            totalCost = 0;
                       
            makeZero(isPresent);
            
            for(int i=0; i<x.length(); i++){
                
                if(!isPresent[x.codePointAt(i)]){
                   
                    isPresent[x.codePointAt(i)] = true;
                    totalCost += 1;
                }        
            }
            
            System.out.println(totalCost);
        }
    }
    
    public static void makeZero(boolean[] ar){
        
        for(int i=0; i<ar.length; i++){
            
            ar[i] = false;
        }
    }
}