package sort;

import java.util.Random;

/**
 * Created by himejima on 2016/04/03.
 */
public class List1_5 {
    private static final int N = 10;
    private static int[] sort = new int[N];

    private static void mergeSort(int n, int[] x, int offset) {
        if (n <= 1) {
            return;
        }
        int m = n / 2;

        mergeSort(m, x, offset);
        mergeSort(n - m, x, offset + m);

        int[] buffer = new int[m];
        for (int i = 0; i < m; i++) {
            buffer[i] = x[offset + i];
        }

        int j = m;
        int i = 0;
        int k = 0;
        while (i < m && j < n) {
            if (buffer[i] <= x[offset + j]) {
                x[offset + k++] = buffer[i++];
            } else {
                x[offset + k++] = x[offset + j++];
            }
        }

        while (i < m) {
            x[offset + k++] = buffer[i++];
        }
    }
    public static void main(String args[]) {
        Random random = new Random();
        System.out.println("そーと");
        for (int i = 0; i < N; i++) {
            sort[i] = random.nextInt(1000);
            System.out.print(sort[i] + " ");
        }
        System.out.println("\nマージそーと開始");
        mergeSort(N, sort, 0);
        System.out.println("そーと終了");

        for (int i = 0; i < N; i++) {
            System.out.print(sort[i] + " ");
        }
    }
}
