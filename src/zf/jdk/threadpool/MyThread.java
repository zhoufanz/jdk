package zf.jdk.threadpool;

/**
 * Created by zf on 2017-02-22.
 */
public  class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"正在执行");
        }
    }
