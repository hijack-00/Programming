import java.util.Arrays;

public class arrayss {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 12, 4, 6, 15, 5, 7, 16, 14, 8 };

        Arrays.sort(arr);

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}
