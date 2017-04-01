package zf.jdk.replace;

/**
 * Created by zf on 2017-02-21.
 */
public class MyThread extends Thread {
    private Integer num;

    public MyThread(Integer num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i=0;i<num;i++) {
            String percent = (i + 1) * 100 / num + "%";
            System.out.println(Thread.currentThread().getName()+" 线程任务完成:　"+percent);
        }
    }
}
