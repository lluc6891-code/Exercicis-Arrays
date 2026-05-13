
import java.util.Arrays;

public class Array_16 {

    public static void main(String[] args) {

        final int tamany = 5;

        int num[] = new int[tamany];

        num[0] = 6;
        num[1] = 3;
        num[2] = 9;
        num[3] = 4;
        num[4] = 1;

        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }

}
