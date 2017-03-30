package java_currency_formatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by tahmid on 3/28/17.
 */
public class Solution {
    public static void main(String[] args) {

        Scanner ana = new Scanner(System.in);
        double payment = ana.nextDouble();

        Locale india = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaLocale = NumberFormat.getCurrencyInstance(india);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + indiaLocale.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
