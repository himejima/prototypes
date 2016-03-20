package chap3;

/**
 * Created by himejima on 2016/03/19.
 */
public class Ex1 {
    public static void main(String[] args) {
        ArrayStack t = new ArrayStack();
        t.push(1, 3);
        t.push(1, 20);
        t.push(1, 5);

        t.pop(1);

        System.out.println(t.peek(1));
    }
}

class ArrayStack {
    Integer size = 100;
    Integer n = 3;
    Integer[] stacks = new Integer[n * size];
    Integer[] pointer = { -1, -2, -3 }; // stackのpointer

    void push(Integer stackNumber, Integer value)
    {
        // pointerから要素を取得
        int p = pointer[stackNumber - 1];
        // TODO: maxをoverしてないかのチェック

        if (p < 0) {
            // 初期値
            stacks[(stackNumber - 1) * size] = value;
            pointer[stackNumber - 1] = 0;
        } else {
            stacks[pointer[stackNumber - 1] + 1] = value;
            pointer[stackNumber - 1] = pointer[stackNumber - 1] + 1;
        }
    }

    public void pop(Integer stackNumber)
    {
        stacks[pointer[stackNumber - 1]] = null;
        pointer[stackNumber - 1] = pointer[stackNumber - 1] - 1;
    }

    public Integer peek(Integer stackNumber)
    {
        // TODO: stacksに要素があるかのチェック
        return stacks[pointer[stackNumber - 1]];
    }

}