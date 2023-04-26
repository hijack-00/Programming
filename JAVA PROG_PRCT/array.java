import java.util.Scanner;

public class array {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Hello");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter value at " + i + ": ");

            arr[i] = sc.nextInt();
            // System.out.println(arr);
        }

        System.out.println("Printing the Array");

        for (int i = 0; i < 5; i++) {
            // arr[i] = sc.nextInt();
            System.out.println("You entered value at " + i + ": ");

            System.out.println(arr[i]);
        }
    }

}
