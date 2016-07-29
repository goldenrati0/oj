import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    static int highest = 1;
    static int[] arr;    
    public static int gcd(int a, int b) {
        while(b!=0) {
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
    public static void checkH(int a, int b) {
        int x = gcd(a,b);
        if(x>highest)
            highest = x;
    }
    
    public static void check() {
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr.length; j++) {
                if(i==j)
                    continue;
                checkH(arr[i],arr[j]);
            }
        }
    }
    
    public static void main(String[] args){
        
        Scanner ana = new Scanner(System.in);
        
        int testCase = ana.nextInt();
        ana.nextLine();
        
        for(int k=0; k<testCase; k++){
            
            String x = ana.nextLine();
            int gcd = 0;
            
            ArrayList<Integer> poof = new ArrayList<Integer>();
            
            Scanner ana2 = new Scanner(x);
            
            while(ana2.hasNextInt()){
                
                poof.add(ana2.nextInt());
            }
            
            Object[] y = poof.toArray();
            
            int[] iAr = new int[y.length];
            
            for(int i=0; i<y.length; i++){
                
                iAr[i] = Integer.parseInt("" + y[i]);
            }
            
            Arrays.sort(iAr);
            arr= iAr;
            check();
            System.out.println(highest);
            highest = 1;
        }
        
        
    }
    
}