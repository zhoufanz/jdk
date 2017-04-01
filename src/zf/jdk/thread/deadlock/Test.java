package zf.jdk.thread.deadlock;

/**
 * Created by zf on 2017-02-21.
 */
public class Test {
    public static void main(String[] args) {
        DeadLock deadLock=new DeadLock();
        Thread thread1=new Thread1(deadLock);
        Thread thread2 = new Thread(new Thread2(deadLock));
        thread1.start();
        thread2.start();
    }
}
