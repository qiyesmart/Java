package refelect;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Author:QiyeSmart
 * Created:2019/5/5
 */
//反射和普通类案例
public class BeanOperation {

    public static void main(String[] args) {

        String line = "ename:Jack|job:SoftDev|skill:java,c++";
        Emp emp = new Emp();
        String[] attributes = line.split("\\|");
        for (String kv : attributes) {
            setXxx(emp, kv);
        }

        System.out.println(emp);
    }


    /**
     * @param object 进行赋值的对象
     * @param kv     属性和值   kv => k:v => k属性名称 v属性值
     */
    public static void setXxx(Object object, String kv) {
        //1.获取指定对象的Class对象
        Class classz = object.getClass();

        //2.解析kv
        String[] segments = kv.split(":");
        String attribute = segments[0];
        String attributeValue = segments[1];

        //3.setXxx方法的方法名称
        //set + 属性名的首字母大写
        String methodName = "set" +
                attribute.substring(0, 1).toUpperCase()
                + ((attribute.length() > 1) ? attribute.substring(1) : "");
        try {
            //4.通过反射获取setter方法
            Method method = classz.getDeclaredMethod(methodName, String.class);
            //5.通过method对象调用方法
            method.invoke(object, attributeValue);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}


class Emp {

    private String ename;
    private String job;
    private String skill;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}