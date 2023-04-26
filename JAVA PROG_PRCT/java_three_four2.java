import java.util.Scanner;

public class java_three_four2 {

    public static void main(String[] args) {

        int i, j;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        for (i = 0, j = 7; i < j; i++, j--) {
            System.out.print(" " + arr[i]);
            System.out.print(" " + arr[j]);
        }
    }

}