// import java.util.Scanner;

public class fist {
    public static void main(String[] args) {
        // Scanner obj = new Scanner(System.in);

        // System.out.println("Enter 1 to start: ");
        int fact = 0, i, j;

        for (i = 0; i <= 50; i++) {
            for (j = 0; j <= 50; j++) {
                if (i % j == 0)
                    fact++;

            }
            if (fact == 0 && i != 1)
                System.out.println(i);

            fact = 0;
        }
    }

    // while (a <= 100) {
    // if (a % 2 != 0) {
    // System.out.println(a + "is odd");
    // }
    // a++;
    // }

    // while (a <= 100) {
    // if (a % 2 == 0) {
    // System.out.println(a + " is Even");
    // }
    // a++;

    // }

    // switch (c) {
    // case 4:
    // System.out.println("Division of a & b is: " + (a / b));
    // break;

    // case 3:
    // System.out.println("Multiplication of a & b is: " + (a * b));
    // break;

    // case 2:
    // System.out.println("Subtraction of a & b is: " + (a - b));
    // break;

    // case 1:
    // System.out.println("Addition of a & b is: " + (a + b));
    // break;

    // default:
    // System.out.println("Error, Wrong Choice Selected");

    // }

    // if (c == 1) {
    // System.out.println("Addition of a & b is: " + (a + b));

    // } else if (c == 2) {
    // System.out.println("Subtraction of a & b is: " + (a - b));

    // } else if (c == 3) {
    // System.out.println("Multiplication of a & b is: " + (a * b));

    // } else if (c == 4) {
    // System.out.println("Division of a & b is: " + (a / b));

    // } else {
    // System.out.println("Error, Wrong Choice Selected");

    // }

}
