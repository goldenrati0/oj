package info.tahmidchoyon.hackerrank.extra_long_factorials;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(new BigInteger(new Scanner(System.in).nextLine())).toString());
    }

    public static BigInteger factorial(BigInteger num) {
        return num.equals(BigInteger.ONE) ? BigInteger.ONE : num.multiply(factorial(num.subtract(BigInteger.ONE)));
    }
}
