package sort;
import java.util.Random;

/**
 * Created by himejima on 2016/04/02.
 */
public class List1_1 {
    private static final int N = 10;
    private static int[] sort = new int[N];

    private static void bubbleSort() {
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < N - 1; i++) {
                if (sort[i] > sort[i + 1]) {
                    flag = true;
                    int j = sort[i];
                    sort[i] = sort[i + 1];
                    sort[i + 1] = j;
                }
            }
        } while (flag);
    }

    public static void main(String args[]) {
        Random random = new Random();
        System.out.println("そーと");
        for (int i = 0; i < N; i++) {
            sort[i] = random.nextInt(1000);
            System.out.print(sort[i] + " ");
        }
        System.out.println("\nそーと開始");
        bubbleSort();
        System.out.println("そーと終了");

        for (int i = 0; i < N; i++) {
            System.out.print(sort[i] + " ");
        }
    }

}
