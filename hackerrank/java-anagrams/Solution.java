package java_anagrams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tahmid on 3/27/17.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    public static boolean isAnagram(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length())
            return false;
        else {

            List<Character> str1Characters = new ArrayList<>();
            List<Character> str2Characters = new ArrayList<>();
            for (int i = 0; i < str1.length(); i++) {
                str1Characters.add(str1.charAt(i));
                str2Characters.add(str2.charAt(i));
            }

            for (int i = 0; i < str1Characters.size(); i++) {
                Character temp = str1Characters.get(i);

                if (str2Characters.contains(temp))
                    str2Characters.remove(temp);
                else
                    return false;
            }

            if (str2Characters.size() == 0)
                return true;
            else
                return false;
        }
    }
}
