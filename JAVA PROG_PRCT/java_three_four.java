import java.util.Scanner;

public class java_three_four {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter input for arrays");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter value at position: " + i + "," + j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array printing: ");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (i == j || i == 2) {
                    System.out.print(arr[i][j] + " ");

                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();

        }

    }

}