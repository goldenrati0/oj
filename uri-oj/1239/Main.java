import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ana = new Scanner(System.in);
        while (ana.hasNext()) {
            System.out.println(htmlize(ana.nextLine()));
        }
    }

    private static String htmlize(String str) {
        int asterisk = 1;
        int underscore = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (asterisk == 1) {
                    str = str.replaceFirst("\\*", "<b>");
                    asterisk = 2;
                } else {
                    str = str.replaceFirst("\\*", "</b>");
                    asterisk = 1;
                }
            } else if (str.charAt(i) == '_') {
                if (underscore == 1) {
                    str = str.replaceFirst("_", "<i>");
                    underscore = 2;
                } else {
                    str = str.replaceFirst("_", "</i>");
                    underscore = 1;
                }
            }
        }
        return str;
    }
}