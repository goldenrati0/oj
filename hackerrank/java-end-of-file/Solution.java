package java_end_of_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tahmid on 3/28/17.
 */
public class Solution {
    public static void main(String[] args) {

        BufferedReader ana = new BufferedReader(new InputStreamReader(System.in));

        try {

            List<String> stringList = new ArrayList<>();
            String n = "";

            while((n = ana.readLine()) != null) {
                stringList.add(n);
            }

            int i = 1;
            for (String str:
                 stringList) {
                System.out.println(i + " " + str);
                i++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
