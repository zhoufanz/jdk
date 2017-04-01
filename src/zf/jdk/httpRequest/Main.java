package zf.jdk.httpRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final HttpRequestor httpRequestor=new HttpRequestor();

        httpRequestor.setProxyHost("localhost");
        httpRequestor.setProxyPort(8081);

        final String url = "http://localhost:8081/rosefinch-baseTest-web/login/index.do";
        final Random random=new Random();
        for ( int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName() + "已经在跑了");
                        final Map<String, Object> paramMap = new HashMap();
                        paramMap.put("doLogin","true");
                        paramMap.put("loginName",random.nextInt(1000)+"");
                        paramMap.put("password",random.nextInt(1000)+"");
                        String s = httpRequestor.doPost(url, paramMap);
                        System.out.println(Thread.currentThread().hashCode());
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println(s);
                    } catch (Exception e) {
                        //e.printStackTrace();
                        System.out.println(e.getMessage());
                        System.out.println(Thread.currentThread().getName()+"异常了");
                    }
                }
            }).start();
        }
    }
}