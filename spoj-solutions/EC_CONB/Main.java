import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[] n = new int[a.nextInt()];
        for (int i = 0; i < n.length; i++) {
            n[i] = a.nextInt();   
            if(n[i] % 2 == 0)
                n[i] = r(n[i]);
        }
        for(int v : n) {
            System.out.println(v);
        }
    }
    private static int r(int n) {
        StringBuilder s = new StringBuilder(Integer.toBinaryString(n)).reverse();
        return Integer.parseInt(s.toString(), 2);
    }
}