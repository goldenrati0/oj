package java_date_and_time;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by tahmid on 3/28/17.
 */
public class Solution {
    public static void main(String[] args) {

        Scanner ana = new Scanner(System.in);

        int month = ana.nextInt();
        int day = ana.nextInt();
        int year = ana.nextInt();

        LocalDate localDate = LocalDate.of(year, month, day);
        System.out.println(localDate.getDayOfWeek().toString());
    }
}
