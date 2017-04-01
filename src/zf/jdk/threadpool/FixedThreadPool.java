package zf.jdk.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zf on 2017-02-22.
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
        for(int i=0;i<10;i++) {
            newFixedThreadPool.execute(new MyThread());
        }
        newFixedThreadPool.shutdown();
    }
}

