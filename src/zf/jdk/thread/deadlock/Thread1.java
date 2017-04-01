package zf.jdk.thread.deadlock;

/**
 * Created by zf on 2017-02-21.
 */
public class Thread1 extends Thread {
    private DeadLock deadLock;

    public Thread1(DeadLock deadLock) {
        this.deadLock = deadLock;
    }
    public void run(){
        try {
            deadLock.rightLeft();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
