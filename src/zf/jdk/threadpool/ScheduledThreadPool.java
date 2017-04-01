package zf.jdk.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Created by zf on 2017-02-22.
 */
public class ScheduledThreadPool {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(10);
        for(int i=0;i<30;i++) {
            scheduledThreadPool.execute(new MyThread());
            Future<?> submit = scheduledThreadPool.submit(new MyThread());
            System.out.println(submit.get());
        }
        Thread.sleep(3000);
        scheduledThreadPool.shutdown();
    }
}
