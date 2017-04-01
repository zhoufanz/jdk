package zf.jdk.thread.deadlock;

/**
 * Created by zf on 2017-02-21.
 */
public class Thread2 implements Runnable {
    private DeadLock deadLock;

    public Thread2(DeadLock deadLock) {
        this.deadLock = deadLock;
    }

    @Override
    public void run() {
        try {
            deadLock.leftRIght();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
