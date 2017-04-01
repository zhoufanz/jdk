package zf.jdk.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;


/**
 * Created by zf on 2017/2/13.
 */
public class MapTest {
    public static void main(String[] args) {

        HashMap<String, Object> map = new HashMap();

        Hashtable<String,Object> hashtable=new Hashtable();
        Vector vector = new Vector();
        vector.add("dss");
        vector.add("fdgfd");
        vector.remove("dss");
        for (Object o : vector) {
            System.out.println(o);
        }
    }
}
