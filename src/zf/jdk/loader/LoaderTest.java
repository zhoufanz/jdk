package zf.jdk.loader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zf on 2017-03-16.
 */
public class LoaderTest {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("aaa.txt");
        byte[] bytes=new byte[1024];
        while(resourceAsStream.read(bytes,0,bytes.length)!=-1){
            System.out.println(bytes);
        }
    }
}
