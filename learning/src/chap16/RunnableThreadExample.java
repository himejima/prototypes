package chap16;


/**
 * Created by himejima on 2016/03/21.
 */
public class RunnableThreadExample implements Runnable {
    public int count = 0;

    public void run() {
        System.out.println("RunnableThread starting.");
        try {
            while (count < 5) {
                Thread.sleep(5000);
                count++;
            }
        } catch (InterruptedException exc) {
            System.out.println("RunnableThread interrupted.");
        }
        System.out.println("RunnableThread terminating.");
    }

    public static void main(String[] args) {
        RunnableThreadExample instance = new RunnableThreadExample();
        Thread thread = new Thread(instance);
        thread.start();

        while (instance.count != 5) {
            try {
                System.out.println("call sleep");
                System.out.println(instance.count);
                Thread.sleep(250);
                System.out.println("end sleep");
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
    }


}

