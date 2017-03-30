package java_static_initializer_block;

import java.util.Scanner;

/**
 * Created by tahmid on 3/28/17.
 */
public class Solution {

    private static int B, H;
    private static boolean flag;

    static {

        Scanner ana = new Scanner(System.in);

        B = ana.nextInt();
        H = ana.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
