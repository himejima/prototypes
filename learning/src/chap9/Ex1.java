package chap9;

/**
 * Created by himejima on 2016/03/23.
 */
public class Ex1 {
    public static void main(String[] args) {
        System.out.println(countStep(5));
    }

    public static int countStep(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        return countStep(n - 1) + countStep(n - 2) + countStep(n - 3);
    }
}
