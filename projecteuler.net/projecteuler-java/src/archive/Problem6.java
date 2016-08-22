package archive;

/**
 * Created by tahmid on 8/22/2016.
 */
public class Problem6 {

    public static void main(String[] args) {

        long sosq = 0;
        long sosum = 0;

        for (int i = 1; i <= 100 ; i++) {

            sosq += Math.pow(i, 2);
            sosum += i;
        }

        sosum = (long) Math.pow(sosum, 2);

        System.out.println(sosum - sosq);
    }
}
