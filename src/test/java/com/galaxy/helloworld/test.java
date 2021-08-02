package com.galaxy.helloworld;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date
 */
public class test {


    public static void main(String args[]) {
        String className = "com.galaxy.helloworld.entity.monkey";

        try {
            Class clazz = Class.forName(className);

            //通过class对象获取构造/字段/方法
            //获取构造
            Constructor constructor = clazz.getConstructor(String.class, String.class);
            Object monkey = constructor.newInstance("kiki", "1");
            System.out.println(" monkey: " + monkey.toString());

            //获取字段
            Field age = clazz.getField("age");
            Field name = clazz.getField("name");
            age.setAccessible(true);
            name.setAccessible(true);
            age.set(monkey, "2");
            name.set(monkey, "LiLi");
            System.out.println(" monkey: " + monkey.toString());

            //获取方法
            Method method = clazz.getMethod("shout",String.class);
            Method[] methods = clazz.getMethods();
            System.out.println(method.invoke(monkey,"hello"));


        } catch (ClassNotFoundException e) {
            System.out.println("Error Class Not Found");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
