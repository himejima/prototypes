package chap5;

/**
 * Created by himejima on 2016/03/20.
 */
public class Example {
    public static void main(String[] args) {
        BitOperation b = new BitOperation();
        System.out.println(b.getBit(13, 1)); // false
        System.out.println(b.getBit(13, 2)); // true
        System.out.println(b.getBit(13, 3)); // true

        System.out.println(b.setBit(13, 1));
        System.out.println(b.clearBit(13, 3));
        System.out.println(b.updateBit(13, 1, 1));
    }
}

class BitOperation {
    boolean getBit(int num, int i) {
        return ((num & (1 << i)) != 0);
    }

    int setBit(int num, int i) {
        return num | (1 << i);
    }

    int clearBit(int num, int i) {
        int mask = ~(1 << i);
        return num & mask;
    }

    int updateBit(int num, int i, int v) {
        int mask = ~(1 << i);
        return (num & mask) | (v << i);
    }
}
