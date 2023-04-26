
public class Hello {

    int sum(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    // static int fact(int c){

    // int n;

    // }

    public static void main(String args[]) {

        int x = 7, y = 8, z;

        Hello jp = new Hello();
        z = jp.sum(x, y);
        System.out.println(z);
    }

}
