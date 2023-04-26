import java.util.Scanner;

public class array_2d {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        System.out.println("Enter input for arrays");

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println("Enter value at position: " + i + "," + j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array printing: ");
        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <= 3; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }

    }

}
