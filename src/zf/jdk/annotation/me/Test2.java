package zf.jdk.annotation.me;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zf on 2017-02-28.
 */
public class Test2 {
    public static void main(String[] args) {
        Anno anno=new Anno();
        try {
            Method declaredMethod = Class.forName("Anno").getDeclaredMethod("getTime");
            FieldMeta annotation = declaredMethod.getAnnotation(FieldMeta.class);
            String pattern = annotation.pattern();
            Object invoke = null;
            try {
                invoke = declaredMethod.invoke(anno, null);
                System.out.println(invoke);
                System.out.println();

                Date time= new SimpleDateFormat(pattern).parse(invoke.toString());
                System.out.println(time);

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(invoke);


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
