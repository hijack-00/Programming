import java.util.*;

public class main3 {

    static int mult(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else {

            return a + mult(a, b - 1);
        }
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int n, m;

        System.out.println("Pls enter number for a: ");
        n = obj.nextInt();

        System.out.println("Pls enter number for b: ");
        m = obj.nextInt();

        int x = mult(n, m);

        System.out.println("Multiplication of " + n + " & " + m + " is: " + x);

    }

}
