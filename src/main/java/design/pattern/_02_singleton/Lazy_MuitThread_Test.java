package design.pattern._02_singleton;

public class Lazy_MuitThread_Test {
    //测试多线程下的懒汉模式

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            _02_Lazy instance = _02_Lazy.getInstance();
            System.out.println(Thread.currentThread().getName() + " " + instance);
        });

        Thread t2 = new Thread(() -> {
            _02_Lazy instance = _02_Lazy.getInstance();
            System.out.println(Thread.currentThread().getName() + " " + instance);
        });

        t1.start();
        t2.start();
        System.out.println("End");
    }
}
