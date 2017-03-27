//https://www.hackerrank.com/challenges/java-biginteger/

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by tahmid on 3/27/2017.
 */
public class Solution {
    public static void main(String[] args) {

        Scanner ana = new Scanner(System.in);

        BigInteger a = new BigInteger(ana.nextLine());
        BigInteger b = new BigInteger(ana.nextLine());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
