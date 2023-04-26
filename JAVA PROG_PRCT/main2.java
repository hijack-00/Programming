import java.util.*;

public class main2 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int[][] arr1 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("pls enter for position: " + i + j);
                arr1[i][j] = obj.nextInt();
            }
        }

        System.out.println("Printing Array 1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

    }
}