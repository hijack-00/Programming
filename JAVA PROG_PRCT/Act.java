public class Act {

    void swap(int x, int y) {
        int z;
        z = x;
        x = y;
        y = z;

        // System.out.println(x);
        // System.out.println(y);

    }

    public static void main(String[] args) {
        Act ob = new Act();

        int a = 12, b = 15, c;

        ob.swap(a, b);

        System.out.println(a);
        System.out.print(b);

    }
}
