package zf.jdk.threadpool;

import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zf on 2017-02-22.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for(int i=0;i<60;i++) {
            cachedThreadPool.execute(new MyThread());
        }
        cachedThreadPool.shutdown();
    }
}
