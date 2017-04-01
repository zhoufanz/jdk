package zf.jdk.collection;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by zf on 2017-03-07.
 */
public class CollectiionsTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(new Integer(i));
        }
        if (!CollectionUtils.isEmpty(list)) {
            Collections.reverse(list);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
