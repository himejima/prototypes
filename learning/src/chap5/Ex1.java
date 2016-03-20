package chap5;

/**
 * Created by himejima on 2016/03/20.
 */
public class Ex1 {
    public static void main(String[] args) {
        int fromIndex = 2;
        int toIndex = 6;
        int insert = Integer.parseInt("10011",2);
        int target = Integer.parseInt("10000000000", 2);
        System.out.println(insert);
        System.out.println(insertBit(target, insert, fromIndex, toIndex));

        int target2 = Integer.parseInt("10001111111", 2);
        System.out.println(insertBit(target2, insert, fromIndex, toIndex));
    }

    public static int insertBit(int target, int after, int i, int v) {
        // i ~ vまでをclearする
        int mask = ~((1 << (v + 1)) - (1 << (v - i + 1)));
        int t = target & mask;
        System.out.println(t);

        return t | after;
    }
}
