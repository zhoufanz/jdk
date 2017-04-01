package zf.jdk.synchronize;

/**
 * Created by zf on 2017-02-22.
 */
public class Counter {
    private static volatile Integer count =new Integer(0);

    static Object object = new Object();
    private static void count() throws InterruptedException {
        Thread.sleep(1);

        synchronized(object){

            count++;/*synchronized (object) {

        }*/
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Counter.count();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }


}
