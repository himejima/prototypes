package chap16;

/**
 * Created by himejima on 2016/03/21.
 */
public class MyClass extends Thread {
    private String name;
    private MyObject myObj;

    public MyClass(MyObject obj, String n) {
        name = n;
        myObj = obj;
    }

    public void run() {
        myObj.foo(name);
    }

    public static void main(String args[]) {
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        MyClass thread1 = new MyClass(obj1, "1");
        MyClass thread2 = new MyClass(obj2, "2");
        thread1.start();
        thread2.start();

        MyObject obj = new MyObject();
        MyClass thread3 = new MyClass(obj, "3");
        MyClass thread4 = new MyClass(obj, "4");
        thread3.start();
        thread4.start();
    }
}

class MyObject {
    public synchronized void foo(String name) {
        try {
            System.out.println("Thread " + name + ".foo(): starting");
            Thread.sleep(3000);
            System.out.println("Thread " + name + ".foo(): ending");
        } catch (InterruptedException exc) {
            System.out.println("Thread " + name + ": interrupted.");
        }
    }
}
