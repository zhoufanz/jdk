package zf.jdk.annotation;

import java.lang.annotation.*;

/**
 * Created by zf on 2017-02-28.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
@Documented
public @interface FieldMeta {
    boolean id() default false;

    String name() default "";
    boolean editable() default true;
    boolean summary() default true;
    String description() default "";
    int order() default 0;
}
