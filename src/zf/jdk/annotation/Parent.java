package zf.jdk.annotation;

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
public class Parent<T> {
    private Class<T> entity;
    public Parent(){
        init();
    }
    public List<SortableField> init(){
        List<SortableField> list = new ArrayList();

        entity= (Class<T>) ((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        if (this.entity!=null){
            Field[] fields = entity.getDeclaredFields();

            for(Field f:fields){
                FieldMeta meta = f.getAnnotation(FieldMeta.class);
                if (meta!=null){
                    SortableField sf = new SortableField(meta, f);
                    list.add(sf);
                }
            }

            Method[] methods = entity.getMethods();
            for (Method method : methods) {
                FieldMeta meta = method.getAnnotation(FieldMeta.class);
                if (meta!=null){
                    SortableField sf = new SortableField(meta, method.getName(), method.getReturnType());
                    list.add(sf);
                }
            }

            Collections.sort(list, new Comparator<SortableField>() {
                @Override
                public int compare(SortableField o1, SortableField o2) {
                    return o1.getMeta().order()-o2.getMeta().order();
                }
            });

        }
        return list;
    }
}
