package zf.jdk.replace;

/**
 * Created by zf on 2017-02-21.
 */
public class Test {
    public static void main(String[] args) {
        int num=10000;
        Thread myThread = new MyThread(num);
        myThread.start();

        for (int i=0;i<num;i++) {
            String percent = (i + 1) * 100 / num + "%";
            System.out.println(Thread.currentThread().getName()+"线程任务完成: "+percent);
        }
    }
}
