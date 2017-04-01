package zf.jdk.thread.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * Created by zf on 2017-02-21.
 */
public class DeadLock {
    private final Object left = new Object();
    private final Object right=new Object();

    public void leftRIght() throws InterruptedException {
        synchronized (left) {
            System.out.println("已经把left锁住了");
            Thread.sleep(2000);
            System.out.println("在等待right");
            synchronized (right) {
                System.out.println("leftRight end!");
            }
        }
    }
    public void rightLeft() throws InterruptedException {
        synchronized (right) {
            System.out.println("已经把right锁住了");
            Thread.sleep(2000);
            System.out.println("在等待left");
            synchronized (left) {
                System.out.println("rightLeft end!");
            }
        }
    }
}
