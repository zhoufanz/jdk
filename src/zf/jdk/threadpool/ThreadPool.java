package zf.jdk.threadpool;

import java.util.concurrent.*;

/**
 * Created by zf on 2017-02-25.
 */
public class ThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 100, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(5));
        for (int i = 0; i < 30; i++) {
            threadPoolExecutor.execute(new MyThrad(i));
            System.out.println("线程池中的线程数量为: "+threadPoolExecutor.getPoolSize());
            System.out.println("线程池中的活跃线程数量为: "+threadPoolExecutor.getActiveCount());
            System.out.println("线程池中的队列中待处理的线程数量为: "+threadPoolExecutor.getQueue().size());
            System.out.println("已经执行完的任务数为 "+threadPoolExecutor.getCompletedTaskCount());
        }
        System.out.println("线程池没有关闭");
        threadPoolExecutor.shutdown();
        System.out.println("线程池已经关闭");

    }

}
class MyThrad extends Thread{
    private int taskNum;

    public MyThrad(int num) {
        this.taskNum = num;
    }
    @Override
    public void run() {
        System.out.println("正在执行task "+taskNum);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
   /*     try {
            //Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("task "+taskNum+"执行完毕");
    }
}
