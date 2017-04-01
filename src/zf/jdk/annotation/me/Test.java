package zf.jdk.annotation.me;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by zf on 2017-02-28.
 */
public class Test {
    public static void main(String[] args) {
        Anno anno=new Anno();
        anno.setAge(1000);
        Class entity = anno.getClass();
        List<SortableField> list = new ArrayList();
        Field[] fields = entity.getDeclaredFields();

        for (Field f : fields) {
            FieldMeta meta = f.getAnnotation(FieldMeta.class);
            if (meta != null) {
                SortableField sf = new SortableField(meta, f);
                list.add(sf);
            }
        }

        Method[] methods = entity.getMethods();
        for (Method method : methods) {
            FieldMeta meta = method.getAnnotation(FieldMeta.class);
            if (meta != null) {
                SortableField sf = new SortableField(meta, method.getName(), method.getReturnType());
                list.add(sf);
            }
        }

        Collections.sort(list, new Comparator<SortableField>() {
            @Override
            public int compare(SortableField o1, SortableField o2) {
                return o1.getMeta().order() - o2.getMeta().order();
            }
        });



        for (SortableField l : list) {
            System.out.println("字段名称"+l.getName());
            System.out.println("字段类型"+l.getType());
            System.out.println("注解名称"+l.getMeta().name());
            System.out.println("注解序号"+l.getMeta().order());
            System.out.println("注解描述"+l.getMeta().description());
            System.out.println();
        }

    }

}
