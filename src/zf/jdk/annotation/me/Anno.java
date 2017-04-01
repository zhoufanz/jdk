package zf.jdk.annotation.me;

import java.util.Date;

/**
 * Created by zf on 2017-02-28.
 */
public class Anno {
    @FieldMeta(id=true,name="序列号",order=1)
    private int id;
    @FieldMeta(name="姓名",order=2)
    private String name;
    @FieldMeta(name="年龄",order=3)
    private int age;

    @FieldMeta(description = "描述",order=4)
    public String desc(){
        return "java反射获取annotation的测试";
    }


    private Date time=new Date();
    @FieldMeta()
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
