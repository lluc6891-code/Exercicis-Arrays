
import java.util.Arrays;

public class Array_15 {

    public static void main(String[] args) {

        final int tamany = 10;

        int num1[] = new int[tamany];
        int num2[] = new int[tamany];

        EmplenarArray(num1, num2, 1, 5);

        if (Arrays.equals(num1, num2)) {
            System.out.println("Els arrays són iguals");
        } else {
            System.out.println("Els arrays no són iguals");
        }

    }

    public static void EmplenarArray(int[] num1, int[] num2, int a, int b) {
        for (int i = 0; i < num1.length; i++) {
            num1[i] = ((int) Math.floor(Math.random() * (a - b) + b));
        }
        for (int i = 0; i < num2.length; i++) {
            num2[i] = ((int) Math.floor(Math.random() * (a - b) + b));
        }
    }

}
