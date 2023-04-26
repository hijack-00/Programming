public class comb {

    static int fact(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    static int c(int n, int r) {
        int t1, t2, t3;
        t1 = fact(n);
        t2 = fact(r);
        t3 = fact(n - r);

        return t1 / (t2 * t3);
    }

    public static void main(String[] args) {

        int n;

        n = c(4, 2);

        System.out.println(n);

    }

}