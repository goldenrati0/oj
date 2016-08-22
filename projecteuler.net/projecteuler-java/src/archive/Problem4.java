package archive;

/**
 * Created by tahmid on 8/22/2016.
 */
public class Problem4 {

    public static void main(String[] args) {

        int highestPossible = 999*999;

        for (int i = highestPossible; i >=10000 ; i--) {

            if(isDivisible(i) && isNumberPalindrome(i)){
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean isDivisible(int num){

        for(int i=100; i<=999; i++){

            if((num%i == 0) && ((num/i) >=100 && (num/i)<=999)){
                return true;
            }
        }

        return false;
    }

    public static boolean isNumberPalindrome(int num){

        String x = String.valueOf(num);

        return x.equals(new StringBuilder(x).reverse().toString());
    }
}
