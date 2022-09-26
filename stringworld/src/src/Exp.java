import java.util.*;
public class Exp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int[] arr = new int[n];
            arr[0] = a + (int) (Math.pow(2, 0) * b);
            for (int j = 1; j < n; j++) {
                arr[j] = arr[j - 1] + (int) (Math.pow(2, j) * b);
            }
            for (int k = 0; k < arr.length; k++) {
                int var = arr[k];
                System.out.print(var + " ");
            }

        }
    }
}


