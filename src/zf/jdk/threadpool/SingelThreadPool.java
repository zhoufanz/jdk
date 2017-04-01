package zf.jdk.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zf on 2017-02-22.
 */
public class SingelThreadPool {
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.execute(new MyThread());
        singleThreadExecutor.execute(new MyThread());
        singleThreadExecutor.shutdown();
    }
}
