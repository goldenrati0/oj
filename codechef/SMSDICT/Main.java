import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
 
/**
 *
 * @author tahmid
 */
public class Main {
 
    public static void main(String[] args) {
 
        Scanner ana = new Scanner(System.in);
 
        int totalWords = ana.nextInt();
        ana.nextLine();
 
        HashMap<Integer, Integer> keyCombinationCount = new HashMap<>();
 
        String temp = "";
        String keySequence = "";
 
        for (int i = 0; i < totalWords; i++) {
 
            temp = ana.nextLine();
 
            keySequence = "";
 
            for (int j = 0; j < temp.length(); j++) {
                keySequence += keyNumber(temp.charAt(j));
            }
 
            int tempKey = Integer.parseInt(keySequence);
 
            if (keyCombinationCount.containsKey(tempKey)) {
                int value = keyCombinationCount.remove(tempKey);
                keyCombinationCount.put(tempKey, ++value);
            } else {
                keyCombinationCount.put(tempKey, 1);
            }
        }
 
        List<Map.Entry<Integer, Integer>> combList = sortByValues(keyCombinationCount);
 
        Entry<Integer, Integer> fff = combList.get(0);
 
        System.out.println(fff.getKey());
 
    }
 
    private static int keyNumber(char c) {
 
        int num = 0;
 
        switch (c) {
 
            case 'a':
                num = 2;
                break;
            case 'b':
                num = 2;
                break;
            case 'c':
                num = 2;
                break;
 
            case 'd':
                num = 3;
                break;
            case 'e':
                num = 3;
                break;
            case 'f':
                num = 3;
                break;
 
            case 'g':
                num = 4;
                break;
            case 'h':
                num = 4;
                break;
            case 'i':
                num = 4;
                break;
 
            case 'j':
                num = 5;
                break;
            case 'k':
                num = 5;
                break;
            case 'l':
                num = 5;
                break;
 
            case 'm':
                num = 6;
                break;
            case 'n':
                num = 6;
                break;
            case 'o':
                num = 6;
                break;
 
            case 'p':
                num = 7;
                break;
            case 'q':
                num = 7;
                break;
            case 'r':
                num = 7;
                break;
            case 's':
                num = 7;
                break;
 
            case 't':
                num = 8;
                break;
            case 'u':
                num = 8;
                break;
            case 'v':
                num = 8;
                break;
 
            case 'w':
                num = 9;
                break;
            case 'x':
                num = 9;
                break;
            case 'y':
                num = 9;
                break;
            case 'z':
                num = 9;
                break;
        }
 
        return num;
    }
 
    private static List<Map.Entry<Integer, Integer>> sortByValues(HashMap<Integer, Integer> comb) {
 
        Set<Map.Entry<Integer, Integer>> set = comb.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(
                set);
        Collections.sort(list, (Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) -> o2.getValue().compareTo(o1.getValue()));
 
        return list;
    }
}