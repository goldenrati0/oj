package archive;

import java.util.ArrayList;

public class Problem3 {

    public static void main(String[] args) {

        long x = 600851475143L;
        long y = x;
        long c = 2;
        long fact = 0;

        while (c * c <= y) {
            if (y % c == 0) {
                y = y / c;
                fact = c;
            } else {
                c++;
            }
        }

        if (y > fact) { // the remainder is a prime number
            fact = y;
        }

        System.out.println(fact);
    }
}
