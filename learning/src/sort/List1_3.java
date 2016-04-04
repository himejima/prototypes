package sort;

import java.util.Random;

/**
 * Created by himejima on 2016/04/02.
 * quick sort
 */
public class List1_3 {
    private static final int N = 10;
    private static int[] sort = new int[N];

    private static void quickSort(int bottom, int top, int[] data) {
        int lower, upper;
        if (bottom >= top) {
            return;
        }
        int div = data[bottom];
        for (lower = bottom, upper = top; lower < upper;) {
            while (lower <= upper && data[lower] <= div) {
                lower++;
            }
            while (lower <= upper && data[upper] > div) {
                upper--;
            }
            if (lower < upper) {
                int temp = data[lower];
                data[lower] = data[upper];
                data[upper] = temp;
            }
        }

        int temp = data[bottom];
        data[bottom] = data[upper];
        data[upper] = temp;

        quickSort(bottom, upper - 1, data);
        quickSort(upper + 1, top, data);
    }

    public static void main(String args[]) {
        Random random = new Random();
        System.out.println("そーと");
        for (int i = 0; i < N; i++) {
            sort[i] = random.nextInt(1000);
            System.out.print(sort[i] + " ");
        }
        System.out.println("\nそーと開始");
        quickSort(0, N - 1, sort);
        System.out.println("そーと終了");

        for (int i = 0; i < N; i++) {
            System.out.print(sort[i] + " ");
        }
    }
}
