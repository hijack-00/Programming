import java.util.Scanner;

public class maths {

    static int add(int a, int b) {
        int res;

        res = a + b;

        return res;
    }

    static double add(double a, double b) {

        double res1;

        res1 = a + b;

        return res1;

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // System.out.println("pls enter value for a: ");
        // int a = obj.nextInt();

        // System.out.println("pls enter value for b: ");
        // int b = obj.nextInt();

        System.out.println("Result of addition of A and B is: " + add(5, 4));
        System.out.println("Result of addition of A and B is: " + add(4, 10));

    }
}