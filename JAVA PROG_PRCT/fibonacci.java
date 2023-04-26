import java.util.Scanner;

public class fibonacci {

    Scanner obj = new Scanner(System.in);

    void fibo(int a, int b) {

        int c, i = 0;
        System.out.println("pls enter number: ");
        int x = obj.nextInt();
        System.out.print(a + " ");
        System.out.print(b + " ");

        while (i < x - 2) {
            c = a + b;

            System.out.print(c + " ");

            a = b;
            b = c;
            i++;
        }

    }

    public static void main(String[] args) {

        int x = 0, y = 1;

        fibonacci ob = new fibonacci();

        ob.fibo(x, y);

    }

}