import java.util.*;

public class main33 {

    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int x, res;

        System.out.println("Pls Enter value: ");
        x = obj.nextInt();

        res = fact(x);
        System.out.println("Factorial of " + x + " is: " + res);

    }

}
