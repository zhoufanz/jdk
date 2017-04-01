package zf.jdk.annotation;

import java.util.List;

/**
 * Created by zf on 2017-02-28.
 */
public class TestAnnotation {
    public static void main(String[] args) {
        Parent c = new Child();
        List<SortableField> list =c.init();

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
