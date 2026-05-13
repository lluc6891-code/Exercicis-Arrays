
import java.util.Arrays;

public class Array_14 {

    public static void main(String[] args) {

        final int tamany = 10;

        int num[] = new int[tamany];

        Arrays.fill(num, 1);

        int num2[] = Arrays.copyOfRange(num, 2, 9);

        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }

    }

}
